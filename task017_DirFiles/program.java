/* 17. Напишите метод, который вернет содержимое текущей папки в виде массива строк.
Напишите метод, который выведет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
https://metanit.com/java/tutorial/6.11.php */

package task017_DirFiles;

import java.io.FileWriter;
import java.io.File;
import java.util.Arrays;

public class program {
    public static void main(String[] args) {
        String[] res = GetFilesArr();
        System.out.println(Arrays.toString(res));
        WriteFile(res);
    }

    static String[] GetFilesArr() {
        String pathProject = System.getProperty("user.dir");
        File dir = new File(pathProject);
        String[] dir_list = new String[dir.list().length];
        try {
            dir_list = dir.list();
        } catch (Exception e) {
            System.out.println("Директория не найдена");
        }

        return dir_list;
    }

    static void WriteFile(String[] dirArr) {
        try {
            FileWriter fw = new FileWriter("t.txt");
            for (String item : dirArr) {
                fw.write(item);
                fw.append("\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
