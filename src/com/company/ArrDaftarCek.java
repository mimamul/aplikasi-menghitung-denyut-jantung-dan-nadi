package com.company;

public class ArrDaftarCek {
    String kode;
    public ArrDaftarCek(String a){
        kode = a;
        ArrDaftarCek [] data = new ArrDaftarCek[25];
    }
    public void cetak(){
        System.out.println(kode);
    }
}
