/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan35OOTunjangan;

/**
 * Nama     : Fachrian harits Pratama
 * NIM      : 10117061
 * Kelas    : IF-2
 * Deskripsi program: Menampilkan menampilkan perhitungan tunjangan
 *                    berdasarkan objek orientasi
 */
public class tunjangan {

    public double tunjangan;
    public double gajiPkk;
    public String status;

    double hitungTunjangan() {

        tunjangan = (status.equals("menikah")) ? gajiPkk * 0.35 : 0;

        return tunjangan;
    }

    double hitungTotal() {

        return gajiPkk + tunjangan;
    }

}
