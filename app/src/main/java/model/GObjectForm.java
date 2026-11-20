package model;
import java.util.*;

public abstract class GObjectForm <T extends GObject>{
    private List<T> allObject = new ArrayList<>();

    GObjectForm<T> SegiEmpatGObjectForm = new GObjectForm<T>(){};
    
    GObjectForm<T> PersegiGObjectForm = new GObjectForm<T>(){};
    
    GObjectForm<T> LingkaranGObjectForm = new GObjectForm<T>(){};
    
    GObjectForm<T> KubusGObjectForm = new GObjectForm<T>(){};
    
    GObjectForm<T> BalokGObjectForm = new GObjectForm<T>(){};
    
    GObjectForm<T> KerucutGObjectForm = new GObjectForm<T>(){};

    public T showInsertForm(String label){};

    protected abstract String[] getFields();

    protected abstract T constructModelFromValues(String label, double[] values);

    protected abstract double[] extractvalueFromModel(T model);

    private List<GObject> storage = new ArrayList<>();
}
