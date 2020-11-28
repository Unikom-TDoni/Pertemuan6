/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.master;

import id.tdoni.bangunruang.*;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung volume bangun datar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunRuang[] bangunRuangCollection = {
            new Bola(7),
            new Kerucut(14, 9),
            new Tabung(10, 21)
        };
        
        for (var bangunRuang : bangunRuangCollection) {
            tampilkanHasilPerhitunganVolume(bangunRuang);
        }
    }
    
    private static void tampilkanHasilPerhitunganVolume(BangunRuang bangunRuang) {
        System.out.printf("Volume %s = %.1f cm3\n",
                bangunRuang.getClass().getSimpleName(), 
                bangunRuang.getVolume());
    }
    
}
