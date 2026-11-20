package model;

import java.view.GObjectForm;

public abstract class GObject extends view.GObjectForm<T>{
    private String label;

    public GObject(String label){
        this.label = label;
    }

    public void setLabel(String label){
        this.label = label;
    }

    public String getLabel(){
        return label;
    }

    public abstract String [][]getKeyValueDetails();
}
