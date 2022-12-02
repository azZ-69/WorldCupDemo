package model;

public class Players {
    String name;

    public Players(String name, int id, int age, double rating) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.rating = rating;
    }

    int id;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    int age;
    double rating;

}
