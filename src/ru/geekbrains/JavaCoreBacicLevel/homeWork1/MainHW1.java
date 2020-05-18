package ru.geekbrains.JavaCoreBacicLevel.homeWork1;

public class MainHW1 {

    public static void main(String[] args) { // задание 1

        byte a = -100;
        short b = 0;
        int c = 20000;
        long d = 500L; // или то же самое: long d = (long) 500;
        float f = 13.25f; // или то же самое: float f = (float) 13.25;
        double g = -573.007;
        char h = '\u2242';
        boolean i = false;  // задание 2

        System.out.println(task3(5.15f, 7.76f, 10.17f, 2.64f)); // проверка работоспособности метода из 3 задания

        System.out.println(task4(7, 5));
        System.out.println(task4(3, 4)); // проверка работоспособности метода из 4 задания

        task5(10);
        task5(-5);  // проверка работоспособности метода из 5 задания

        System.out.println(task6(-15));
        System.out.println(task6(5));  // проверка работоспособности метода из 6 задания

        task7("Фанзиль"); // проверка работоспособности метода из 7 задания

        leapYear(1);
        leapYear(8);
        leapYear(100);
        leapYear(300);
        leapYear(400);
        leapYear(1015);
        leapYear(2000);
        leapYear(2020);  // проверка работоспособности метода из 8 задания

    }

    public static float task3(float a, float b, float c, float d){
        return a * (b + (c / d));
    }   // задание 3

    public static boolean task4(int a, int b){
        return (a + b) >= 10 && (a + b) <= 20;
    } // задание 4

    public static void task5(int a){
        if(a >= 0) System.out.println("Переданное число является положительным!");
        else System.out.println("Переданное число является отрицательным!");
    } // задание 5

    public static boolean task6(int a){
        return a < 0;
    }  // задание 6

    public static void task7(String name){
        System.out.println("Привет, " + name + "!");
    } // задание 7

    public static void leapYear(int a){
        if (a % 400 == 0) System.out.println(a + " год - это високосный год!");
        else if (a % 4 > 0 || a % 100 == 0) System.out.println(a + " год - это не високосный год!");
        else System.out.println(a + " год - это високосный год!");
    }  // задание 8

}
