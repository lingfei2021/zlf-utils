package com.zlf.utils.sparkjava.blog.handler;

import java.text.DecimalFormat;

public class FileSizeUtil {
    public static String toReadable(long size) {
        if (size <= 0) {
            return "0B";
        }
        if (size < 1024) {
            return size + "B";
        }
        String[] sizeUnits = new String[]{"B", "KiB", "MiB", "GiB", "TiB", "PiB"};
        int unitIndex = 0;
        long newSize = size;
        for (; unitIndex < sizeUnits.length - 1; unitIndex++) {
            size = size / 1024;
            if (size < 1000) {
                unitIndex++;
                break;
            } else {
                newSize = size;
            }
        }
        float result = newSize / 1024f;
        DecimalFormat df = new DecimalFormat("####.##");
        return df.format(result) + sizeUnits[unitIndex];
    }
}