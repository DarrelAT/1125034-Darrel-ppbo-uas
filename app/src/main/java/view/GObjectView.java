package view;

import util.PrintUtil;

public class GObjectView {
    

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
        return PrintUtil.readline();
    }
}
