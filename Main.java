import model.*;
import service.Library;
import utils.InputHelper;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Show All Books");
            System.out.println("4. Lend Book");
            System.out.println("5. Exit");
            String choice = InputHelper.prompt("Choose an option: ");

            switch (choice) {
                case "1" -> {
                    String id = InputHelper.prompt("Enter Book ID: ");
                    String title = InputHelper.prompt("Enter Title: ");
                    String author = InputHelper.prompt("Enter Author: ");
                    library.addBook(new Book(id, title, author));
                }
                case "2" -> {
                    String id = InputHelper.prompt("Enter Member ID: ");
                    String name = InputHelper.prompt("Enter Name: ");
                    library.registerMember(new Member(id, name));
                }
                case "3" -> library.showAllBooks();
                case "4" -> {
                    String bookId = InputHelper.prompt("Enter Book ID: ");
                    String memberId = InputHelper.prompt("Enter Member ID: ");
                    library.lendBook(bookId, memberId);
                }
                case "5" -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
