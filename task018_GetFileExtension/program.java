/* 18. Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
1 Расширение файла: txt
2 Расширение файла: pdf
3 Расширение файла: 
4 Расширение файла: jpg */

package task018_GetFileExtension;

import java.io.File;

public class program {
    public static void main(String[] args) {
        String[] arr = GetFilesArr();
        GetFilesExtensionArray(arr);
    }

    private static String getFileExtension(String str) {
        int index = str.indexOf('.');

        return index == -1 ? null : str.substring(index);
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

    static void GetFilesExtensionArray(String[] arr) {
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = getFileExtension(arr[i]);
            if (arr[i] != null) {
                System.out.println(count + " Расширение файла " + arr[i]);
                count++;
            }
        }
    }
}
