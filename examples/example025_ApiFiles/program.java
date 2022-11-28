package examples.example025_ApiFiles;

import java.io.File;

public class program {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            if (f3.createNewFile()) {
                System.out.println("file.created");
            } else {
                System.out.println("file.existed");
            }
            System.out.println(f3.getAbsolutePath());
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
