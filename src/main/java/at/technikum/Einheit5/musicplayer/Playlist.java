package at.technikum.Einheit5.musicplayer;

public class Playlist {
    private String title;
    private Song[] songs;
    private int songCount;
    public Playlist(String title, int maxSongs) {
        //TODO
        this.title = title;
        this.songs = new Song[maxSongs];
        this.songCount = 0;
    }
    public void addsong(Song song) {
        //TODO: add songs to playlist
        boolean allNotNull = false;
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] == null) {
                songs[i] = song;
                return;
            }
            allNotNull = true;
        }

        if (allNotNull) {
            System.out.println("Playlist is full");
        }

        //index counting for adding/removing is NOT recommended!
//        if (songCount == songs.length){
//            System.out.println("Playlist is full");
//            return;
//        }
//
//        if (songCount == songs.length && songs[songCount] == null) {
//            songs[songCount] = song;
//            return;
//        }
//        songs[songCount] = song;
//        songCount++;
        //instead of this current code - 'songs[songcount++] = track' also works
        //++ is executed AFTER reading the value at the index 'songCount'
    }

    public void removeSong(Song song) {
        //TODO
        //remove song from array
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] == song) {
                songs[i] = null;
            }
        }

        //rearrage array so that the empty slot is always at the back
        for (int i = 0; i < songs.length; i++) {
            if (i != songs.length - 1) {
                songs[i] = songs[i + 1];
            } else songs[i] = null;
        }
   }

    public int getTotalRuntime() {
        //TODO: return total runtime over all songs
        int totalRuntime = 0;
        for (int i = 0; i < songs.length; i++){
            if (songs[i] != null) {
                totalRuntime += songs[i].getLength();
            }
        }
        return totalRuntime;
    }

    public int getUniqueArtist() {
        //TODO
        int uniqueArtistCount = 0;

        for (int i = 0; i < songs.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i;j++) {
                if (songs[i].getArtist().equals(songs[j].getArtist())) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueArtistCount++;
            }
        }
        return uniqueArtistCount;
    }



    //TODO: GETTER, SETTER
    public String getTitle() {
        return title;
    }

    public Song[] getSongs() {
        return songs;
    }

    public int getSongCount() {
        return songCount;
    }
}
