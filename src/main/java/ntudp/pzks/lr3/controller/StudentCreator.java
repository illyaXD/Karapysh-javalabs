package ntudp.pzks.lr3.controller;

import ntudp.pzks.lr3.model.Student;
import ntudp.pzks.lr3.model.Sex;

public class StudentCreator {
    public static Student createStudent(String firstName, String lastName, String middleName, Sex sex, String studentId) {
        return new Student(firstName, lastName, middleName, sex, studentId);
    }
}
