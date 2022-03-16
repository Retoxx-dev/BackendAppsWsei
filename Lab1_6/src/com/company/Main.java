package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("file1.txt");
            Scanner sc = new Scanner(f);
            int i = 1;
            while(sc.hasNextLine()){
                String[] tokens = sc.nextLine().split("\\\\n");
                for(String words : tokens) {
                    System.out.println(i + "." + " " + words);
                    i++;
                }
            }

        }
        catch (Exception e) {
            System.out.println("Error!" + e);
        }
    }
}