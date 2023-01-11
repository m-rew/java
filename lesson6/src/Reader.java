public class Reader {
    private String fio; // Фамилия, имя, отчество
    private String ticketNum; // Номер читательского билета
    private String faculty; // Название факультета
    private String dateOfBirth; // Дата рождения
    private String phoneNum; // Номер телефона

    public Reader(String fio, String ticketNum, String faculty, String dateOfBirth, String phoneNum) {
        this.fio = fio;
        this.ticketNum = ticketNum;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNum = phoneNum;
    }

    // Метод принимает количество взятых книг и выводит в консоль сообщение
    public void takeBook(int count) {
        System.out.printf("%s взял %,d книг(и)", this.fio, count);
        System.out.println();
    }

    // Метод принимает переменное количество названий книг и выводит в консоль сообщение
    public void takeBook(String... books) {
        String msgToConsole = String.format("%s взял книги: %s", this.fio, getStrBooksFromString(books));
        System.out.println(msgToConsole);
    }

    // Метод принимает переменное количество объектов класса Book и выводит в консоль сообщение
    public void takeBook(Book... books) {
        String msgToConsole = String.format("%s взял книги: %s", this.fio, getStrBooksFromObject(books));
        System.out.println(msgToConsole);
    }

    // Метод принимает количество взятых книг и выводит в консоль сообщение
    public void returnBook(int count) {
        System.out.printf("%s вернул %,d книг(и)", this.fio, count);
        System.out.println();
    }

    // Метод принимает переменное количество названий книг и выводит в консоль сообщение
    public void returnBook(String... books) {
        String msgToConsole = String.format("%s вернул книги: %s", this.fio, getStrBooksFromString(books));
        System.out.println(msgToConsole);
    }

    // Метод принимает переменное количество объектов класса Book и выводит в консоль сообщение
    public void returnBook(Book... books) {
        String msgToConsole = String.format("%s вернул книги: %s", this.fio, getStrBooksFromObject(books));
        System.out.println(msgToConsole);
    }

    // Метод принимает переменное количество строк и объединяет в одну строку с разделителем ',' и возвращает строку
    private String getStrBooksFromString(String... books) {
        String strBooks = "";
        int idx = 1;
        for (String book : books) {
            if (idx < books.length) {
                strBooks += String.format("%s, ", book);
            } else {
                strBooks += String.format("%s", book);
            }
            idx++;
        }
        return strBooks;
    }

    // Метод принимает переменное количество объектов и объединяет в одну строку значения
    // из метода полученного обхекта (getTitle()) с разделителем ',' и возвращает строку
    private String getStrBooksFromObject(Book... books) {
        String strBooks = "";
        int idx = 1;
        for (Book book : books) {
            if (idx < books.length) {
                strBooks += String.format("%s, ", book.getTitle());
            } else {
                strBooks += String.format("%s", book.getTitle());
            }
            idx++;
        }
        return strBooks;
    }
}