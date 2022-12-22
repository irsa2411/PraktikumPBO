/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Kendaraan.Tugas;

/**
 *
 * @author ACER
 */
public class Main {
    
    public static void main(String[] args) {
        
        Mangga mg = new Mangga();
        Buah pisang = new Buah();
        
        mg.musim = "Akhir Tahun";
        
        mg.nama = "Arumanis";
        mg.rasa = "Manis";
        
        mg.showInfo();
        mg.berbiji("berbiji tunggal");
        mg.extraInfo();
    }
}
