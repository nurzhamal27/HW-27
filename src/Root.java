import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Root {
    private ArrayList<Movie> movies;

    public Root(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return "Root{" +
                "movies=" + movies +
                '}';
    }
}
