
public class Card {

    /*
        t = top
        b = bottom

        l = left
        r = right
     */
    private Card tl;
    private Card tr;
    private Card bl;
    private Card br;
    public String seed;
    public Card(){}
    public void turnFace(){
        tl = new Card();
        tr = new Card();
        bl = new Card();
        br = new Card();
    }


    //--- per controllare che posso aggiungere una carta controllo che seed sia != null
}
