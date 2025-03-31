package ntudp.pzks.lr3.controller;

import ntudp.pzks.lr3.model.Department;
import ntudp.pzks.lr3.model.Group;
import ntudp.pzks.lr3.model.Human;

import java.util.List;

public class DepartmentCreator {
    public static Department createDepartment(String name, Human head, List<Group> groups) {
        return new Department(name, head, groups);
    }
}
