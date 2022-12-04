/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ema_makarova
 */
public class KebapchetaObichamDaSiHapvamAz {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int dni;
        dni=rand.nextInt(20)+1;
        System.out.println("Count of days: "+dni);
        int kuftak[] = new int[dni];
        for (int i = 0; i <kuftak.length; i++) {
            kuftak[i]=rand.nextInt(10)+1;
            System.out.println("day "+(i+1)+": "+kuftak[i]+" kuftaka!");
        }
        int happyday=1, bigkuftak=1;
        for (int i = 0; i < kuftak.length-1; i++) {
            if(kuftak[i]%2==0&&kuftak[i+1]%2==0)
                
                if(kuftak[i]>bigkuftak)
                    happyday=i;
            bigkuftak=kuftak[i];     
        }
        System.out.println("Your happiest day is "+happyday+" with "+bigkuftak+" kebaps!");
    }
    
}
