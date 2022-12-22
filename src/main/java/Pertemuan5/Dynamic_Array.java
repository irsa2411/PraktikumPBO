/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

import java.util.Scanner;


public class Dynamic_Array {
    public static void main(String[] args) {
        //Deklarasi Scanner utk user input nanti
        Scanner input = new Scanner(System.in);
        //Membuat agar panjang array ditentukan input user
        System.out.println("---Program Input Nilai---");
        System.out.print("Masukan Jumlah Matkul");
        int jml = input.nextInt();
        System.out.println();
        
        //Membuat array baru dengan panjang sesuai input user
        int[] nilai = new int [jml];
        
        //Memasukan nilai ke array
        for(int i=0; i<jml; i++){
            System.out.print( "Masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
    }
        System.out.println();
        
        //Menampilkan semua nilai array
        System.out.println("---Daftar Nilai---");
        for(int i = 0; i< jml; i++){
            System.out.println(i + ": " +nilai[i]);
        }
        
        //mencari rata2
        float total = 0;
        float rata2;
        
        for(int i=0; i<jml; i++){
            total = total+nilai[i];
        }
        rata2 = total/jml ;
        
        System.out.println("Rata-rata nilai adalah " + rata2);
    }
}
