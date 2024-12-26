
//Задание 5
//Создайте класс Book, который имеет:
//
//Поля title (тип String) и author (тип String).
//Конструктор для установки названия книги и автора.
//        Метод getBookInfo(), который возвращает строку с информацией о книге.


public class Main5 {
    public static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getBookInfo() {
            return "названия книги : " + title + ", автор :" + author;
        }
    }

    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell");
        System.out.println(book.getBookInfo());
    }
}
