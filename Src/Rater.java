
/**
 * Rater is an interface for PlainRater and EfficientRater classes.
 * 
 * @ Navin Ray
 * @ Version: 1.0 (April 19, 2023)
 */

import java.util.*;

public interface Rater {
    public void addRating(String item, double rating);

    public boolean hasRating(String item);

    public String getID();

    public double getRating(String item);

    public int numRatings();

    public ArrayList<String> getItemsRated();
}