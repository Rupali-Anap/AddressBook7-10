package com.bridgelabz;

public class AddressBook {

        public static void main(String[] args) {

            System.out.println("Welcome to Address Book System\n");
            Contact info = new Contact("Rupali", "Anap", "Yeola", "Nashik", "Maharashtra", "anaprupali333@gmail.com", 422222, "7083409631");
            System.out.println("Firstname: " + info.getFirstName());
            System.out.println("Lastname: " + info.getLastName());
            System.out.println("Address: " + info.getAddress());
            System.out.println("City: " + info.getCity());
            System.out.println("State: " + info.getState());
            System.out.println("Email: " + info.getEmail());
            System.out.println("Zip: " + info.getZip());
            System.out.println("PhoneNumber: " + info.getPhoneNumber());



        }
}
