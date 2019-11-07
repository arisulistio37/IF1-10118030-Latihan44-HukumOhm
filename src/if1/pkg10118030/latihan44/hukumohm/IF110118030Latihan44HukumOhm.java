/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan44.hukumohm;

/**
 *
 * @author 
 * NAMA    : Ari Sulistio
 * KELAS   : IF-1
 * NIM     : 10118030
 * Deskripsi program : program ini berisi tentang hukum ohm
 */
public class IF110118030Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float kuatArus;
        float hambatan;
        
        Baterai btr = new Baterai();
        Baterai ohm = new Baterai(3,12);
        System.out.println("");
        System.out.println("Kuat Arus : " + ohm.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + ohm.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + ohm.hitungTegangan()+ " volt");
    }
    
}
