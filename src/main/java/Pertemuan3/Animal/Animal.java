/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3.Animal;

/**
 *
 * @author ACER
 */
public class Animal {
    
    private String name;
    private int age;
    private String color;
    
    //Constructor
    public Animal() {}
    
    // alt + Fn + Insert constructor

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
    public void showProfile() {
        System.out.println("Name  :   " + name);
        System.out.println("Age   :   " + age + " yeras old ");
        System.out.println("Color :   " + color);
        
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}
