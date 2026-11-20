package model;
import java.util.*;

public abstract class GObjectForm <T>{
    private List<T> object = new ArrayList<>();


    public abstract double hitungLuas();
    public abstract double hitungKeliling();
    public abstract double hitungLuasPermukaan();
    public abstract double hitungVolume();
}
