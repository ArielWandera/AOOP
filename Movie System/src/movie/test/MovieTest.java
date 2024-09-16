package movie.test;

import movie.MovieItem;
import movie.Movie;

public class MovieTest {
    public static void main(String[] args) {
        Movie showing = new Movie();
        MovieItem movie= new MovieItem("Tom Hanks","Forrest Gump");
        MovieItem movie2= new MovieItem("Tom Cruise","Mission Impossible");


        showing.addMovieItem(movie);
        showing.addMovieItem(movie2);

        showing.printMovieDetails();








    }
}