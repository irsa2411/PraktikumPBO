/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author ACER
 */
public class Loop {
  
    public static void main(String[] args) {

//        ---FOR---
        for (int i = 0; i < 5; i++) {
            System.out.println("Looping.... (" + i + "/5");
        }
        System.out.println("For loop selesai! \n");
        
        int j=0;
        while(j<5) {
            System.out.println("Looping While.... (" + j + "/5");
            j++;
        }
        System.out.println("While loop selesai! \n");
        
//        ---Do While---
        int k=0;
        do {
            System.out.println("Looping Do-While.... (" + k + "/5");
            k++;
        }while(k<5);
        System.out.println("Do While loop selesai! \n");
        
//        ---Break---
        int a=1;
        while(a <= 100){
            System.out.println("Looping...( + q)");
        a+=10;
        
        if (a==50){
            System.out.println("Udah dulu, Capek NT mulu");
            break;
        }
        
    }
        System.out.println("Looping While Selesai!  \n");
    }
}
