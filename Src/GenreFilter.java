
/**
 * GenreFilter can be used to extract movies in specified genre in the method parameter.
 * 
 * @ Navin Ray 
 * @ Version: 1.0 (May 9, 2023)
 */

public class GenreFilter implements Filter {
    private String myGenre;
    
    public GenreFilter (String genre) {
        myGenre = genre;
    }
    
    @Override
    public boolean satisfies(String id) {
        return MovieDatabase.getGenres(id).contains(myGenre);
    }
}