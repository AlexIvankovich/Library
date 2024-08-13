package com.itstep.library;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Person> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга добавлена: " + book.getTitle());
    }

    public void addMember(Person person) {
        members.add(person);
        System.out.println(person + " добавлен в библиотеку.");
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("В библиотеке нет книг.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void listMembers() {
        if (members.isEmpty()) {
            System.out.println("В библиотеке нет участников.");
        } else {
            for (Person member : members) {
                System.out.println(member);
            }
        }
    }

    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.borrow();
                return;
            }
        }
        System.out.println("Книга с ISBN " + isbn + " не найдена.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Книга с ISBN " + isbn + " не найдена.");
    }
}
