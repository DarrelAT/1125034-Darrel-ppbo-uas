package controller;

import model.*;
import view.*;
import util.*;

public class GObjectController {

    GObjectForm goForm;
    GObjectView view;
    

    public GObjectController(GObjectForm goForm, GObjectView){
        this.goForm = goForm;
        this.view = view;
    }

    public void run(){
        boolean run = true;
        while(run){
            int menu = view.showMainMenu();
            if(menu == 1){
            PrintUtil.printGObjectDetail();
            }else if(menu == 2){
                goForm.showInsertForm()
            }else if(menu == 3){
                goForm.showInsertForm(null)
            }else if(menu == 4){
                goForm.showInsertForm(null)
            }else if(menu == 5){
                goForm.showInsertForm(null)
            }else if(menu == 6){
                goForm.showInsertForm(null)
            }else if(menu == 7){
                goForm.showInsertForm(null)
            }else{
                run = false;
            }
        }
    }
}
