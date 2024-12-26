
//Задание 2
//Создайте класс Rectangle, который имеет:
//
//Поля length и width (оба типа double).
//Конструктор для установки длины и ширины.
//Метод calculatePerimeter(), который возвращает периметр прямоугольника.


public class Main2 {
    public static class Rectangle {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double calculatePerimeter() {
            return length + width * 2;
        }
    }

    public static void main(String[] args) {
        Rectangle Rectangle = new Rectangle(5.0, 6);
        System.out.println("периметр прямоугольника = " + Rectangle.calculatePerimeter());
    }
}
