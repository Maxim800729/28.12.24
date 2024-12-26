
//Задание 4
//Создайте класс Car, который имеет:
//
//Поля brand (тип String) и speed (тип int).
//Конструктор для установки бренда и начальной скорости.
// Метод accelerate(int increment), который увеличивает скорость на указанное значение.


public class Main4 {
    public static class Car {
        private String brand;
        private int speed;

        public Car(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        public void accelerate(int increment) {

            this.speed += increment;
            System.out.println("бренд " + brand + " начальная скорость " + speed);
        }
    }

    public static void main(String[] args) {

        Car car = new Car("Ford", 50);
        car.accelerate(20);
        car.accelerate(30);
    }
}
