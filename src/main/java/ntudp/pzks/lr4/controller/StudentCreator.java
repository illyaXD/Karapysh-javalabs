package ntudp.pzks.lr4.controller;

import ntudp.pzks.lr4.model.Sex;
import ntudp.pzks.lr4.model.Student;

public class StudentCreator {
    public static Student createStudent(String firstName, String lastName, String middleName, Sex sex, String studentId) {
        return new Student(firstName, lastName, middleName, sex, studentId);
    }
}
