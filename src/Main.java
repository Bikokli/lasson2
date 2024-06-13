import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //   System.out.println("Введите длину первой стороны в м");
        //  int length1 = Scanner.nextInt();
        //  System.out.println("Ввести длину второй стороны в м");
        // int length2 = Scanner.nextInt();

        //int perimeter = calceletePerimeter(length1, length2);
        //int area = calculeteArea(length1, length2);
        //System.out.println("Периметр участка " + perimeter + " см");
        //System.out.println("Площаль участка " + area + " см.кв");

        //Домашка Задача 1. Сумматор
        //https://github.com/netology-code/java-homeworks/tree/master/program-structure/1.2.1

        System.out.println("Первае залание");
        System.out.println("Введите первое число");
        int number1 = Scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = Scanner.nextInt();
        System.out.println("Введите третье число");
        int number3 = Scanner.nextInt();

        int equals = calculate(number1, number2, number3);
        System.out.println("сумма равна " + equals);
        System.out.println("ты молодец!!!!!!");
        System.out.println();


        //Задача 2. Расчет площади круга и длины его окружности
        //https://github.com/netology-code/java-homeworks/tree/master/program-structure/1.2.2

        System.out.println("Второе задание");
        System.out.println("Введите радиус окружности в сантиметрах");
        int number = Scanner.nextInt();
        double radius = radiusCercle(number);
        double length = circumFerence(number);
        System.out.println("Площадь круга " + radius);
        System.out.println("Длина окружности: " + length);
        System.out.println("Ты справился )))");

    }


    static double radiusCercle(int radius) {
        double PI = 3.14;
        return PI * radius * radius;
    }

    static double circumFerence(int radius) {
        double PI = 3.14;
        return 2 * PI * radius;
    }

    static int calculate(int one, int two, int three) {
        return (one + two + three);
    }

    static int calceletePerimeter(int height, int width) {
        return 2 * (height + width);
    }


    static int calculeteArea(int height, int width) {
        return height * width;
    }

}
