package com.redblakccoffee.app.service;

import java.io.File;

public class FileReaderService{

    public File getFileByUrl(String url){
        return new File(url);
    }
}
