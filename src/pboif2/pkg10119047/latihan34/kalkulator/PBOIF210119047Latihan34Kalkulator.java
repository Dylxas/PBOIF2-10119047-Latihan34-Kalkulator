/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan34.kalkulator;
import data.Kalkulator;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM KALKULATOR
 */

public class PBOIF210119047Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kalkulator kalkulator = new Kalkulator();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1 = input.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = input.nextDouble();
        
        System.out.println("");
        System.out.println("Hasil Pertambahan : " + kalkulator.tambahBilangan());
        
        System.out.println("Hasil Pengurangan : " + kalkulator.kurangBilangan());
        
        System.out.println("Hasil Perkalian : " + kalkulator.kaliBilangan());
        
        System.out.println("Hasil Pembagian : " + kalkulator.bagiBilangan());
        
        System.out.println("Hasil Sisa : " + kalkulator.sisaBilangan());
    }
    
}
