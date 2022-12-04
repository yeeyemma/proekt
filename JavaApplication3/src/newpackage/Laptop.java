/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author emakm
 */
public class Laptop {
    private String cpu;
    private double ram;
    private double hdd;
    private double displaySize;
    public void setCpu(String cpu){
        if(cpu!="")
            this.cpu=cpu;
    }
    public String getCpu(){
        return cpu;
    }
    public void setRam(double ram){
        if(ram>0)
            this.ram=ram;
    }
    public double getRam(){
        return ram;
    }
    public void setHdd(double hdd){
        if(hdd>0)
            this.hdd=hdd;
    }
    public double getHdd(){
        return hdd;
    }
    public void setDisplaySize(double displaySize){
        if(displaySize>0)
            this.displaySize=displaySize;
    }
    public String toString(){
        return String.format("%s: ram-%.2f hdd-%.2f displaySize-%.2f", cpu, ram, hdd, displaySize);
    }
    public void FastestRam(Laptop obj[]){
        System.out.print("This laptop has the fastest ram: ");
        if(obj[0].getRam()>obj[1].getRam()){
            System.out.println(obj[0].toString());
        }
        else
            System.out.println(obj[1].toString());
    }
    public Laptop(){//po podrazbirane
        cpu="Apple";
        ram=8.0;
        hdd=1024.0;
        displaySize=16.0;
    }
    public Laptop(String cpu, double ram, double hdd, double displaySize){// za obshto polzvane
        this.cpu=cpu;
        this.ram=ram;
        this.hdd=hdd;
        this.displaySize=displaySize;
    }
    public Laptop(Laptop obj){// za kopirane
        cpu=obj.cpu;
        ram=obj.ram;
        hdd=obj.hdd;
        displaySize=obj.displaySize;
    }
    public void info(Laptop arrLaptop[]){
        for (int i = 0; i < arrLaptop.length; i++) {
            System.out.println(arrLaptop.toString());
        }
        
    }
}


