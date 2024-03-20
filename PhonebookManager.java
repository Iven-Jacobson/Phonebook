// Name: Iven Jacobson

// Date 2-14-24

// Project: Assingment 2 Phone Book

// Purpose : The is the PhonebookManager class that will be used to manage the phonebook.
//It will be used to add, delete, modify, and print the phonebook.



import java.util.Scanner;

public class PhonebookManager {
    ListNode head;
    Scanner scanner = new Scanner(System.in);

    // Constructor initializes an empty list
    public PhonebookManager() {
        this.head = null;
    }

    // Method to add a new node at the beginning of the list
    public void addAtBeginning(String firstName, String lastName, String address,
                               String city, String phoneNumber) {
        ListNode newNode = new ListNode(firstName, lastName, address, city, phoneNumber);
        newNode.next = head;
        head = newNode;
    }

    // Method to add a new node at the end of the list
    public void addAtEnd(String firstName, String lastName, String address,
                         String city, String phoneNumber) {
        ListNode newNode = new ListNode(firstName, lastName, address, city, phoneNumber);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to add a new node at a specific index in the list
    public void addAtIndex(int index, String firstName, String lastName, String address,
                           String city, String phoneNumber) {
        ListNode newNode = new ListNode(firstName, lastName, address, city, phoneNumber);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current.next == null) {
                    return;
                }
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Method to delete a node at a specific index in the list
    public void deleteAtIndex(int index) {
        if (index == 0) {
            if (head != null) {
                head = head.next;
            }
        } else {
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current.next == null) {
                    return;
                }
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;
            }
        }
    }
    // Method to modify a node at a specific index in the list
    public void modifyAtIndex(int index) {
        ListNode current = head;
        for (int i = 0; i < index; i++) {  // Traverse to indexth node
            if (current.next == null) {
                return;  // If index is out of range, do nothing
            }
            current = current.next;
        }

        // Display menu for user to select which field to modify
        System.out.println("Select the field you want to modify:");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Address");
        System.out.println("4. City");
        System.out.println("5. Phone Number");

        int option = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        System.out.println("Enter the new value:");
        String newValue = scanner.nextLine();

        switch (option) {
            case 1:
                current.firstName = newValue;
                break;
            case 2:
                current.lastName = newValue;
                break;
            case 3:
                current.address = newValue;
                break;
            case 4:
                current.city = newValue;
                break;
            case 5:
                current.phoneNumber = newValue;
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    // Method to print the entire list
    public void printList() {
        ListNode current = head;
        int index = 0;  // Start index at 0
        while (current != null) {
            System.out.println();  // Print an empty line for readability
            System.out.println("Index: " + index);
            System.out.println("Name: " + current.firstName + " " + current.lastName);
            System.out.println("Address: " + current.address);
            System.out.println("City: " + current.city);
            System.out.println("Phone Number: " + current.phoneNumber);
            current = current.next;
            index++;
        }
    }
    
}