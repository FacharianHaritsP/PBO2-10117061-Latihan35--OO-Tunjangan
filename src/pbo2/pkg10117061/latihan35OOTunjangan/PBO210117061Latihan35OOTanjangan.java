/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan35OOTunjangan;

import java.util.Scanner;

/**
 * Nama     : Fachrian harits Pratama
 * NIM      : 10117061
 * Kelas    : IF-2
 * Deskripsi program: Menampilkan perhitungan tunjangan secara objek orientasi
 * 
 */
public class PBO210117061Latihan35OOTanjangan {

/**
 * @param args
 */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);
        tunjangan jembatan = new tunjangan();
        
        System.out.println("=======Program tunjangan gaji==========");
        System.out.print("Gaji pokok anda perbulan?\t: ");
        jembatan.gajiPkk = masuk.nextDouble();
        System.out.print("Status anda? (menikah/belum)?: ");
        jembatan.status = masuk.next();
        
        System.out.println("============Hasil perhitungan=============");
        System.out.println("Gaji pokok : " + jembatan.gajiPkk);
        System.out.println("Tunjangan : " + jembatan.hitungTunjangan());
        System.out.println("total gaji : " + jembatan.hitungTotal() );    
    }

}
