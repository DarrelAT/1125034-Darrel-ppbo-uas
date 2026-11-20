package model;

public class Lingkaran extends Object2D{
    private double jarijari;

    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }

    @Override 
    protected abstract double hitungLuas(double jarijari){
        return 2 * 3.14 * jarijari;
    }

    @Override 
    protected  abstract double hitungKeliling(){
        return 3.14 * (jarijari * jarijari);
    }
}
