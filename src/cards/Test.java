package cards;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gold[] card;
        String path = "JSON/gold.json";
        try {
            Reader reader = Files.newBufferedReader(Paths.get(path));
            card = gson.fromJson(reader, Gold[].class);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < card.length; i++)
            System.out.println(card[i].toString());

    }

}
