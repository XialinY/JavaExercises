package at.technikum.OOPexercises;

public class Dog {
    private String dogName;
    private String dogBreed;

    public Dog(String name, String breed) {
        this.dogBreed = breed;
        this.dogName = name;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public String getDogName() {
        return dogName;
    }
}
