package com.Polymorphism;

public class PegawaiHarian extends Pegawai{

    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public double gaji(){
        if (this.totalJam <= 40){
            return getUpahPerJam() * getTotalJam();
        }else if (this.totalJam > 40){
            return (40 * getUpahPerJam()) + ((getTotalJam() - 40) * getUpahPerJam() * 1.5);
        }
        return 0;
    }

    public String toString(){
        return String.format("%s\nJenis\t\t\t : Pegawai Harian\nUpah/jam\t\t : Rp %.1f\nTotal jam kerja\t : %d\nPendapatan\t\t : Rp %d\n", super.toString(), getUpahPerJam(), getTotalJam(), (int)gaji());
    }
}
