package examples.example062_Inheriting.Ex007.Interface;

import examples.example062_Inheriting.Ex007.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
