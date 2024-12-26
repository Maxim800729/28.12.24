//Задание 8
//Создайте класс Temperature, который имеет:
//
//Поле celsius (тип double).
//Конструктор для установки температуры в градусах Цельсия.
//        Методы toFahrenheit() и toKelvin(),
// которые возвращают температуру в Фаренгейтах и Кельвинах соответственно.


public class Main8 {
    public static class Temperature {
        private double celsius;

        public Temperature(double celsius) {
            this.celsius = celsius;
        }

        public double toFahrenheit() {
            return (celsius * 9 / 5) + 32;
        }

        public double toKelvin() {
            return celsius + 273.15;
        }

    }

    public static void main(String[] args) {
        Temperature temperature = new Temperature(30);
        System.out.println("температура в Фаренгейтах: " + temperature.toFahrenheit());
        System.out.println("температура в Кельвинах: " + temperature.toKelvin());
    }
}
