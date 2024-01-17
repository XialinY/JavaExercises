package at.technikum.Vorlesung5.musicplayer;

public class Artist {
    private String name;
    private int age;
    private String genre;

    public Artist(String name, String genre, int age) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getGenre() {
        return genre;
    }
}
