package LC01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Code69 {
    private static int s;

    public static void main(String[] args) {
//        int[] abc = {5, 3, 6, 1, 12};
//        int num = 8;
//        System.out.println(mySqrt(num));



        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));

        System.out.println(listToMap(bookList));

    }

    public static Map<String, String> listToMap(List<Book> books) {
        return books.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));
    }

    public static int mySqrt(int x) {
        s = x;
        if (x == 0) {
            return 0;
        }
        return ((int) (sqrts(x)));

    }

    public static double sqrts(double x) {
        double res = (x + s / x) / 2;
        if (res == x) {
            return x;
        } else {
            return sqrts(res);
        }
    }

    static class Book {
        private String name;
        private int releaseYear;
        private String isbn;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public void setReleaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public Book(String name, int releaseYear, String isbn) {
            this.name=name;
            this.releaseYear=releaseYear;
            this.isbn=isbn;
        }

        // getters and setters
    }

}
