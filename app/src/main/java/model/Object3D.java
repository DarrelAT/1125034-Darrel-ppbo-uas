package model;

public abstract class Object3D extends GObject{
    public Object3D(){
        super(getLabel());
    }

    protected  abstract double hitungLuasPermukaan();
    protected abstract double hitungVolume();

}
