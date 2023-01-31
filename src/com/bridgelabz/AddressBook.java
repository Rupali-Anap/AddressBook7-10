package com.bridgelabz;

import java.util.ArrayList;

public class AddressBook {


        ArrayList<Contact> addressBook = new ArrayList<Contact>();

        public void addContact(Contact person) {

            boolean isDuplicate = duplicateEntry(person.getFirstName(), person);

            if (!isDuplicate) {
                addressBook.add(person);
            } else {
                System.out.println("Person name is duplicate");
            }
        }

        public boolean duplicateEntry(String firstname, Contact contacts) {


            for (Contact person1 : this.addressBook) {

                if (person1.getFirstName().equals(firstname)) {
                    return true;
                }
            }
            return false;
        }

        public void printAddressBook() {

            for (Contact person : this.addressBook) {
                System.out.println("-----------------------------------------------------");
                System.out.println("First name = " + person.getFirstName());
                System.out.println("last name = " + person.getLastName());
                System.out.println("address = " + person.getAddress());
                System.out.println("city = " + person.getCity());
                System.out.println("state = " + person.getState());
                System.out.println("zip = " + person.getZip());
                System.out.println("phone number = " + person.getPhoneNumber());
                System.out.println("-----------------------------------------------------");
            }
        }
    }










