package service;

import model.*;
import java.util.ArrayList;

public class StudyingGroupService {
    public StudyingGroup createGroup(Teacher teacher, ArrayList<Student> students) {
        for (Student student : students) student.setGrade(teacher.getMainGrade());
        return new StudyingGroup(students, teacher);
    }
}
