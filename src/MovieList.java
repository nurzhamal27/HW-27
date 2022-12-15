
import java.util.List;

public class MovieList {

    private List<Movie> movies;

    public MovieList(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }


    @Override
    public String toString() {
        return movies.toString();
    }
}
