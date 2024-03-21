import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Card [] card;
        String path = "JSON/card.json";
        try {
            Reader reader = Files.newBufferedReader(Paths.get(path));
            card = gson.fromJson(reader, Card[].class);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < card.length; i++)
            System.out.println(card[i].seed);

    }

}
