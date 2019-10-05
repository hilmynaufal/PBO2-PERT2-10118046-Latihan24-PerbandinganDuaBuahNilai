/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert2.pkg10118046.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : membandingkan 2 buah nilai
 */
public class PBO2PERT210118046Latihan24PerbandinganDuaBuahNilai {

    /**
     */
    
    public static void bandingNilai() {
        System.out.println("======Program Perbandingan Nilai=======");
        System.out.print("Masukkan nilai pertama: ");
        Scanner scanner = new Scanner(System.in);
        int pertama = scanner.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        int kedua = scanner.nextInt();
        System.out.print("Hasil: ");
        if (pertama>kedua) System.out.println(pertama + " lebih besar dari " + kedua);
        else if (kedua>pertama) System.out.println(kedua + " lebih besar dari " + pertama);
        else System.out.println(pertama + " sama dengan " + kedua);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String ulang;
        do {
            bandingNilai();
            System.out.print("Ulangi aktivitas? Ya/Tidak: ");
            Scanner scanner = new Scanner(System.in);
            ulang = scanner.next();
            ulang = ulang.toLowerCase();
        } while (ulang.equals("ya"));
        
        
        

        System.out.println("Developed by: M. Hilmy Naufal");
    }

}
