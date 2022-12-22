/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3.Challenge;

/**
 *
 * @author ACER
 */
public class Main_challenge {
    
    public static void main(String[] args) {
        //Pembuatan class 
        Challenge irsa = new Challenge("Irsa",7,2003);
        Challenge alfa = new Challenge("Alfa",9,2002);
        Challenge putri = new Challenge("Putri",5,2003);
    
        //Memanggil method showProfile()masing-maisng object
        irsa.showProfile();
        alfa.showProfile();
        putri.showProfile();
        
        System.out.println("Irsa name (before): " + irsa.getName());
        irsa.setName("Lanz");
        System.out.println("Irsa name (after): " +irsa.getName());
    }
}
