package com.redblakccoffee.app.service;

import org.dom4j.Document;
import org.dom4j.Element;


public class TagService {

    public Document addTag(Document document){
        Element elements = document.getRootElement();
        return document;
    }
}
