package com.company;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	try {
        FileOutputStream file = new FileOutputStream("text.txt");
        System.out.println("Add some sentence to the file: ");
        Scanner input = new Scanner(System.in);
        var fileContent = input.nextLine();
        byte[] fileContentArray = fileContent.getBytes();
        file.write(fileContentArray);
        file.close();
        System.out.println("Sentence added successfully!");
    }
    catch (Exception e){
        System.out.println("Error!" + e);
    }
    }
}
