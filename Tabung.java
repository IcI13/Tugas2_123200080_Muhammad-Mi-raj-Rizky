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
public class Tabung implements MenghitungRuang {
    float jari;
    float tinggi;

    public Tabung(float jari, float tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public float getJari() {
        return jari;
    }

    public void setJari(float jari) {
        this.jari = jari;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }
    
  
    @Override
    public float volume() {
        return (float) (3.14*jari*jari*tinggi);
    }

    @Override
    public float luasPermukaan() {
        return (float) (3.14*jari*(jari+tinggi));
    }
    
}
