package ntudp.pzks.lr3.controller;

import ntudp.pzks.lr3.model.University;
import ntudp.pzks.lr3.model.Human;
import ntudp.pzks.lr3.model.Faculty;

import java.util.List;

public class UniversityCreator {
    public static University createUniversity(String name, Human head, List<Faculty> faculties) {
        return new University(name, head, faculties);
    }
}
