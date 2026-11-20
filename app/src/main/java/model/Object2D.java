package model;

public abstract class Object2D extends GObject{

    @Override 
    public abstract String [][]getKeyValueDetails(){

    }

    protected abstract double hitungLuas();
    protected  abstract double hitungKeliling();
}
