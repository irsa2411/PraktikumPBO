/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Kendaraan;

/**
 *
 * @author ACER
 */
public class Main {
    
    public static void main(String[] args) {
        //pembuatan object
        //Class object = new Class()
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        Kapal kp = new Kapal();
        
        mb.nama = "Tesla";
        mb.jmlRoda = 4;
        mb.maxGear = 10;
        
        kp.nama = "Tetanic";
        kp.jmlRoda = 0;
        kp.maxKapasitas = 1200;
        kp.minKecepatan = 10;
        
        kn.nama = "Turbo";
        kn.jmlRoda = 8;
        
        mb.showProfile();
        mb.belok("Tengah");
        mb.belok();
        
        kp.showProfile();
        kp.Tujuan("Labuan Bajo");
        
        kn.showProfile();
    }
}
