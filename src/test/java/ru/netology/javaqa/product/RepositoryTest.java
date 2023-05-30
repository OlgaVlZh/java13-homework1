package ru.netology.javaqa.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RepositoryTest {


    @Test
    public void theIDDoesNotExist() {
        Repository repo = new Repository();
        Book book1 = new Book(1, "A1", 10, "A");
        Book book2 = new Book(2, "B2", 20, "B");
        Book book3 = new Book(3, "C3", 30, "C");
        Book book4 = new Book(4, "D4", 40, "D");
        Book book5 = new Book(5, "E5", 50, "E");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(book4);
        repo.add(book5);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(10);
        });
    }


    @Test
    public void deletOneBookByID() {
        Repository repo = new Repository();
        Book book1 = new Book(1, "A1", 10, "A");
        Book book2 = new Book(2, "B2", 20, "B");
        Book book3 = new Book(3, "C3", 30, "C");
        Book book4 = new Book(4, "D4", 40, "D");
        Book book5 = new Book(5, "E5", 50, "E");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(book4);
        repo.add(book5);
        repo.removeById(3);

        Product[] actual = {book1, book2, book4, book5};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void deletingMultipleBooksByID() {
        Repository repo = new Repository();
        Book book1 = new Book(1, "A1", 10, "A");
        Book book2 = new Book(2, "B2", 20, "B");
        Book book3 = new Book(3, "C3", 30, "C");
        Book book4 = new Book(4, "D4", 40, "D");
        Book book5 = new Book(5, "E5", 50, "E");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(book4);
        repo.add(book5);
        repo.removeById(1);
        repo.removeById(3);
        repo.removeById(5);

        Product[] actual = {book2, book4};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void AddAllBooks() {
        Repository repo = new Repository();
        Book book1 = new Book(1, "A1", 10, "A");
        Book book2 = new Book(2, "B2", 20, "B");
        Book book3 = new Book(3, "C3", 30, "C");
        Book book4 = new Book(4, "D4", 40, "D");
        Book book5 = new Book(5, "E5", 50, "E");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(book4);
        repo.add(book5);

        Product[] actual = {book1, book2, book3, book4, book5};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void returnOneBook() {
        Repository repo = new Repository();
        Book book1 = new Book(1, "A1", 10, "A");
        Book book2 = new Book(2, "B2", 20, "B");
        Book book3 = new Book(3, "C3", 30, "C");
        Book book4 = new Book(4, "D4", 40, "D");
        Book book5 = new Book(5, "E5", 50, "E");

        repo.add(book1);

        Product[] actual = {book1};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    public void thereNothingInRepo() {
        Repository repo = new Repository();

        Product[] actual = {};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void theSmartphoneIDDoesNotExist() {
        Repository repo = new Repository();
        Smartphone smartphone1 = new Smartphone(6, "F6", 60, "Apple");
        Smartphone smartphone2 = new Smartphone(7, "G7", 60, "Apple");
        Smartphone smartphone3 = new Smartphone(8, "H8", 60, "Apple");
        Smartphone smartphone4 = new Smartphone(9, "I9", 60, "Apple");

        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.add(smartphone3);
        repo.add(smartphone4);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(-100);
        });
    }

    @Test
    public void deletOneSmartphoneByID() {
        Repository repo = new Repository();
        Smartphone smartphone1 = new Smartphone(6, "F6", 60, "Apple");
        Smartphone smartphone2 = new Smartphone(7, "G7", 60, "Apple");
        Smartphone smartphone3 = new Smartphone(8, "H8", 60, "Apple");
        Smartphone smartphone4 = new Smartphone(9, "I9", 60, "Apple");

        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.add(smartphone3);
        repo.add(smartphone4);
        repo.removeById(6);

        Product[] actual = {smartphone2, smartphone3, smartphone4};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void deletingMultipleSmartphonesByID() {
        Repository repo = new Repository();
        Smartphone smartphone1 = new Smartphone(6, "F6", 60, "Apple");
        Smartphone smartphone2 = new Smartphone(7, "G7", 60, "Apple");
        Smartphone smartphone3 = new Smartphone(8, "H8", 60, "Apple");
        Smartphone smartphone4 = new Smartphone(9, "I9", 60, "Apple");

        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.add(smartphone3);
        repo.add(smartphone4);
        repo.removeById(7);
        repo.removeById(9);

        Product[] actual = {smartphone1, smartphone3};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void AddAllSmartphone() {
        Repository repo = new Repository();
        Smartphone smartphone1 = new Smartphone(6, "F6", 60, "Apple");
        Smartphone smartphone2 = new Smartphone(7, "G7", 60, "Apple");
        Smartphone smartphone3 = new Smartphone(8, "H8", 60, "Apple");
        Smartphone smartphone4 = new Smartphone(9, "I9", 60, "Apple");

        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.add(smartphone3);
        repo.add(smartphone4);

        Product[] actual = {smartphone1, smartphone2, smartphone3, smartphone4};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void returnOneSmartphone() {
        Repository repo = new Repository();
        Smartphone smartphone1 = new Smartphone(6, "F6", 60, "Apple");
        Smartphone smartphone2 = new Smartphone(7, "G7", 60, "Apple");
        Smartphone smartphone3 = new Smartphone(8, "H8", 60, "Apple");
        Smartphone smartphone4 = new Smartphone(9, "I9", 60, "Apple");

        repo.add(smartphone2);

        Product[] actual = {smartphone2};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}