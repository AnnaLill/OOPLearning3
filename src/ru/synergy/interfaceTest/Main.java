package ru.synergy.interfaceTest;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Danwich horror", "Lovecraft");
        book.print();
        book.print();
        book.read("This is runned appon the book");

        Book.Journal journal = new Book.Journal("Cosmopoliyan");
        journal.getName();
        journal.print();

        Printable printableJournal = journal;
        printableJournal.print();

    }
}

class Book extends Printable {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override

    public void print() {
        System.out.printf("%s (%s) \n",name, author);
    }

    static class Journal extends Printable {

        private String name;

        public String getName() {
            return name;
        }

        public Journal(String name) {
            this.name = name;
        }

        @Override
        public void print(){
            System.out.println(name);

        }


    }
}
