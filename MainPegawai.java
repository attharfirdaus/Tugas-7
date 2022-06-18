package com.Polymorphism;

public class MainPegawai {
    public static void main(String[] args) {
        System.out.println("====================== PEGAWAI TETAP ======================");
        Pegawai pgwTetap1 = new PegawaiTetap("Atthar", "1234567", 50000);
        Pegawai pgwTetap2 = new PegawaiTetap("Hulk", "1234567", 45000);
        Pegawai pgwTetap3 = new PegawaiTetap("Steven", "1234567", 30000);
        System.out.println(pgwTetap1);
        System.out.println(pgwTetap2);
        System.out.println(pgwTetap3);

        System.out.println("====================== PEGAWAI HARIAN ======================");
        Pegawai pgwHarian1 = new PegawaiHarian("Baso", "2345678", 10000, 41);
        Pegawai pgwHarian2 = new PegawaiHarian("Becce", "2345678", 25000, 39);
        Pegawai pgwHarian3 = new PegawaiHarian("Ari", "2345678", 30000,45);
        System.out.println(pgwHarian1);
        System.out.println(pgwHarian2);
        System.out.println(pgwHarian3);

        System.out.println("====================== SALES ======================");
        Pegawai sales1 = new Sales("Putri", "3456789", 60, 60000);
        Pegawai sales2 = new Sales("Mona", "3456789", 55, 70000);
        Pegawai sales3 = new Sales("Fischl", "3456789", 40, 45000);
        System.out.println(sales1);
        System.out.println(sales2);
        System.out.println(sales3);
    }
}
