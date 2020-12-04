/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119081.muhammadelzaabiezal.no2;

import java.util.Scanner;

/**
 *
 * @author Elza Abiezal
 * Nama  : Muhammad Elza Abiezal
 * Kelas : IF-2
 * NIM   : 10119081
 */
public class UTSIF210119081MUHAMMADELZAABIEZALNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int jumlahAmbil;
        
        //inisialisasi objek scanner
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        //inisialisasi objek tabungan
        Tabungan tabungan = new Tabungan(keyboard.nextInt());
        System.out.print("Jumlah Uang Yang Diambil : ");
        jumlahAmbil = tabungan.ambilUang(keyboard.nextInt());
        System.out.println("Saldo Anda Sekarang : " + jumlahAmbil);
    }
    
}
