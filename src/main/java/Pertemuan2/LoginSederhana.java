/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class LoginSederhana {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int log = 0;
        i = 1;
        String username, password;
        do{
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("||     Masukin Akun      ||");
            System.out.println("---------------------------");
            System.out.print("\nUsername : ");
            username = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();
            
            if(username.equals("kireita")&&password.equals("huhu")){
                System.out.println("\nSelamat Anda Berhasil Masuk...\n");
                i =4;
                log = 1;
            }else{
                System.out.println("\n-Maaf Anda Gagal Masuk-\n");
                i = i + 1;
            }
        }while(i <= 3);
        if(log != 1){
            System.out.println("---Anda Telah 3x Gagal Masuk---");
            System.out.println("--Mohon MAaf Anda Kami Blokir--");
        }
    }
}
