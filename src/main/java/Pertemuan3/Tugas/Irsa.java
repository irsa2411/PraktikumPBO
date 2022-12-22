/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3.Tugas;

/**
 *
 * @author ACER
 */
public class Irsa {
    
    private String name;
    private int tinggi;
    private double berat;
    private int umur;

    public Irsa(String name, int tinggi, double berat, int umur) {
        this.name = name;
        this.tinggi = tinggi;
        this.berat = berat;
        this.umur = umur;
    }
    
    public void tentangSaya(){
        System.out.println("Name              : " + name);
        System.out.println("Umur Saya         : " + umur + "Tahun");
        System.out.println("Tinggi Badan Saya : " + tinggi + "Cm");
        System.out.println("Berat Badan Saya  : " + berat + "Kg");
        System.out.println("");
    }

    public String getName() {
        return name;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public int getUmur() {
        return umur;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    
    
}
