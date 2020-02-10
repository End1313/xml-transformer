package com.redblakccoffee.app.service;

import java.io.File;

public class FileReader {

    File getFileByUrl(String url){
        return new File(url);
    }
}
