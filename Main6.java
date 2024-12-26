
//Задание 6
//Создайте класс Point, который имеет:
//
//Поля x и y (оба типа int).
//Конструктор для установки координат точки.
//  Метод move(int dx, int dy),
//  который изменяет координаты точки на заданное смещение.


public class Main6 {
    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void move(int dx, int dy) {
            this.x += dx;
            this.y += dy;
        }

        public void displayCoordinates() {
            System.out.println("координаты точки: ( " + x + " ," + y + " ) ");
        }

    }

    public static void main(String[] args) {
        Point point = new Point(5, 9);
        point.displayCoordinates();
        point.move(2, -7);
        point.displayCoordinates();
    }
}

