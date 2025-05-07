package com.example;

public class App {
    public static void main(String[] args) throws Exception {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact(new Contact("John Doe", "John.Doe@Gmail.com", "+44 7384 123456"));
        contactManager.addContact(new Contact("Jane Smith", "Jane.Smith@Outlook.com", "+44 7384 654321"));
        contactManager.displayContacts();
    }
}
