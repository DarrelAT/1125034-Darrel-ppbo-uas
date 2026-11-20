package controller;

import model.*;

public class GObjectController {

    GObjectForm goForm;

    public GObjectController(GObjectForm goForm){
        this.goForm = goForm;
    }

    public void run(){
        int run = 1;
        while(run != 0){
            int menu = view.showMainMenu();
            switch (menu) {
                case 1:
                    goForm.
                    break;
            
                default:
                    break;
            }
        }
    }
}
