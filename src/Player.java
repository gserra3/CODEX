import java.util.ArrayList;

public class Player extends PlayerBoard {
    private String name;
    private static int ID = 0;

    //--- Non vogliamo inserire in nomi
    public Player(){
        this("Player"+ID+1);
    }
    //--- Voglio inserire il nome
    public Player(String name){
        this.name = name;
        ID++;
    }



}
