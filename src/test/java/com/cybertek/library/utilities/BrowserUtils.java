package com.cybertek.library.utilities;

public class BrowserUtils {


    public static void sleep(int second){
        second*=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Something happening in BrowserUtils class ");
        }
    }
}
