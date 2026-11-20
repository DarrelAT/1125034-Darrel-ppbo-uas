package view;
import java.util.*;

public abstract class GObjectForm <T>{
    private List<T> allObject = new ArrayList<>();

    GObjectForm<T> SegiEmpatGObjectForm = new GObjectForm<T>(){};
    
    GObjectForm<T> PersegiGObjectForm = new GObjectForm<T>(){};
    
    GObjectForm<T> LingkaranGObjectForm = new GObjectForm<T>(){};
    
    GObjectForm<T> KubusGObjectForm = new GObjectForm<T>(){};
    
    GObjectForm<T> BalokGObjectForm = new GObjectForm<T>(){};
    
    GObjectForm<T> KerucutGObjectForm = new GObjectForm<T>(){};

    public int showMainMenu(){
        System.out.println("=== PILIH MENU ===");
        System.out.println("1. tampilkan semua");
        System.out.println("2. tambah persegi");
        System.out.println("3. tambah segi empat");
        System.out.println("4. tambah lingkaran");
        System.out.println("5. tambah kubus");
        System.out.println("6. tambah balok");
        System.out.println("7. tambah kerucut");
        System.out.println("0. keluar");
        return InputUtil.readline();
    }


}
