import java.util.PrimitiveIterator;

public class Movie {
    private String name;
    private int year;
    private String description;
    private Director director;
    private Cast cast;

    public Movie(String name, int year, String description, Director director, Cast cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", director=" + director +
                ", cast=" + cast +
                '}';
    }
}
