package model;

public class Persegi extends Object2D{
    private double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    @Override 
    protected abstract double hitungLuas(double sisi){
        return sisi * sisi;
    }

    @Override 
    protected  abstract double hitungKeliling(double sisi){
        return sisi * sisi * sisi;
    }

}
