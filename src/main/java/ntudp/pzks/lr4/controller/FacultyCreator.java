package ntudp.pzks.lr4.controller;

import ntudp.pzks.lr4.model.Department;
import ntudp.pzks.lr4.model.Faculty;
import ntudp.pzks.lr4.model.Human;

import java.util.List;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head, List<Department> departments) {
        return new Faculty(name, head, departments);
    }
}