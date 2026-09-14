class BookInventoryP7K {
    String title;
    String author;
    int copiesAvailable;

    BookInventoryP7K(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void printEntry() {
        System.out.println(title + " by " + author + " - " + copiesAvailable + " copies available");
    }
}

public class LibraryInventoryManagementX4M {
    public static void main(String[] args) {
        BookInventoryP7K[] books = {
            new BookInventoryP7K("Clean Code", "Robert C. Martin", 3),
            new BookInventoryP7K("Effective Java", "Joshua Bloch", 5),
            new BookInventoryP7K("Refactoring", "Martin Fowler", 0),
            new BookInventoryP7K("Design Patterns", "GoF", 2)
        };

        for (BookInventoryP7K book : books) {
            book.printEntry();
        }
    }
}