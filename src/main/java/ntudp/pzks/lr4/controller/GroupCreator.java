package ntudp.pzks.lr4.controller;

import ntudp.pzks.lr4.model.Group;
import ntudp.pzks.lr4.model.Human;
import ntudp.pzks.lr4.model.Student;

import java.util.List;

public class GroupCreator {
    public static Group createGroup(String name, Human head, List<Student> students) {
        return new Group(name, head, students);
    }
}
