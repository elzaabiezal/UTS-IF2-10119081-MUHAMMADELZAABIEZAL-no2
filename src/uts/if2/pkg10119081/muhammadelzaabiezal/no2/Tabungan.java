/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119081.muhammadelzaabiezal.no2;

/**
 *
 * @author Elza Abiezal
 * Nama  : Muhammad Elza Abiezal
 * Kelas : IF-2
 * NIM   : 10119081
 */
public class Tabungan {
private int saldo;
  
   public Tabungan(int saldo){
       this.saldo = saldo;
   }
   
   public int ambilUang(int jumlah){
       return saldo - jumlah;
   }
    
    
}
