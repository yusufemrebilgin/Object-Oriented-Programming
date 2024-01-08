package week12;

import java.util.Comparator;
public class RatingCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}
