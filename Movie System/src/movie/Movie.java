package movie;


import java.util.ArrayList;
import java.util.List;

public class Movie {
    public final List<MovieItem> list;
    public MovieItem item;

    public Movie(){
        this.list=new ArrayList<MovieItem>();
    }

    public void addMovieItem(MovieItem item){
        list.add(item);


    }
    public void printMovieDetails() {
        for (MovieItem item : list) {
            item.printDetails();

        }
    }

}
