/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan63.Gradient;


/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung gradient
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat[] koordinatCollection = {
            new Koordinat(2,10,5,7),
            new Koordinat(5, 1, 3, 12)
        };
        
        for (var koordinat : koordinatCollection) {
            tampilkanHasilPerhitunganGradient(koordinat);
            System.out.println("\n");
        }
    }
    
    
    private static void tampilkanHasilPerhitunganGradient(Koordinat koordinat) {
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d) \n", 
                koordinat.getX1(), koordinat.getY1(),
                koordinat.getX2(), koordinat.getY2()
        );
        System.out.printf("memiliki gradien sebesar %d", koordinat.hitungGradien());
    }
}
