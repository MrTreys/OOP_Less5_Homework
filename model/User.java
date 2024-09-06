package model;

public abstract class User {
    private final String name;
    private final String lastName;
    private Integer age;

    public User(String name, String lastName, int age) {
        if (age < 1) {
            throw new IllegalArgumentException("illegal age argument");
        }
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}