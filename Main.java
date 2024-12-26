
//Задание 1
//Создайте класс Circle, который имеет:
//
//Поле radius (тип double).
//Конструктор для установки радиуса.
//Метод calculateArea(), который возвращает площадь круга.
public class Main {

    public static class Circle {
        private double radius;//pole radiusa

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("площадь круга" + circle.calculateArea());
    }
}
