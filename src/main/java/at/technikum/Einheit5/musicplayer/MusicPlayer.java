package at.technikum.Einheit5.musicplayer;

public class MusicPlayer {

    public static void main(String[] args) {
        Artist artist1 = new Artist("Bob", "Pop", 36);
        Artist artist2 = new Artist("Dob", "Sob", 29);
        Artist artist3 = new Artist("Tob", "Nob", 23);
        Artist artist4 = new Artist("Rob", "Kop", 32);
        Song track1 = new Song(
                "TTSG",
                artist3,
                "Pop",
                400
        );

//  defining the new object
//  this version is not recommended, because public variables are vulnerable to human error
//        track1.title = "";
//        track1.artist = "Andrea Bocelli";
//        track1.genre = "    ";
//        track1.length = -240;
//        track2.title = "Time to say Goodbye";
//        track2.artist = "Andrea Bocelli";
//        track2.genre = "Pop";
//        track2.length = 240;

//  another (tedious method) to define the new object
//        track1.setLength(400);
//        track1.setArtist("");
//        track1.setTitle("");
//        track1.setGenre("");
//        System.out.println(track1.getLength());
//        System.out.println(track1.getTitle());
//        System.out.println(track1.getArtist());
//        System.out.println(track1.getGenre());
        //System.out.println(track1);

        Song track2 = new Song(
                "TTSG",
                artist1,
                "Pop",
                400
        );
        Song track3 = new Song(
                "TTSG",
                artist3,
                "Pop",
                400
        );
        Song track4 = new Song(
                "TTSG",
                artist4,
                "Pop",
                400
        );

        Playlist p1 = new Playlist("Mix",4);
        p1.addsong(track1);
        p1.addsong(track2);
        p1.addsong(track3);
        p1.addsong(track4);

//        System.out.printf("Total Runtime in Seconds: %d\n", p1.getTotalRuntime());

//        p1.removeSong(track2);

        System.out.printf("Total Runtime in Seconds: %d\n", p1.getTotalRuntime());

        System.out.printf("Total Unique Artist: %d\n", p1.getUniqueArtist());
    }
}
