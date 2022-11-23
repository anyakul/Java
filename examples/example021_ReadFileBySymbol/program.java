package examples.example021_ReadFileBySymbol;

import java.io.*;

public class program {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("examples/example021_ReadFileBySymbol/file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
        fr.close();
    }
}
