package com.company;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



public class Main {

    public static void main(String[] args) {
        DateTimeFormatter Format = DateTimeFormatter.ofPattern("HH:mm:ss");


        LocalTime localtime = LocalTime.now();
        System.out.println("Local time: "+ Format.format(localtime));

        LocalTime utctime = LocalTime.now(ZoneId.of("UTC"));
        System.out.println("Global (UTC) time: " + Format.format(utctime));
    }
}
