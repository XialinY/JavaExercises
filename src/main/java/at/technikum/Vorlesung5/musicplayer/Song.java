package at.technikum.Vorlesung5.musicplayer;

public class Song {

    private String title;
    //TODO: private Artist artist;
    private Artist artist;

    private String genre; //with public - another class can access this part via OBJECTNAME.genre

    private int length;

    //the method 'public Song' (in this case) is ALWAYS present!
    //whether u define it yourself or not it is always there.
    //its called the 'default constructor'
    //default constructor - exists EVEN IF IT hasnt been defined it before!
    public Song(
            String title,
            Artist artist,
            String genre,
            int length
    ) {
        // this.title = title if no exceptions are set in the SET - Functions
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setLength(length);
    }

    public void setLength(int length) {
        //setting a fail safe
        if (0 > length) {
            this.length = 0;
            return;
        }
        this.length = length; //'this' calls for the variable defined in the class and
                              //NOT the parameter that is given to the method here!
    }
    public int getLength() {
        return this.length;
    }

    public void setTitle(String title) {
        if (title.isEmpty()) {
            this.title = "no title set";
            return;
        }
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist.getName();
    }

    public void setGenre(String genre){
        if (genre.isEmpty()) {
            this.genre = "no genre set";
            return;
        }
        this.genre = genre;
    }
    public String getGenre() {
        return this.genre;
    }
}
