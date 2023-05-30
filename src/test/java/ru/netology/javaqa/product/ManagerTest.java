package ru.netology.javaqa.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerTest {

    @Test
    public void AddAllBooks() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "A1", 10, "A");
        Book book2 = new Book(2, "B2", 20, "B");
        Book book3 = new Book(3, "C3", 30, "C");
        Book book4 = new Book(4, "D4", 40, "D");
        Book book5 = new Book(5, "E5", 50, "E");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] actual = {book1, book2, book3, book4, book5};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void averageValue() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "A1", 10, "A");
        Book book2 = new Book(2, "B2", 20, "B");
        Book book3 = new Book(3, "C3", 30, "C");
        Book book4 = new Book(4, "D4", 40, "D");
        Book book5 = new Book(5, "E5", 50, "E");

        manager.add(book3);

        Product[] actual = {book3};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void returnOneBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "A1", 10, "A");
        Book book2 = new Book(2, "B2", 20, "B");
        Book book3 = new Book(3, "C3", 30, "C");
        Book book4 = new Book(4, "D4", 40, "D");
        Book book5 = new Book(5, "E5", 50, "E");

        manager.add(book1);

        Product[] actual = {book1};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void theLastBookFromTheArray() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "A1", 10, "A");
        Book book2 = new Book(2, "B2", 20, "B");
        Book book3 = new Book(3, "C3", 30, "C");
        Book book4 = new Book(4, "D4", 40, "D");
        Book book5 = new Book(5, "E5", 50, "E");

        manager.add(book5);

        Product[] actual = {book5};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void searchForBooksByName() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "AC1", 10, "A");
        Book book2 = new Book(2, "B2", 20, "B");
        Book book3 = new Book(3, "AC3", 30, "C");
        Book book4 = new Book(4, "D4", 40, "D");
        Book book5 = new Book(5, "E5", 50, "E");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] actual = {book1, book3};
        Product[] expected = manager.searchBy("AC");
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void theFirstSmartphoneFromTheArray() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(6, "F6", 60, "Apple");
        Smartphone smartphone2 = new Smartphone(7, "G7", 60, "Apple");
        Smartphone smartphone3 = new Smartphone(8, "H8", 60, "Apple");
        Smartphone smartphone4 = new Smartphone(9, "I9", 60, "Apple");

        manager.add(smartphone1);

        Product[] actual = {smartphone1};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void theLatestSmartphoneFromArray() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(6, "F6", 60, "Apple");
        Smartphone smartphone2 = new Smartphone(7, "G7", 60, "Apple");
        Smartphone smartphone3 = new Smartphone(8, "H8", 60, "Apple");
        Smartphone smartphone4 = new Smartphone(9, "I9", 60, "Apple");

        manager.add(smartphone4);

        Product[] actual = {smartphone4};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void searchForSmartphonesByName() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(6, "F6", 60, "Apple");
        Smartphone smartphone2 = new Smartphone(7, "GI7", 60, "Apple");
        Smartphone smartphone3 = new Smartphone(8, "H8", 60, "Apple");
        Smartphone smartphone4 = new Smartphone(9, "GI9", 60, "Apple");


        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] actual = {smartphone2, smartphone4};
        Product[] expected = manager.searchBy("GI");
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void searchForOneSmartphoneByName() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(6, "F6", 60, "Apple");
        Smartphone smartphone2 = new Smartphone(7, "G7", 60, "Apple");
        Smartphone smartphone3 = new Smartphone(8, "H8", 60, "Apple");
        Smartphone smartphone4 = new Smartphone(9, "I9", 60, "Apple");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] actual = {smartphone1};
        Product[] expected = manager.searchBy("F");
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void noSmartphoneFound() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(6, "F6", 60, "Apple");
        Smartphone smartphone2 = new Smartphone(7, "G7", 60, "Apple");
        Smartphone smartphone3 = new Smartphone(8, "H8", 60, "Apple");
        Smartphone smartphone4 = new Smartphone(9, "I9", 60, "Apple");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] actual = {};
        Product[] expected = manager.searchBy("Y");
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void thereNothingInRepo() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Product[] actual = {};
        Product[] expected = repo.findAll();
        ;
        Assertions.assertArrayEquals(expected, actual);
    }
    //61%\44%

    @Test
    public void searchForOneBookByName() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "AC1", 10, "A");
        Book book2 = new Book(2, "B2", 20, "B");
        Book book3 = new Book(3, "AC3", 30, "C");
        Book book4 = new Book(4, "D4", 40, "D");
        Book book5 = new Book(5, "E5", 50, "E");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] actual = {book2};
        Product[] expected = manager.searchBy("B");
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void noBooksFound() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "AC1", 10, "A");
        Book book2 = new Book(2, "B2", 20, "B");
        Book book3 = new Book(3, "AC3", 30, "C");
        Book book4 = new Book(4, "D4", 40, "D");
        Book book5 = new Book(5, "E5", 50, "E");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] actual = {};
        Product[] expected = manager.searchBy("Y");
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void AddAllSmartphone() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(6, "F6", 60, "Apple");
        Smartphone smartphone2 = new Smartphone(7, "G7", 60, "Apple");
        Smartphone smartphone3 = new Smartphone(8, "H8", 60, "Apple");
        Smartphone smartphone4 = new Smartphone(9, "I9", 60, "Apple");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] actual = {smartphone1, smartphone2, smartphone3, smartphone4};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void averageValueSmartphone() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(6, "F6", 60, "Apple");
        Smartphone smartphone2 = new Smartphone(7, "G7", 60, "Apple");
        Smartphone smartphone3 = new Smartphone(8, "H8", 60, "Apple");
        Smartphone smartphone4 = new Smartphone(9, "I9", 60, "Apple");
        manager.add(smartphone3);

        Product[] actual = {smartphone3};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}


