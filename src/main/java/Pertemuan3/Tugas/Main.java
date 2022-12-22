/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3.Tugas;

/**
 *
 * @author ACER
 */
public class Main {
    
    public static void main(String[] args) {
        Irsa saya = new Irsa("Irsa", 175, 75,18);
        Irsa kamu = new Irsa("Putri", 160, 47,19);
        
        saya.tentangSaya();
        kamu.tentangSaya();
        
        System.out.println("Berat badan saya(sebelum diet) : " + saya.getBerat());
        saya.setBerat(70);
        System.out.println("Berat badan saya(setelah diet) : " + saya.getBerat());
        
        System.out.println("\n");
        
        double massa = saya.getBerat() / ((saya.getTinggi() * 0.01) * (saya.getTinggi() * 0.01));
        
        System.out.println("Masa Tubuh Saya Adalah" + massa);
        
        System.out.println("\n");
        
        Test Hewan = new Test();
        System.out.println("Apakah hewan adalah  Objek  -> " + (Hewan instanceof Object));
        System.out.println("Apakah hewan adalah  Hewan  -> " + (Hewan instanceof Test));
        System.out.println("Apakah hewan adalah  Kucing -> " + (Hewan instanceof Kucing));
        System.out.println("=============================");
        
        Kucing Kucing = new Kucing();
        System.out.println("Apakah hewan adalah  Objek  -> " + (Kucing instanceof Object));
        System.out.println("Apakah hewan adalah  Hewan  -> " + (Kucing instanceof Test));
        System.out.println("Apakah hewan adalah  Kucing -> " + (Kucing instanceof Kucing));
        }
 }