package com.Polymorphism;

public class Sales extends Pegawai{

    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double gaji(){
        return getKomisi() * getPenjualan();
    }

    public String toString(){
        return String.format("%s\nJenis\t\t\t : Sales\nTotal Penjualan\t : %d\nBesaran Komisi\t : Rp %.1f\nPendapatan\t\t : Rp %d\n", super.toString(), getPenjualan(), getKomisi(), (int)gaji());
    }
}
