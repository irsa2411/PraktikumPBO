package com.irsa.praktikumpbo;

import java.util.Scanner;


public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Membuat agar panjang array ditentukan input user
        System.out.println("---Program Input Berat Badan---");
        System.out.print("Masukan Jumlah Mahasiswa ");
        int jml = input.nextInt();
        System.out.println();
        
        //Membuat array baru dengan panjang sesuai input user
        String[] nama = new String [jml];
        int[] berat_badan = new int [jml];
        
         //Memasukan berat_badan ke array
        for(int i=0; i<jml; i++){
            System.out.print( "Masukkan nama " + ": ");
            nama[i] = input.next();
    }
        
        //Memasukan berat_badan ke array
        for(int i=0; i<jml; i++){
            System.out.print( "Masukkan nilai ke-" + (i+1) + ": ");
            berat_badan[i] = input.nextInt();
    }
        System.out.println();
        
        //Menampilkan semua berat_badan array
        System.out.println("---Daftar Mahasiswa serta Berat---");
        for(int i = 0; i< jml; i++){
            System.out.println(nama[i] + " memiliki berat badan : " +berat_badan[i]);
        }
    }
}
