package examples.example062_Inheriting.Ex006.Interface;

import examples.example062_Inheriting.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
