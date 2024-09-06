package service;

import java.util.ArrayList;

import model.*;

public class DataService {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public long createStudent(String name, String lastName, int age, int grade) {
        long maxId = 0;
        for (Student student : students) if (student.getId() > maxId) maxId = student.getId();
        long id = maxId+1;
        students.add(new Student(name, lastName, age, id, grade));
        return id;
    }

    public long createTeacher(String name, String lastName, int age, int mainGrade, boolean isPrimary, ArrayList<String> subjects) {
        long maxId = 0;
        for (Teacher teacher : teachers) if (teacher.getTeacherId() > maxId) maxId = teacher.getTeacherId();
        long id = maxId+1;
        Teacher teacher = new Teacher(name, lastName, age, id, mainGrade, isPrimary);
        for (String subject : subjects) {
            teacher.addLesson(subject);
        }
        teachers.add(teacher);
        return id;
    }

    public Student readStudents(long id) {
        for (Student student : students) if (student.getId() == id) return student;
        return null;
    }

    public ArrayList<Student> readStudents() {
        return this.students;
    }

    public ArrayList<Teacher> readTeachers() {
        return this.teachers;
    }
}
