/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Kendaraan;

/**
 *
 * @author ACER
 */
public class Kendaraan {
    
    //Attribute (variabel)
    String nama;
    int jmlRoda;
    
    //Method
    public void nyalakanMesin(){
        System.out.println("Mesin " + nama + "telah dinyalakan");
    }

    public void showProfile(){
        System.out.println("Nama     : " + nama);
        System.out.println("Jml Roda :" + jmlRoda);
        extraInfo(); 
        }
    //kosong karena, buat nyelipin
    public void extraInfo(){
    }
}
