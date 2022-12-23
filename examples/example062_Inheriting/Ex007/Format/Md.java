package examples.example062_Inheriting.Ex007.Format;

import java.io.FileWriter;
import java.io.IOException;

import examples.example062_Inheriting.Ex007.Document.TextDocument;

public class Md extends TextFormat {
    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".md", false)) {
            writer.write("## <Md Format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
