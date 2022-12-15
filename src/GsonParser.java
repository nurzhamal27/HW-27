import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GsonParser {

    public Root parse(){
        Gson gson = new  GsonBuilder().setPrettyPrinting().create();
        try(FileReader reader = new FileReader("data/movies.json")){
            Root root = gson.fromJson(reader, Root.class);
            return root;

        }catch (Exception e){
            System.out.println("Error " + e.toString());
        }
        return null;
    }

    public void run(){
        GsonParser parser = new GsonParser();
        Root root = parser.parse();
        System.out.println(root.getMovies());
        List<Movie> list = new ArrayList<>();
        doListStuff(list);
    }

    public void doListStuff(List<Movie> list){

        System.out.println(list.size());
        System.out.println(list.indexOf("name"));
    }
}
