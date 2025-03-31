package ntudp.pzks.lr4.controller;

import ntudp.pzks.lr4.model.Faculty;
import ntudp.pzks.lr4.model.Human;
import ntudp.pzks.lr4.model.University;

import java.util.List;

public class UniversityCreator {
    public static University createUniversity(String name, Human head, List<Faculty> faculties) {
        return new University(name, head, faculties);
    }
}
