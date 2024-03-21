import cards.Card;

import java.util.ArrayList;

public class Board {
    private ArrayList<Player>players;
    private ArrayList<Card>resource;
    private ArrayList<Card>gold;
    private ArrayList<Card>starter;
    private ArrayList<Card>objective;
    private int round;
    private boolean game_end;
    private Board (ArrayList <Player>players){
        this.players = players;
        round = 0;
        game_end = false;
    }
    public void update(){

        for(int i = 0; i < players.size(); i++){
            if(players.get(i).getPoint()>=20)
                game_end = true;
            //--- Operazioni di gioco

        }
        if(game_end)
            end();
        update();



    }
    //--- Fine del gioco
    public void end(){

    }

}
