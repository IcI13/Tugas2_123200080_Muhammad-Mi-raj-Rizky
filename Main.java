/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int pengulangan =1;
        int pilih =4;
        int ulangi=5;
        while(pengulangan !=0){
            
            System.out.println("\n=========="
                + "\nMenu Utama"
                + "\n=========="
                + "\n1. Hitung Balok"
                + "\n2. Hitung Tabung"
                + "\n0. Exit");
            System.out.printf("Pilih: ");
            pilih = input.nextInt();
            switch(pilih){
                case 1 :
                    
                    float p,l,t;
                    System.out.printf("\nInput Panjang: ");
                    p = input.nextFloat();
                    System.out.print("\nInput Lebar: ");
                    l = input.nextFloat();
                    System.out.printf("\nInput Tinggi: ");
                    t = input.nextFloat();
                    Balok b = new Balok(p,l,t);
                    PersegiPanjang pp = new PersegiPanjang(p,l);
                    System.out.println("Luas Persegi Panjang= " + pp.luas());
                    System.out.println("Keliling Persegi Panjang= " + pp.keliling());
                    System.out.println("Volume Balok= " + b.volume());
                    System.out.println("Luas Permukaan Balok= " + b.luasPermukaan());
                    System.out.printf("Ulangi? (Ya: 1 || Tidak: 0)");
                    ulangi =input.nextInt();
                    pengulangan=ulangi;
                    break;
                
                case 2 : 
                    float j,ti;
                    System.out.printf("\nInput Jari-Jari: ");
                    j = input.nextFloat();
                    System.out.printf("\nInput Tinggi: ");
                    ti = input.nextFloat();
                    Lingkaran lingkaran = new Lingkaran(j);
                    Tabung tabung = new Tabung(j,ti);
                    System.out.println("Luas Lingkaran= " + lingkaran.luas());
                    System.out.println("Keliling Lingkaran= " + lingkaran.keliling());
                    System.out.println("Volume Tabung= " + tabung.volume());
                    System.out.println("Luas Permukaan Tabung= " + tabung.luasPermukaan());
                    System.out.printf("Ulangi? (Ya: 1 || Tidak: 0)");
                    ulangi =input.nextInt();
                    pengulangan=ulangi;
                    break;
                 
                case 0 :
                    pengulangan = 0;
                    break;
            }
        }
    }
    
}
