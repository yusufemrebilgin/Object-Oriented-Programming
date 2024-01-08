package week12;

import java.util.Comparator;
public class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
