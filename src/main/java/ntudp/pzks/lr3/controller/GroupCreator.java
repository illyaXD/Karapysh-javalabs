package ntudp.pzks.lr3.controller;

import ntudp.pzks.lr3.model.Group;
import ntudp.pzks.lr3.model.Human;
import ntudp.pzks.lr3.model.Student;

import java.util.List;

public class GroupCreator {
    public static Group createGroup(String name, Human head, List<Student> students) {
        return new Group(name, head, students);
    }
}
