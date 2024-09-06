package model;

import java.util.ArrayList;

public class Teacher extends User {
    private final long teacherId;
    private Integer mainGrade;
    private Boolean primaryTeacher;
    private ArrayList<String> lessons = new ArrayList<>();
    private static Integer defaultTeacherId = 0;

    public Teacher(String name, String lastName, int age, long teacherId, int mainGrade, boolean primaryTeacher) {
        if (primaryTeacher && mainGrade > 4) {
            throw new IllegalArgumentException("primary school teacher can not educate grade greater than 4");
        }
        if (!primaryTeacher && mainGrade < 5 && mainGrade > 0) {
            throw new IllegalArgumentException("high school teacher can not educate grade less than 5");
        }
        if (mainGrade < 0 || mainGrade > 11) {
            throw new IllegalArgumentException("illegal grade argument");
        }

        super(name, lastName, age);
        this.teacherId = teacherId;
        this.mainGrade = mainGrade;
        this.primaryTeacher = primaryTeacher;
    }

    public Teacher(String name, String lastName, int mainGrade, boolean primaryTeacher) {
        this(name, lastName, 25, defaultTeacherId++, mainGrade, primaryTeacher);
    }

    public Teacher(String name, String lastName, boolean primaryTeacher) {
        this(name, lastName, 0, primaryTeacher);
    }

    public Teacher(String name, String lastName) {
        this(name, lastName, false);
    }

    public long getTeacherId() {
        return teacherId;
    }

    public Integer getMainGrade() {
        return mainGrade;
    }

    public void setMainGrade(Integer mainGrade) {
        this.mainGrade = mainGrade;
    }

    public Boolean getPrimaryTeacher() {
        return primaryTeacher;
    }

    public void setPrimaryTeacher(Boolean primaryTeacher) {
        this.primaryTeacher = primaryTeacher;
    }

    public ArrayList<String> getLessons() {
        return lessons;
    }

    public void addLesson(String lesson) {
        lessons.add(lesson);
    }

    public void rmwLesson(String lesson) {
        lessons.remove(lesson);
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d years old, main grade - %d\n", getName(), getLastName(), getAge(), getMainGrade());
    }
}
