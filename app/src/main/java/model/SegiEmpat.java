package model;

public class SegiEmpat extends Object2D{
    private double panjang;
    private double lebar;

    public SegiEmpat(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override 
    protected abstract double hitungLuas(double panjang, double lebar){
        return panjang * lebar;
    }

    @Override 
    protected  abstract double hitungKeliling(double panjang, double lebar){
        return 1/2 * panjang * lebar;
    }
\
}
