package model;

public class Balok extends Object3D{
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override 
    protected  abstract double hitungLuasPermukaan(double panjang, double lebar, double tinggi){
        return 2 * (panjang * lebar + panjang * tinggi + tinggi * lebar);
    }

    @Override 
    protected abstract double hitungVolume(double panjang, double lebar, double tinggi){
        return panjang * lebar * tinggi;
    }
}
