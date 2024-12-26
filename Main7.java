
//Задание 7
//Создайте класс Person, который имеет:
//
//Поля firstName и lastName (оба типа String).
//Конструктор для установки имени и фамилии.
//Метод getFullName(), который возвращает полное имя человека.


public class Main7 {
    public static class Person {
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;

        }

        public String getFullName() {
            return "полное имя человека :" + firstName + lastName;
        }
    }


    public static void main(String[] args) {
        Person person = new Main7.Person("Ivan ", "Ivanov");
        System.out.println(person.getFullName());
    }
}
