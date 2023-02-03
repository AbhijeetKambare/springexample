package bookmanagement.bookauther;

public class Auther {
    private String name;
    private int age;
    private String gender;
    private int rating;

    public Auther(String name, int age, String gender, int rating) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rating = rating;
    }

    public Auther() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int isRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
