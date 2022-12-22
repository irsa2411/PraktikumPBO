/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Kendaraan;

/**
 *
 * @author ACER
 */
public class Kapal extends Kendaraan{
     int maxKapasitas;
     int minKecepatan;
     
     public void Tujuan(String arah){
        System.out.println("Kapal " + nama + " Tujuan ke " + arah + " ! ");
    }
     
     public void Tujuan(){
        System.out.println("Error: Mohon masukkan arah!");
     }
     
     public void extraInfo(){ 
        System.out.println("Max Kapasitas : " + maxKapasitas);
        System.out.println("Min Kecepatan : " + minKecepatan + "Km/Detik");
     }
}
