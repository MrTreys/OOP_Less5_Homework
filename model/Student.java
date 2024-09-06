package model;

public class Student extends User {
    private final long id;
    private Integer grade;
    private static long defaultId = 100;

    public Student(String name, String lastName, int age, long id, Integer grade) {
        if (grade < 1 || grade > 11) {
            throw new IllegalArgumentException("illegal grade argument");
        }

        super(name, lastName, age);
        this.id = id;
        this.grade = grade;
    }

    public Student(String name, String lastName, int age) {
        int autoGrade;

        if (age > 6 && age < 18) autoGrade = age - 6;
        else autoGrade = 1;

        this(name, lastName, age, defaultId++, autoGrade);
    }

    public Student(String name, String lastName) {
        this(name, lastName, 7);
    }

    public long getId() {
        return id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
