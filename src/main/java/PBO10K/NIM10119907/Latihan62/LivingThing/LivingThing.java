/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan62.LivingThing;

/**
 *
 * @author T Doni
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath(String nama) {
        System.out.println(nama.concat(" Bernafas"));
    }
    
    public void eat(String nama) {
        System.out.println(nama.concat(" Makan"));
    }
}
