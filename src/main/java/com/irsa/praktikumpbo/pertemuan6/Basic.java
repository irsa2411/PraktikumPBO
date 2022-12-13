package com.irsa.praktikumpbo.pertemuan6;

public class Basic {
    public static void main(String[] args) {
        //Membuat Array isi 3
        int[]myNumbers = {1, 2 ,3};
        
        //uji coba print nilai arraay index ke-10
        try {
            System.out.println(myNumbers[10]);
        }
        
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Tidak Sebesar Itu Dek !!!");
            
        }
    }
}
