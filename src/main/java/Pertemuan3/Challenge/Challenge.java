/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3.Challenge;

/**
 *
 * @author ACER
 */
public class Challenge {
    private String name;
    private int visitorsToday;
    private int yearBuilt;

    public Challenge(String name, int visitorsToday, int yearBuilt) {
        this.name = name;
        this.visitorsToday = visitorsToday;
        this.yearBuilt = yearBuilt;
    }

    public void showProfile(){
        System.out.println("Name           : " + name);
        System.out.println("Visitors Today : " + visitorsToday);
        System.out.println("Year Built     : " + yearBuilt);
    }

    public String getName() {
        return name;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    
}
