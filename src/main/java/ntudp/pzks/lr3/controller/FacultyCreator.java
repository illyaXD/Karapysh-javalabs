package ntudp.pzks.lr3.controller;

import ntudp.pzks.lr3.model.Faculty;
import ntudp.pzks.lr3.model.Human;
import ntudp.pzks.lr3.model.Department;

import java.util.List;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head, List<Department> departments) {
        return new Faculty(name, head, departments);
    }
}