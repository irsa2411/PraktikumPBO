package com.irsa.praktikumpbo.pertemuan6;

import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ParseException1 {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("MM, dd, yyyy");

        try {
            format.parse("11,24 , 2003");
        } catch (ParseException e) {
            System.err.println("ParseException caught!");
            e.printStackTrace();
        }
    }
}
