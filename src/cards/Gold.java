package cards;

import java.util.ArrayList;

public class Gold extends Card{
    private int point;
    private ArrayList<String>resource;

    @Override
    public String toString() {
        return "Gold{" +
                "point=" + point +
                ", resource=" + resource +
                "} "+super.toString();
    }
}
