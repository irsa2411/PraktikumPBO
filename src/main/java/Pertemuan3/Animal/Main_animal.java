/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3.Animal;

import Pertemuan3.Animal.Animal;

/**
 *
 * @author ACER
 */
public class Main_animal {
    
    public static void main(String[] args) {
        // Membuat object dari class Animal
        Animal cat = new Animal("Cimeng", 1, "Oyen");
        Animal dog = new Animal("Koen", 2, "Black and White");
        Animal rabbit = new Animal("Bigetron", 1, "White");
        Animal shark = new Animal("Amel", 10, "Blue Navi");
        Animal dolphin = new Animal ("Sasa", 2,"Aqua");
        

        // Memanggil method
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        shark.showProfile();
        dolphin.showProfile();
        
        System.out.println("Dog's name (before) :" +dog.getName());
        dog.setName("Kamu");
        System.out.println("Dog's name (after) :" +dog.getName());
    }
}