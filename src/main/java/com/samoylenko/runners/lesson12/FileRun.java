package com.samoylenko.runners.lesson12;

import java.io.File;

/**
 * Created by Sergioli on 4/21/17.
 */
public class FileRun {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        //String linuxStyle = "dir/somefile.txt";
        // File file = new File(currentDir, linuxStyle);
        // System.out.println(file.getAbsolutePath());

        String osName = System.getProperty("os.name");
        String testPropertiesLinuxStyle = "/src/test/resourcers/test.properties";
        String testPropertiesWindowsStyle = "src\\test\\resourcers\\test.properties";
        System.out.println(currentDir);
        System.out.println(osName);
        if (osName.toLowerCase().contains("win")) {
            File file = new File(currentDir, testPropertiesWindowsStyle);
            System.out.println(file.getAbsolutePath());
            //сделали буквы с маленькой и проверили символы
        }
        else  {
            File file = new File(currentDir, testPropertiesLinuxStyle);
            System.out.println(file.getAbsolutePath());

        }
    }
}
