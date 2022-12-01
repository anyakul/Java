// 16. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

package task016_RepeatStringInFile;

import java.io.FileWriter;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        String str = "test";
        int count = 100;
        WriteFile(str, count);
    }

    static void WriteFile(String str, int count) {
        Scanner FileScan = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("t.txt");
            for (int i = 0; i < count; i++) {
                fw.write(str);
                fw.append("\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        FileScan.close();
    }
}
