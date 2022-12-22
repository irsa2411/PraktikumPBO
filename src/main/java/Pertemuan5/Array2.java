/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

public class Array2 {
    public static void main(String[] args) {
        //Pembuatan array
        String[] names = {
            "Kok iso yo?",
            "Karma",
            "Perlahan",
            "Ora Masalah",
            "Widodari"
        };
        
        //Cek panjang array
        System.out.println("Panjang Array: " + names.length);
        
        
        //Menampilkan  semua nilai array
        for(int i=0; i<names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
    }
}
