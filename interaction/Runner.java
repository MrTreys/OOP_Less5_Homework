package interaction;

import controller.*;
import model.*;

public class Runner {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.studentCreation("Michael", "Smith", 8, 2);
        controller.studentCreation("Anthony", "Sheppard", 9, 1);
        Teacher teacher = new Teacher("Anne", "Boleyn", 2, true);

        StudyingGroup group = controller.createGroup(teacher, controller.getStudents());

        System.out.println(group.getTeacher());
        controller.printStudents(group.getGroup());
    }
}
