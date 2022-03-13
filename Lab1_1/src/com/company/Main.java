package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("file1.txt");
            System.out.println("FileContents :");
            int f = file.read();
            while(f != -1) {
                System.out.print((char)f);
                f = file.read();
            }
            file.close();
        }
        catch (Exception e) {
            System.out.println("Error!" + e);
        }
    }
}