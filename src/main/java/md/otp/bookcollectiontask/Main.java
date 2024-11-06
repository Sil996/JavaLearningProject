package md.otp.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book 1", "Author 1");
        Book book2 = new Book("Book 2", "Author 2");
        Book book3 = new Book("Book 3", "Author 3");

        Library library001 = new Library("Carturesti mall");
        Library library002 = new Library("Fat Frumos");

        library001.addBook(book1);
        library001.addBook(book1);
        library001.addBook(book1);

        System.out.println(library001.getTotalNumberOfBooks());
        System.out.println(library002.getTotalNumberOfBooks());

        library002.addBook(book1);
        library002.addBook(book2);
        library002.addBook(book3);
        library002.addBooksFromAnotherList(library001.bookList);

        library002.removeBookFromTheStock(book2);

        System.out.println(library002.getTotalNumberOfBooks());

        library002.displayTheBookTitles();


        Map<String, Library> reteuaDeLibrarii = new HashMap<>();

        reteuaDeLibrarii.put("Arborilor22/1", library001);
        reteuaDeLibrarii.put("Stefan cel Mare 143", library001);

        reteuaDeLibrarii.get("Arborilor 22/1").displayTheBookTitles();
        reteuaDeLibrarii.get("Stefan cel Mare 143").displayTheBookTitles();


        int[] integers = new int[5];
        integers[0] = 3;
        integers[1] = 7;
        integers[2] = 8;
        integers[3] = 3424;
        integers[4] = 21;
        System.out.println(integers.length);
        System.out.println(IntNumberArrayService.maxIntFromArray(integers));
        System.out.println(IntNumberArrayService.arithmeticAverage(integers));


    }
}
