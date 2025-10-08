package assigment3;

import java.util.ArrayList;

public class Registration {
    private ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void registerStudent(Student s) {
        students.add(s);
        System.out.println(" Student registered: " + s.getName());
    }

    // List all students
    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("️ No students registered yet.");
        } else {
            System.out.println("\n--- Registered Students ---");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}
