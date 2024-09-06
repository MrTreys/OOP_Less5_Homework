package model;

import java.util.ArrayList;

public class StudyingGroup {
    private Teacher teacher;
    private ArrayList<Student> group;

    public StudyingGroup(ArrayList<Student> group, Teacher teacher) {
        this.teacher = teacher;
        this.group = group;
    }

    public StudyingGroup(Teacher teacher) {
        this(new ArrayList<>(), teacher);
    }

    public void addStudent(Student student) {
        this.group.add(student);
    }
    
    public void rmwStudent(Student student) {
        this.group.remove(student);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getGroup() {
        return group;
    }
}
