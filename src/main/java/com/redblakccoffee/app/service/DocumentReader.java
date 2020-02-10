package com.redblakccoffee.app.service;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;

public class DocumentReader {

    Document getDocumentByFile(File file) throws DocumentException {
        return new SAXReader().read(file);
    }
}
