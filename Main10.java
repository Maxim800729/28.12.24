//Задание 10
//Создайте класс Time, который имеет:
//
//Поля hours и minutes (оба типа int).
//Конструктор для установки времени.
//Метод addMinutes(int minutes),
// который добавляет заданное количество минут к времени
// и корректно обновляет часы.


public class Main10 {
    public static class Time {
        private int hours;
        private int minutes;

        public Time(int hours, int minutes) {
            this.hours = hours;
            this.minutes = minutes;
        }

        public void addMinutes(int minutesToAdd) {
            int totalMinutes = this.minutes + minutesToAdd;
            this.hours += totalMinutes / 60;
            this.minutes = totalMinutes % 60;
            this.hours %= 24;
        }

        public void displayTime() {
            System.out.printf("Time: %02d:%02d\n", hours, minutes);

        }
    }

    public static void main(String[] args) {

        Time time = new Time(10, 54);
        time.displayTime();

        time.addMinutes(30);
        time.displayTime();
        time.addMinutes(120);
        time.displayTime();
        time.addMinutes(300);
        time.displayTime();


    }


}
