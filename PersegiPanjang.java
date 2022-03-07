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
public class PersegiPanjang implements MenghitungBidang {
    float panjang;
    float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
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
    
   
    @Override
    public float luas() {
        return panjang*lebar;
    }

    @Override
    public float keliling() {
        return 2*(panjang+lebar);
    }
    
}
