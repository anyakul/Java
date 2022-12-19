package examples.example064_InterfaceFormatFiles.Interface;

import examples.example064_InterfaceFormatFiles.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
