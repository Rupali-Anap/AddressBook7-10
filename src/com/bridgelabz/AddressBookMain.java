package com.bridgelabz;
import java.util.Scanner;

public class AddressBookMain {

            public static Contact input(Scanner scanner) {

            System.out.println("Add details of a person");
            System.out.println("Please provide first name");
            String firstName = scanner.next();
            System.out.println("Please provide Last name");
            String lastName = scanner.next();
            System.out.println("Please provide address");
            String address = scanner.next();
            System.out.println("Please provide city");
            String city = scanner.next();
            System.out.println("Please provide state");
            String state = scanner.next();
            System.out.println("Please provide zip");
            int zip = scanner.nextInt();
            System.out.println("Please provide phone number");
            String phoneNumber = scanner.next();
            Contact person = new Contact(firstName, lastName, address, city, state, zip, phoneNumber);
            return person;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Contact person1 = new Contact("Rupali", "Anap", "Yeola", "Nashik", "Maharashtra", 422222, "7083409631");
            Contact person2 = new Contact("Abhijeet", "Kothawade", "Yeola", "Nashik", "Maharashtra", 425631, "9011106623");

            AddressBook addressBook = new AddressBook();
            addressBook.addContact(person1);
            addressBook.addContact(person2);
            System.out.println("Address book before adding new contact is: ");
            addressBook.printAddressBook();

            System.out.println("Checking duplicate entry before adding new contact");
            addressBook.addContact(input(sc));
            addressBook.printAddressBook();

    }
}
