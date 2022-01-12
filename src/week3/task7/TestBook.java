package week3.task7;

public class TestBook {

    public static void main(String[] args) {

        Author anAuthor = new Author("James M.", "james.m@authors.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
        // Use an anonymous instance of Author
        Book anotherBook = new Book("more Java for dummy", new Author(), 29.95, 888);

        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());

        System.out.println(aBook.toString());

        System.out.println(aBook.getAuthorName());
        System.out.println(aBook.getAuthorEmail());
        System.out.println(aBook.getAuthorGender());

    }

}
