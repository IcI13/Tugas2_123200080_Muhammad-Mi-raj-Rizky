/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author D15kY
 */
public class Lingkaran implements MenghitungBidang{
    
    float jari;

    public Lingkaran(float jari) {
        this.jari = jari;
    }

    public float getJari() {
        return jari;
    }

    public void setJari(float jari) {
        this.jari = jari;
    }
    
    
    @Override
    public float luas() {
        return (float) (3.14*jari*jari);
    }

    @Override
    public float keliling() {
       return (float) (2*3.14*jari);
    }

   
}
