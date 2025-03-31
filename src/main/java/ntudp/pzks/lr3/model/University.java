package ntudp.pzks.lr3.model;

import java.util.List;

public class University {
    private String name;
    private Human head;
    private List<Faculty> faculties;

    public University(String name, Human head, List<Faculty> faculties) {
        this.name = name;
        this.head = head;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("University: ").append(name).append(", headed by: ").append(head.toString()).append("\n");
        for (Faculty faculty : faculties) {
            sb.append("  Faculty: ").append(faculty.getName()).append(", headed by: ").append(faculty.getHead().toString()).append("\n");
            for (Department department : faculty.getDepartments()) {
                sb.append("    Department: ").append(department.getName()).append(", headed by: ").append(department.getHead().toString()).append("\n");
                for (Group group : department.getGroups()) {
                    sb.append("      Group: ").append(group.getName()).append(", headed by: ").append(group.getHead().toString()).append("\n");
                    for (Student student : group.getStudents()) {
                        sb.append("        Student: ").append(student.toString()).append("\n");
                    }
                }
            }
        }
        return sb.toString();
    }
}