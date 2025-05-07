package com.example;

import java.util.Scanner;

import com.example.Contact;

public class App {
    public static void main(String[] args) throws Exception {
        ContactManager contactManager = new ContactManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What is the name of the contact?");
            String name = scanner.nextLine();
            System.out.println("What is the email of the contact?");
            String email = scanner.nextLine();
            System.out.println("What is the phone number of the contact?");
            String phoneNumber = scanner.nextLine();
            Contact contact = new Contact(name, email, phoneNumber);
            contactManager.addContact(contact);
            System.out.println("Contact added: " + contact);
            System.out.println("Do you want to add another contact? (yes/no)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Here are all the contacts:");
                contactManager.displayContacts();
                break;
            }
        }
    }
}
