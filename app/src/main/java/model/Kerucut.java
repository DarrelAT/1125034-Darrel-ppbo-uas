package model;

public class Kerucut extends Object3D{
    private double jarijari;
    private double tinggi;

    public Kerucut(double jarijari, double tinggi){
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }

    @Override 
    protected  abstract double hitungLuasPermukaan(double jarijari, double tinggi){
        return 3.14 * (jarijari+tinggi);
    }

    @Override 
    protected abstract double hitungVolume(double jarijari, double tinggi){
        return 3.14 * (tinggi + (3.14 * (jarijari * 2)));
    }
}
