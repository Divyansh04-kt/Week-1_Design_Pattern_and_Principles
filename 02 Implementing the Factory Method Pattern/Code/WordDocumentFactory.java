package com.factory.design;

public class WordDocumentFactory extends DocumentFactory {
    
    public Document createDocument() {
        return new WordDocument();
    }
}
