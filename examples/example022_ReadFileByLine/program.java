package examples.example022_ReadFileByLine;
import java.io.*;

public class program {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("examples/example021_ReadFileByLine/file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
