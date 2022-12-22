/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Kendaraan.Tugas;

/**
 *
 * @author ACER
 */
public class Buah {
    
    String nama;
    String rasa;
    
    public void Buah(){
        System.out.println("Matang " + nama + " Telah Matang!");
    }
    
    public void showInfo(){
        System.out.println("Nama              : " + nama);
        System.out.println("Memiliki Rasa     : " + rasa);
        extraInfo(); 
        }
    
    public void extraInfo(){
    }
}
