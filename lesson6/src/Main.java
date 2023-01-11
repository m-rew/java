import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание объектов класса Book
        Book book1 = new Book("Приключения", "Автор 1");
        Book book2 = new Book("Словарь", "Автор 2");
        Book book3 = new Book("Энциклопедия", "Автор 3");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во новых посетителей библиотеки: ");
        int n = scanner.nextInt();
        System.out.println();

        // Создание и заполнение массива объектами класса Reader
        Reader[] arrayReader = new Reader[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите параметры для читателя номер %,d \n", i + 1);
            arrayReader[i] = new Reader(
                    readFromConsole("ФИО: "),
                    readFromConsole("Номер читательского билета: "),
                    readFromConsole("Название факультета: "),
                    readFromConsole("Дата рождения: "),
                    readFromConsole("Номер телефона: ")
            );
            System.out.println();
        }

        // Проверка методов класса Reader
        for (Reader reader : arrayReader) {
            reader.takeBook(5);
            reader.returnBook(5);

            reader.takeBook("Приключения", "Словарь", "Энциклопедия");
            reader.returnBook("Приключения", "Словарь", "Энциклопедия");

            reader.takeBook(book1, book2, book3);
            reader.returnBook(book1, book2, book3);
        }
    }

    public static String readFromConsole(String msgToConsole) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msgToConsole);
        return scanner.nextLine();
    }
}