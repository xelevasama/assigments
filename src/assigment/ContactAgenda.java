package assigment;

import java.util.Scanner;

public class ContactAgenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays of names and phone numbers
        String[] names = new String[5];
        String[] phones = new String[5];
        int count = 0;

        int option;
        do {
            System.out.println("\n--- Contact Agenda ---");
            System.out.println("1. Add contact");
            System.out.println("2. Show contacts");
            System.out.println("3. Search contact by name");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (option) {
                case 1:
                    if (count < names.length) {
                        System.out.print("Name: ");
                        names[count] = sc.nextLine();
                        System.out.print("Phone: ");
                        phones[count] = sc.nextLine();
                        count++;
                        System.out.println(" Contact added.");
                    } else {
                        System.out.println("️ Agenda is full, cannot add more contacts.");
                    }
                    break;

                case 2:
                    System.out.println("\n Saved contacts:");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + names[i] + " - " + phones[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(search)) {
                            System.out.println("📞 " + names[i] + " - " + phones[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println(" Contact not found.");
                    }
                    break;

                case 4:
                    System.out.println(" Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 4);

        sc.close();
    }
}
