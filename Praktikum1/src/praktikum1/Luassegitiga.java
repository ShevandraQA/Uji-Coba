package praktikum1;

import java.util.Scanner;

public class Luassegitiga {
    
    public static void main (String[] args) {
        // Deklarasi
        Double luas;
        int alas, tinggi;
        
        // Membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        //Input
        System.out.println ("== Program Hitung Luas Segitiga ==");
        System.out.print("Input alas");
        alas = baca.nextInt();
        System.out.print("input tinggi");
        tinggi = baca.nextInt();
        
        // Proses
        luas = Double.valueOf((alas * tinggi) / 2);
        
        // Output
        System.out.println("Luas = " + luas);
    }
}