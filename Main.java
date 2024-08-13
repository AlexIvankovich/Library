package com.itstep.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Показать все книги");
            System.out.println("3. Получить книгу");
            System.out.println("4. Вернуть книгу");
            System.out.println("5. Добавить участника (студента/преподавателя)");
            System.out.println("6. Показать всех участников");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите автора книги: ");
                    String author = scanner.nextLine();
                    System.out.print("Введите ISBN книги: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;

                case 2:
                    library.listBooks();
                    break;

                case 3:
                    System.out.print("Введите ISBN книги для получения: ");
                    String borrowIsbn = scanner.nextLine();
                    library.borrowBook(borrowIsbn);
                    break;

                case 4:
                    System.out.print("Введите ISBN книги для возврата: ");
                    String returnIsbn = scanner.nextLine();
                    library.returnBook(returnIsbn);
                    break;

                case 5:
                    System.out.print("Введите имя участника: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Введите фамилию участника: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Введите ID участника: ");
                    String id = scanner.nextLine();
                    System.out.print("Вы студент (1) или преподаватель (2)? ");
                    int memberType = Integer.parseInt(scanner.nextLine());

                    if (memberType == 1) {
                        library.addMember(new Student(firstName, lastName, id));
                    } else if (memberType == 2) {
                        library.addMember(new Teacher(firstName, lastName, id));
                    } else {
                        System.out.println("Неверный выбор.");
                    }
                    break;

                case 6:
                    library.listMembers();
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }
}