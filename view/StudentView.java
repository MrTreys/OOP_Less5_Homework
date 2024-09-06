package view;

import model.Student;
import service.DataService;
import java.util.ArrayList;

public class StudentView {
    public void printStudent(DataService service, long id) {
        Student student = service.readStudents(id);
        System.out.printf("%s %s, %d years old, %d grade\n", student.getName(), student.getLastName(), student.getAge(), student.getGrade());
    }

    public void printStudents(DataService service) {
        ArrayList<Student> students = service.readStudents();
        for (Student student : students) {
            System.out.printf("%s %s, %d years old, %d grade\n", student.getName(), student.getLastName(), student.getAge(), student.getGrade());
        }
    }
}
