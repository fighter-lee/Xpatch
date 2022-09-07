package com.storm.wind.xpatch.task;

import com.storm.wind.xpatch.util.FileUtils;

import java.io.File;


public class SaveResTask implements Runnable {

    private final String unzipApkFilePath;
    private String dstFilePath;

    private final String ASSET_PATH = "res/layout/";

    public SaveResTask(String unzipApkFilePath) {
        this.unzipApkFilePath = unzipApkFilePath;
        this.dstFilePath = (unzipApkFilePath + ASSET_PATH).replace("/", File.separator);
    }

    @Override
    public void run() {
        ensureDstFileCreated();
        copyAssetFile();
    }

    private void ensureDstFileCreated() {
        File dstParentFile = new File(dstFilePath);
        if (!dstParentFile.getParentFile().exists()) {
            dstParentFile.getParentFile().mkdirs();
        }
        if (!dstParentFile.exists()) {
            dstParentFile.mkdirs();
        }
    }

    private void copyAssetFile() {
        FileUtils.copyFileFromJar("assets/res/activity_ztthemis.xml", dstFilePath + "activity_ztthemis.xml");
    }
}