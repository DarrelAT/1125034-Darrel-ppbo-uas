package model;

public class Kubus extends Object3D{
    private double sisi;

    public Kubus(double sisi){
        this.sisi = sisi;
    }

    @Override 
    protected abstract double hitungLuas(double sisi){
        return 6 * (sisi * sisi);
    }

    @Override 
    protected  abstract double hitungKeliling(){
        return sisi * sisi * sisi;
    }

}
