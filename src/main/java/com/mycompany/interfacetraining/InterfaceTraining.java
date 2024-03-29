/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacetraining;

import java.util.*;
/**
 *
 * @author Asus
 */
public class InterfaceTraining {

    public static void main(String[] args) {
        
        // membuat objek HP
        Phone pocoX3 = new Poco();

        // membuat objek user
        PhoneUser zidane = new PhoneUser(pocoX3);

        // kita coba nyalakan HP-nya
        zidane.turnOnThePhone();
        
        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi; 

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                zidane.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                zidane.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                zidane.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                zidane.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }
}
