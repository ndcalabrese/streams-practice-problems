package ex10_books_from_file;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksFromFile {

    public static void main(String[] args) {
        List<Book> books = readBooks("src/ex10_books_from_file/books.txt");
        for ( Book book : books ) {
            System.out.println(book.toString() + "\n");
        }
    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(parts -> new Book(parts[0],
                            Integer.parseInt(parts[1]), Integer.parseInt(parts[2]),
                            parts[3]))
                    .forEach(books::add);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }

}
