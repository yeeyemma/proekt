/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emakm
 */
public class LaptopTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Laptop comp1 = new Laptop();
        Laptop comp2 = new Laptop();
        Laptop comps = new Laptop();
       Laptop compp[]= new Laptop[2];
      // comps.FastestRam(comp1.setRam(input.nextDouble()), comp2.setRam(input.nextDouble()));
      // comp[1].setRam(8);
        int broi;
        System.out.println("Enter broi laptopi: ");
        broi=input.nextInt();
        Laptop arrLaptop[] = new Laptop[broi];
        System.out.println("enter cpu: ");
        arrLaptop[0].setCpu(input.next());
       /* for (int i = 0; i < arrLaptop.length; i++) {
            int size=rand.nextInt(20)+1;
            System.out.println("Enter cpu"+(i+1)+": ");
           arrLaptop[i].setCpu(input.next());
            System.out.println("Enter ram"+(i+1)+": ");
           arrLaptop[i].setRam(input.nextDouble());
            System.out.println("Enter hdd"+(i+1)+": ");
           arrLaptop[i].setHdd(input.nextDouble());
           arrLaptop[i].setDisplaySize(size);
            System.out.println("Laptop 1: "+arrLaptop[i].toString());
        }*/
        Laptop comp = new Laptop();
        System.out.println(comp.toString());
    }
    
    
}
