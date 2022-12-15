import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;


public class MoviesParser<T> {

        private final Type type;
        private final Gson gson;

        public MoviesParser(Class<T> clazz) {
            this.gson = new Gson();
            this.type = new TypeToken<ArrayList<T>>() {}.getType();
        }

        public List<Root> readJson(String fileName) {
            try (Reader reader = new BufferedReader(new FileReader(fileName))) {
                return gson.fromJson(reader, type);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void run(){
            MoviesParser<Root> parser = new MoviesParser(Root.class);
            List<Root> moviesList = parser.readJson("data/movies.json");
            System.out.println(moviesList.size());
            List<Root> list = new ArrayList<>();
            doListStuff(list);

        }
    public void doListStuff(List<Root> list){

        System.out.println(list.size());
        System.out.println(list.indexOf("name"));
    }

    }


