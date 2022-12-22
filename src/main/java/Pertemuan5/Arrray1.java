/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Pertemuan5;

public class Arrray1 {

    public static void main(String[] args) {
        //Pembuatan array
        String[] names = new String [5];
        
        //Cek panjang array
        System.out.println("Panjang Array: " + names.length);
        
        //Memasukan Nilai Ke Array
        names[0] = "Klebus";
        names[1] = "Sebatas Teman";
        names[2] = "Korban Janji";
        names[3] = "Dalan Liyane";
        names[4] = "Menepi";
        
        //Menampilkan  semua nilai array
        for(int i=0; i<names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
    }
}
