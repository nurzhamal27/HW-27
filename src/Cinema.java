import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cinema {

    public void run() throws FileNotFoundException {

        Gson gson = new Gson();
        FileReader reader = new FileReader("data/movies.json");
        MovieList movieList = gson.fromJson(reader, MovieList.class);

        List<Movie> movies = movieList.getMovies();

        for (Movie movie : movies) {
            System.out.println(movie.getName());
        }


        System.out.println("=============================");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a search movie name: ");
        String searchMovie = scanner.nextLine();

        searchMoviesByName(movies, searchMovie);
    }

    private void searchMoviesByName(List<Movie> movies, String searchMovie) {

        for (Movie movie : movies) {
            String name = movie.getName();

            if (name.toLowerCase().contains(searchMovie.toLowerCase())) {
                System.out.println(name);
            }
        }
    }

    public  void sortMovies(List<Movie> movies) {

        Collections.sort(movies, (m1, m2) -> m1.getName().compareTo(m2.getName()));

        Collections.sort(movies, (m1, m2) -> m2.getName().compareTo(m1.getName()));

    }


}




