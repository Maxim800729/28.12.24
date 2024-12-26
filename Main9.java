//Задание 9
//Создайте класс Counter, который имеет:
//
//Поле count (тип int), изначально равное 0.
//Метод increment(), который увеличивает значение поля на 1.
//Метод decrement(), который уменьшает значение поля на 1.
//Метод getCount(), который возвращает текущее значение счетчика.


public class Main9 {
    public static class Counter {
        private int count = 0;

        public void increment() {
            count++;
        }

        public void decrement() {
            count--;
        }

        public int getCount() {
            return count;
        }

    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        System.out.println("текущее значение счетчика: " + counter.getCount());
        counter.increment();
        System.out.println("текущее значение счетчика: " + counter.getCount());
        counter.decrement();
        System.out.println("текущее значение счетчика: " + counter.getCount());
    }
}
