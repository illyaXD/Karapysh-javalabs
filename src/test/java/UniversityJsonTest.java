import ntudp.pzks.lr4.model.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ntudp.pzks.lr4.controller.JsonManager;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UniversityJsonTest {
    private static final String FILE_PATH = "university.json";

    @BeforeEach
    public void setUp() {
        File file = new File(FILE_PATH);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void testJsonSerialization() {
        University oldUniversity = createSampleUniversity();

        JsonManager.writeUniversityToJson(oldUniversity, FILE_PATH);

        University newUniversity = JsonManager.readUniversityFromJson(FILE_PATH);

        assertEquals(oldUniversity, newUniversity, "University objects must be equal");
    }

    private University createSampleUniversity() {
        Student student1 = new Student("Oleksii", "Artemov", "Artemovych", Sex.MALE, "S1");
        Student student2 = new Student("Anna", "Annenko", "Andriivna", Sex.FEMALE, "S2");
        List<Student> students = List.of(student1, student2);

        Human groupHead = new Human("Petro", "Kovalenko", "Anatoliyovych", Sex.MALE);
        Group group1 = new Group("122-21-1", groupHead, students);
        Group group2 = new Group("125-20-2", groupHead, students);

        Human departmentHead = new Human("Olha", "Shevchenko", "Petrivna", Sex.FEMALE);
        Department department1 = new Department("PZKS", departmentHead, List.of(group1, group2));
        Department department2 = new Department("SAY", departmentHead, List.of(group1, group2));

        Human facultyHead = new Human("Taras", "Dronov", "Illich", Sex.MALE);
        Faculty faculty1 = new Faculty("FIT", facultyHead, List.of(department1, department2));
        Faculty faculty2 = new Faculty("FE", facultyHead, List.of(department1, department2));

        Human universityHead = new Human("Nastya", "Sydorova", "Artemivna", Sex.FEMALE);
        return new University("Dnipro University of Technology", universityHead, List.of(faculty1, faculty2));
    }
}