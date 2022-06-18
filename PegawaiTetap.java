package com.Polymorphism;

public class PegawaiTetap extends Pegawai{

    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double gaji(){
        return getUpah();
    }

    public String toString(){
        return String.format("%s\nJenis\t\t\t : Pegawai Tetap\nUpah\t\t\t : Rp %.1f\nPendapatan\t\t : Rp %d\n", super.toString(), getUpah(), (int)gaji());
    }
}
