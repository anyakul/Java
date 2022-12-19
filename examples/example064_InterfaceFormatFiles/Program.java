package examples.example064_InterfaceFormatFiles;

import examples.example064_InterfaceFormatFiles.Applications.Notepad;
import examples.example064_InterfaceFormatFiles.Format.*;

public class Program {
    public static void main(String[] args) {

        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());

    }
}
