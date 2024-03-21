import java.util.ArrayList;

abstract class PlayerBoard {
    private Card starter;
    private ArrayList<Card>resource;
    private Card gold;
    private Card objective;
    private int point=0;
    private int plant=0;
    private int animal=0;
    private int fungi=0;
    private int insect=0;
    private int potion=0;
    private int feather=0;





    //--- da vedere
    public void init(Card card){
        starter = card;
    }
    public int getPoint(){
        return point;
    }

    //--- Aggiungi carta in un angolo


}
