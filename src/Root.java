import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Root {
    private String name;

    private List<Movie> movies;

    public Root(String name, List<Movie> movies) {
        this.name = name;
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }


    @Override
    public String toString() {
        return "Root{" +
                ", movies=" + movies +
                '}';
    }
}
