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
public final class Bola extends BangunRuang {

    public Bola(float jariJari) {
        super(jariJari);
    }

    @Override
    public double getVolume() {
        return 4/3d * Math.PI * Math.pow(jariJari, 3);
    }
}
