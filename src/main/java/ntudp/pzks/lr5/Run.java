package ntudp.pzks.lr5;

import ntudp.pzks.lr5.database.StudentDatabaseManager;
import ntudp.pzks.lr5.model.Student;

import java.util.List;

public class Run {

    public static void main(String[] args) {
        StudentDatabaseManager manager = new StudentDatabaseManager();

        int searchMonth = 7;

        List<Student> students = manager.getStudentsByBirthMonth(searchMonth);

        if (students.isEmpty()) {
            System.out.println("There are no students born this month.");
        } else {
            System.out.println("Students born in " + searchMonth + " month:");
            for (Student student : students) {
                System.out.println("\t" + student);
            }
        }
    }
}