import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args)  {
//      Gson gson = new Gson();
//        try (Reader reader = new FileReader("data/movies.json")){
//                Root movie = gson.fromJson(reader, Root.class);
//            System.out.println(movie.getMovies());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    MoviesParser<Root> parser = new MoviesParser(Root.class);
//    List<Root> list = parser.readJson("data/movies.json");
//    list.add("Name");
//        System.out.println(list.size());
//    list.add()
//    doListStuff(list);

//        Type itemsMapType = new TypeToken<Map<Integer, Movie>>() {}.getType();
//        String jsonArr = new Gson().toJson("data/movies.json");
//        Map<Integer, Movie> mapItemsDes = new Gson().fromJson(jsonArr, itemsMapType);
//        System.out.println(mapItemsDes.toString());


GsonParser parser = new GsonParser();
Root root = parser.parse();
System.out.println(root.toString());


    }
}