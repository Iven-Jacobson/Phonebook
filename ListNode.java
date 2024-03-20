// Name: Iven Jacobson

// Date 2-14-24

// Project: Assingment 2 Phone Book

// Purpose : This is the ListNode class that will be used to create 
// a linked list of phonebook entries.
public class ListNode {
    String firstName, lastName, address, city, phoneNumber;
    ListNode next;

    public ListNode(String firstName, String lastName, String address,
                    String city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
}
