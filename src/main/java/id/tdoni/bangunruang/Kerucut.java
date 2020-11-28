/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.bangunruang;

/**
 *
 * @author T Doni
 */
public final class Kerucut extends BangunRuang implements ILuasAlas {

    private final float tinggi;

    public Kerucut(float jariJari, float tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }
    
    @Override
    public double getVolume() {
        return 1/3d * getLuasAlas() * tinggi;
    }

    @Override
    public double getLuasAlas() {
        return Math.PI * Math.pow(jariJari, 2);
    }
}
