import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GsonParser {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH = Paths.get("data/tracks.json");
    public Root parse(){
        Gson gson = new Gson();
        try(FileReader reader = new FileReader("data/movies.json")){
            Root root = gson.fromJson(reader, Root.class);

            return root;

        }catch (Exception e){
            System.out.println("Error " + e.toString());
        }
        return null;
    }
        public Root writeFile(Movie movies){
            String str = GSON.toJson(movies);
            try {
                Files.write(PATH, str.getBytes());
            } catch (IOException e) {
                e.printStackTrace();

            }

            System.out.println(movies.getName());
            return null;
        }


}
