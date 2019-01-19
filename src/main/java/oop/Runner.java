package oop;

public class Runner {

    // .var = generates variable

    public static void main(String[] args) {
        String name;
        Sellable book = new Book();
        Sellable eBook = new EBook();
        Sellable magazine = new Magazine();
        book.buy();
        eBook.buy();
        magazine.buy();
        ((Book) book).name = "Aasdnas";
    }
}
