package io.hedwig.dp.behavioral.modelviewpresenter;


import org.dbunit.util.FileHelper;

import java.io.File;
import java.io.IOException;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class FileLoader {
    private boolean loaded = false;
    private String fileName ;


    public String loadData(){

        try {
            return FileHelper.readLines(new File(fileName)).toString();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isLoaded() {
        return loaded;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean fileExists() {
        return new File(this.fileName).exists();
    }
}
