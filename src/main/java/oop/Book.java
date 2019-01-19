package oop;


public class Book extends InfoStorage implements Readable, Sellable {
    public void read() {

    }

    public void read(Book book) {
        book.read();
    }

    public void read(Book book, int listen) {

    }

    public void read(String book, int listen) {

    }

    public void read(int listen, String book) {

    }

    public String getContent() {
        return null;
    }
}
