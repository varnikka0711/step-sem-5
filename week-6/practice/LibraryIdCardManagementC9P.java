class IdCardR4V {
    String name;
    int booksIssued;

    IdCardR4V(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
}

public class LibraryIdCardManagementC9P {
    public static void main(String[] args) {
        IdCardR4V ravi = new IdCardR4V("Ravi", 0);

        IdCardR4V duplicate = ravi;
        duplicate.booksIssued = 3;

        IdCardR4V separate = new IdCardR4V("Ravi", 3);

        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}