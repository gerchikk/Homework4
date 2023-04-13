public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
        int age = 25;
        if (age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else  {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 20;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на атракционе");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении " +
                    "взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int totalPlace = 102;
        int sitPlace = 60;
        int place = 60;
        int otherSitPlace = sitPlace - place;
        int otherStayPlace = totalPlace - place;
        if (place < sitPlace) {
            System.out.println("В вагоне остались есть сидящие места, осталось " + otherSitPlace + " мест");
        } else if (place >= sitPlace && place < totalPlace) {
            System.out.println("В вагоне остались только стоячие места, осталось " + otherStayPlace + " мест");
        } else {
            System.out.println("В вагоне не осталось мест");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 9;
        int two = 4;
        int three = 4;
        if (one >= two && one >= three) {
            System.out.println("Самое большое число - " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Самое большое число - " + two);
        } else {
            System.out.println("Самое большое число - " + three);
        }
    }
}









