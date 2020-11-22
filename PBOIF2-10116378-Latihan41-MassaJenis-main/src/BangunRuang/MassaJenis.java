/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunRuang;

/**
 *
 *@author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi Program : Program untuk mencari massa jenis didalam bangun ruang kubus
 */

import BangunRuang.Kubus; // import class
public class MassaJenis {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(); // instance object
        
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        System.out.println("====Massa Jenis Kubus====");
        System.out.printf("Sisi : %d\n",kubus.getSisi());
        System.out.printf("Massa : %d\n\n",kubus.getMassa());
        
        System.out.println("====Hasil Perhitungan====");
        System.out.printf("Volume : %d\n", kubus.hitungVolume(kubus.getSisi()));
        System.out.printf("Massa Jenis : %d\n", kubus.hitungMassaJenis(kubus.getMassa(),kubus.hitungVolume(kubus.getSisi())));
    }
    
}
