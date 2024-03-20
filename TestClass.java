// Name: Iven Jacobson

// Date 2-14-24

// Project: Assingment 2 Phone Book

// Purpose : The is the TestClass class
// that will be used to test the PhonebookManager class.
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        PhonebookManager phonebook = new PhonebookManager();
        Scanner scanner = new Scanner(System.in);

        // Menu loop
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Add an entry at the beginning");
            System.out.println("2. Add an entry at the end");
            System.out.println("3. Add an entry at a specific index");
            System.out.println("4. Delete an entry");
            System.out.println("5. Modify an entry");
            System.out.println("6. Print the phonebook");
            System.out.println("7. Exit");
            System.out.print("Option: ");

            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            // Exit the loop.
            if (option == 7) {
                break;
            }

            String firstName, lastName, address, city, phoneNumber;
            int index;

            // Perform the selected operation based on the user's input.
            // The user is prompted to enter the required information for each operation.
            switch (option) {
                case 1:
                    System.out.println("Enter first name:");
                    firstName = scanner.nextLine();
                    System.out.println("Enter last name:");
                    lastName = scanner.nextLine();
                    System.out.println("Enter address:");
                    address = scanner.nextLine();
                    System.out.println("Enter city:");
                    city = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    phoneNumber = scanner.nextLine();
                    phonebook.addAtBeginning(firstName, lastName, address, city, phoneNumber);
                    break;
                case 2:
                    System.out.println("Enter first name:");
                    firstName = scanner.nextLine();
                    System.out.println("Enter last name:");
                    lastName = scanner.nextLine();
                    System.out.println("Enter address:");
                    address = scanner.nextLine();
                    System.out.println("Enter city:");
                    city = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    phoneNumber = scanner.nextLine();
                    phonebook.addAtEnd(firstName, lastName, address, city, phoneNumber);
                    break;
                case 3:
                    System.out.println("Enter index:");
                    index = scanner.nextInt();
                    scanner.nextLine();  // Consume newline left-over
                    System.out.println("Enter first name:");
                    firstName = scanner.nextLine();
                    System.out.println("Enter last name:");
                    lastName = scanner.nextLine();
                    System.out.println("Enter address:");
                    address = scanner.nextLine();
                    System.out.println("Enter city:");
                    city = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    phoneNumber = scanner.nextLine();;
                    phonebook.addAtIndex(index, firstName, lastName, address, city, phoneNumber);
                    break;
                case 4:
                    System.out.println("Enter index of entry to delete:");
                    index = scanner.nextInt();
                    phonebook.deleteAtIndex(index);
                    break;
                case 5:
                    System.out.println("Enter index:");
                    index = scanner.nextInt();
                    phonebook.modifyAtIndex(index);
                    break;
                case 6:
                    phonebook.printList();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}