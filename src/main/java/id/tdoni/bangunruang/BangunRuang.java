/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.bangunruang;

/**
 *
 * @author aris
 */
public abstract class BangunRuang {
    protected final float jariJari;
    
    public BangunRuang(float jariJari) {
        this.jariJari = jariJari;
    }
    
    public abstract double getVolume();
}
