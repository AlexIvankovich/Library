package com.itstep.library;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; // По умолчанию книга доступна
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Книга '" + title + "' успешно взята.");
        } else {
            System.out.println("Книга '" + title + "' недоступна.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Книга '" + title + "' возвращена.");
    }

    @Override
    public String toString() {
        return "Название: " + title + ", Автор: " + author + ", ISBN: " + isbn + ", Доступна: " + (isAvailable ? "Да" : "Нет");
    }
}
