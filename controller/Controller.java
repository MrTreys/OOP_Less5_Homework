package controller;

import java.util.ArrayList;

import service.*;
import model.*;
import view.*;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyingGroupService groupService = new StudyingGroupService();

    public ArrayList<Student> studentCreation(String name, String lastName, int age, int grade) {
        dataService.createStudent(name, lastName, age, grade);
        // studentView.printStudent(dataService, id);
        return dataService.readStudents();
    }

    public StudyingGroup createGroup(Teacher teacher, ArrayList<Student> students) {
        return groupService.createGroup(teacher, students);
    }

    public ArrayList<Student> getStudents() {
        return dataService.readStudents();
    }

    public void printStudents(ArrayList<Student> students) {
        studentView.printStudents(dataService);
    }
}
