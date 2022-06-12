import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book("Leto", "Pushkin", 2020);
        while (true) {
            System.out.println("\n" + "Select a set and enter its number:");
            System.out.println("1.Up rating");
            System.out.println("2.Down rating");
            System.out.println("3.Write some text to end book");
            System.out.println("To end the program, type end");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operations = Integer.parseInt(input);
            switch (operations) {
                case 1 -> {
                    book.up();
                    System.out.println("Now rating is " + book.rating);
                    System.out.println(book);
                }
                case 2 -> {
                    book.down();
                    System.out.println("Now rating is " + book.rating);
                    System.out.println(book);
                }
                case 3 -> {
                    System.out.println("Add some text");
                    String moreText = scanner.nextLine();
                    book.append(moreText);
                    System.out.println("New text" + book.text);
                    System.out.println(book);
                }
                default -> System.out.println("Takoi operacii net");
            }
        }
    }
}