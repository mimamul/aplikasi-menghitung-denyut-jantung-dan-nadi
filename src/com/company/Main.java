package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("Masukkan Nama : ");
        String n = in.nextLine();
        System.out.println("Masukkan Umur : ");
        String m = in.nextLine();
        JantungNadi W = new JantungNadi(n, m);
        System.out.println("Anda Mau Cek Apa?? ");
        System.out.println("1. Jantung ");
        System.out.println("2. Nadi  ");
        int o = in.nextInt();
        switch (o) {
            case 1:
                W.DaftarCek();
                W.Cek();
                break;
            case 2:
                W.DaftarCek(2) ;
                W.Cek();
            default:
                System.out.println("INPUT ERRORRR.... !");
        }
    }
}
