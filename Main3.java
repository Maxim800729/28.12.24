//
//Задание 3
//Создайте класс Student, который имеет:
//
//Поля name (тип String) и age (тип int).
//Конструктор для установки имени и возраста.
//Метод displayInfo(), который выводит имя и возраст студента в консоль.


public class Main3 {

    public static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;

        }

        public void displayInfo() {
            System.out.println("имя " + name + " ,возраст " + age);
        }
    }

    public static void main(String[] args) {

        Student student = new Student("Ivan Ivanov", 20);
        student.displayInfo();
    }
}
