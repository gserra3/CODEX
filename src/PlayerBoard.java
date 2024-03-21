import cards.Card;

import java.util.ArrayList;

abstract class PlayerBoard {

    private int point=0;
    private int plant=0;
    private int animal=0;
    private int fungi=0;
    private int insect=0;
    private int potion=0;
    private int feather=0;
    private ArrayList<Card>cards;
    private Card objective;
    private ArrayList<Card>root;

    //--- Aggiungi carta
    public void place (Card card){
        if(controllo(card))
            cards.remove(card);

    }
    private boolean controllo(Card card){
        if(root.isEmpty())
            root.add(card);

        return true;

    }




}
