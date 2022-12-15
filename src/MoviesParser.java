import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.util.List;

public class MoviesParser{

    public static List<Movie> parseMovies() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileReader reader = new FileReader("data/movies.json")) {
            return gson.fromJson(reader, MovieList.class).getMovies();
        } catch (Exception e) {
            System.out.println("Error " + e.toString());
        }
        return null;
    }
}

