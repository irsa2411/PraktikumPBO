package Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Masukan bilangan : ");
            int bilangan = input.nextInt();
            
            System.out.println("Masukan pembagi : ");
            int pembagi = input.nextInt();
            
            int hasil = bilangan / pembagi;
            
            System.out.println("Hasil pembagian (dibulatkan : " + hasil);
        }
        
        catch(ArithmeticException e){
            System.out.println("Bilangan Tidak Bisa Di Bagi 0 Kidzzz !!!");
        }
        
        catch(InputMismatchException e) {
            System.out.println("Harap Tidak Memasukkan Huruf ya !!!!");
        }
    }
}
