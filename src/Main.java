public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age1 = 20;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ",то он совершенолетний");
        }
        int age2 = 14;
        if (age2 < 18) ;
        System.out.println("Если возраст человека равен " + age2 + ",то он не достиг совершеннолетия, нужно немного подождать");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temperature1 = 0;
        if (temperature1 < 5) {
            System.out.println("На улице " + temperature1 + " градусов, нужно надеть шапку");
        }
        int temperature2 = 8;
        if (temperature2 >= 5) {
            System.out.println("На улице " + temperature2 + " градусов, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 59;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");



}

