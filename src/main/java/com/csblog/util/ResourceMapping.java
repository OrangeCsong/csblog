package com.csblog.util;

import java.io.File;

public class ResourceMapping {

    private ResourceMapping(){}
    /**
     * 相当于http://47.106.148.234:89目录
     */
    public static String PREFIX = "http://47.106.148.234:89";
    public static String IMAGE = PREFIX + "/image";
    public static String PIC = PREFIX + "/pic";
    public static String VIDEO = PREFIX + "/video";
    public static String UPLOAD_IMAGE_PATH = File.separator + "usr" + File.separator+"local"+
            File.separator+"softhome"+File.separator+"nginx-1.8.0"+File.separator+"resource"+File.separator+"csblog"+File.separator;

    public static void main(String[] args) {
        System.out.println(ResourceMapping.UPLOAD_IMAGE_PATH);
    }
}