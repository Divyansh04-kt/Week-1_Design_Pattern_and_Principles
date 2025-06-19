package com.factory.design;

//ExcelDocumentFactory.java
public class ExcelDocumentFactory extends DocumentFactory {

	public Document createDocument() {
     return new ExcelDocument();
 }
}
