package controller;

import view.GObjectForm;
import model.*;

public class GObjectController {
    private GObjectForm view;

    public GObjectController(GObjectForm view){
        this.view = view;
    }

    public void run(){
        int run = 1;
        while(run != 0){
            int menu = view.showMainMenu();
        }
    }
}
