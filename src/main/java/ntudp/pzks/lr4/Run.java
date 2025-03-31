package ntudp.pzks.lr4;

import ntudp.pzks.lr4.controller.*;
import ntudp.pzks.lr4.model.*;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(StudentCreator.createStudent("Illia", "Karapysh", "Volodymyrovych", Sex.MALE, "1"));
        students.add(StudentCreator.createStudent("Anton", "Shevchenko", "Oleksiyovych", Sex.MALE, "2"));

        Human departmentHead = new Human("Anatolii", "Petrenko", "Oleksandrovych", Sex.MALE);

        List<Group> groups = new ArrayList<>();
        groups.add(GroupCreator.createGroup("122-21-1", departmentHead, students));

        List<Department> departments = new ArrayList<>();
        departments.add(DepartmentCreator.createDepartment("PZKS", departmentHead, groups));

        Human facultyHead = new Human("Maria", "Vakulenko", "Serhiivna", Sex.FEMALE);
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(FacultyCreator.createFaculty("FІТ", facultyHead, departments));

        Human universityHead = new Human("Artem", "Maksimov", "Petrovych", Sex.MALE);
        University university = UniversityCreator.createUniversity("Dnipro University of Technology", universityHead, faculties);

        System.out.println(university);
    }
}