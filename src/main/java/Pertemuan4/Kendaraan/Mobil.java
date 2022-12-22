/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Kendaraan;

/**
 *
 * @author ACER
 */
public class Mobil extends Kendaraan{
    int maxGear;
    public void belok(String arah){
        System.out.println("Mobil " + nama + " belok ke " + arah + " ! ");
    }
    
    public void belok(){ //kalo parameter mau diisi jangan sama dengan yg sebelumnya
        System.out.println("Error: Mohon masukkan arah!");
    }
    
     public void extraInfo(){ 
         //akan menampilkan input/isi dari maxGear
        System.out.println("Max gear : " + maxGear);

    }
}
