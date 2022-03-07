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
public class Balok implements MenghitungRuang {

    float panjang;
    float lebar;
    float tinggi;

    public Balok(float panjang, float lebar, float tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }
    
 
    
    @Override
    public float volume() {
      return panjang*lebar*tinggi;
    }

    @Override
    public float luasPermukaan() {
       return 2*((panjang*lebar)+(panjang+tinggi)+(tinggi*lebar));
    }
   
}

    
