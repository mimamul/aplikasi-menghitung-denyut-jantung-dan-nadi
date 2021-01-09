package com.company;

import java.util.Scanner;

public class JantungNadi {
    String nama;
    String umur;
    int a, b;

    public JantungNadi(String nama) {
        this.nama = nama;
    }

    public JantungNadi(String nama, String umur) {
        this.nama = nama;
        this.umur = umur;
    }

    Scanner in = new Scanner(System.in);
    ArrDaftarCek[] P = new ArrDaftarCek[25];

    public void DaftarCek() {
        System.out.println("============== JANTUNG ============");
        System.out.println("1. 1-12 Bulan = 100-180 Detak");
        System.out.println("2. 1-3 Tahun = 80-160 Detak");
        System.out.println("3. 3-6 Tahun = 80-130 Detak");
        System.out.println("4. 6-12 Tahun = 65-100 Detak");
        System.out.println("5. 12-18 Tahun = 60-90 Detak");
        System.out.println("6. 18-69 Tahun = 60-100 Detak");
        System.out.println("7. > 70 Tahun = 60-100 Detak");
        System.out.println("99. CHEEK OUT..... !!!");
    }

    public void DaftarCek(int a) {
        System.out.println("=============== NADI =============");
        System.out.println("8. 0-1 Bulan = 70-190 Denyut");
        System.out.println("9. 1-12 Bulan = 80-160 Denyut");
        System.out.println("10. 1-3 Tahun = 80-130 Denyut");
        System.out.println("11. 3-5 Tahun = 80-120 Denyut");
        System.out.println("12. 5-7 Tahun = 75-115 Denyut");
        System.out.println("13. 7-9 Tahun = 70-110 Denyut");
        System.out.println("14. > 10 Tahun = 60-100 Denyut");
        System.out.println("99. CHEEK OUT..... !!!");
    }

    public void Cek() {
        int e = 99;
        do {
            System.out.println("MASUKKAN PILIHA ANDA : ");
            switch (e) {
                case 1:
                    System.out.println("Banyak Detak yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek(" 1-12 Bulan = 100-180 Detak " + a);
                    break;
                case 2:
                    System.out.println("Banyak Detak yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek(" 1-3 Tahun = 80-160 Detak " + a);
                    break;
                case 3:
                    System.out.println("Banyak Detak yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek(" 3-6 Tahun = 80-130 Detak " + a);
                    break;
                case 4:
                    System.out.println("Banyak Detak yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek("6-12 Tahun = 65-100 Detak" + a);
                    break;
                case 5:
                    System.out.println("Banyak Detak yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek("12-18 Tahun = 60-90 Detak" + a);
                    break;
                case 6:
                    System.out.println("Banyak Detak yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek("18-69 Tahun = 60-100 Detak" + a);
                    break;
                case 7:
                    System.out.println("Banyak Detak yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek("> 70 Tahun = 60-100 Detak" + a);
                    break;
                case 8:
                    System.out.println("Banyak Denyut yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek(" 0-1 Bulan = 70-190 Denyut " + a);
                    break;
                case 9:
                    System.out.println("Banyak Denyut yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek("1-12 Bulan = 80-160 Denyut " + a);
                    break;
                case 10:
                    System.out.println("Banyak Denyut yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek("1-3 Tahun = 80-130 Denyut " + a);
                    break;
                case 11:
                    System.out.println("Banyak Denyut yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek("3-5 Tahun = 80-120 Denyut " + a);
                    break;
                case 12:
                    System.out.println("Banyak Denyut yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek("5-7 Tahun = 75-115 Denyut " + a);
                    break;
                case 13:
                    System.out.println("Banyak Denyut yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek("7-9 Tahun = 70-110 Denyut " + a);
                    break;
                case 14:
                    System.out.println("Banyak Denyut yang di rasa : ");
                    a = in.nextInt();
                    System.out.println("Berhasil di tambahkan : ");
                    b++;
                    P[b] = new ArrDaftarCek("10 > Tahun = 60-100 Denyut" + a);
                    break;
                case 99:
                    System.out.println("CHECK OUT.....");
                    break;
                default:
                    System.out.println("ERROR.......!");
                    break;
            }
        } while (e != 99);
    }
}
