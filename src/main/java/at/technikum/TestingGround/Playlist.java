package at.technikum.TestingGround;

import at.technikum.Vorlesung5.musicplayer.Song;

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
            return;
        }
//        if (songCount == songs.length){
//            System.out.println("Playlist is full");
//            return;
//        }
//        songs[songCount] = song;
//        songCount++;

        //instead of this current code - 'songs[songcount++] = track' also works
        //++ is executed AFTER reading the value at the index 'songCount'
    }

    public void removeSong(Song song) {
        //TODO
        for (int i = 0; i < songCount; i++) {
            if (songs[i] == song) {
                songs[i] = null;
            }
        }
   }
    public int getTotalRuntime() {
        //TODO: return total runtime over all songs
        int totalRuntime = 0;
        for (int i = 0; i < songCount; i++){
            totalRuntime += songs[i].getLength();
        }
        return totalRuntime;
    }

    public int getUniqueArtist() {
        //TODO
        int uniqueArtistCount = 0;

        for (int i = 0; i < songs.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < songs.length;j++) {
                if (songs[i].getArtist().equals(songs[j].getArtist())) {
                    isUnique = false;
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
