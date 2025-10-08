package assigment3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registration reg = new Registration();

        int option;
        do {
            System.out.println("\n--- Student Registration Menu ---");
            System.out.println("1. Register student");
            System.out.println("2. List students");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    Student s = new Student(id, name, email);
                    reg.registerStudent(s);
                    break;

                case 2:
                    reg.listStudents();
                    break;

                case 3:
                    System.out.println(" Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 3);

        sc.close();
    }
}
