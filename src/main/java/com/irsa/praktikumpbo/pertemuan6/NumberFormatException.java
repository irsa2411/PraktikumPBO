package com.irsa.praktikumpbo.pertemuan6;

public class NumberFormatException {
       public static void main(String[] args) {
        String inputString = "123.33";
        try{
            int a = Integer.parseInt(inputString);
        }catch(NumberFormatException e){
            System.out.println("String anda salah");

        }
    }
}
