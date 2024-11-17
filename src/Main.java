public class Main {
    public static void main(String[] args) {

        //Задача 1

        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия. Нужно немного подождать");
        }

        //Задача 2

        int temperature = 6;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " граддусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " граддусов, можно идти без шапки");
        }

        //Задача 3

        int speed = 60;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }

        //Задача 4

        int age1 = 1;
        if (age1 >=2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        }
        if (age1 >=7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то его место в университете");
        }
        if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу");
        }

        //Задача 5

        int age2 = 15;
        if (age2 <= 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то он не может кататься без сопровождения родителей");
        }
        else if (age2 > 5 && age2 <= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то он может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age2 + ", то он может кататься без сопровождения взрослого");
        }

        //Задача 6

        int capacity = 102;
        int people = 101;
        int seats = 60;
        if (seats < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (seats >= 60 && people < capacity) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }

        //Задача 7

        int one = 4;
        int two = 7;
        int three = 7;
        if (one > two && one > three) {
            System.out.println("Первое число больше второго и третьего");
        } else if (one < two && two > three) {
            System.out.println("Второе число больше первого и тертьего");
        } else {
            System.out.println("третье число больше первого и второго");
        }

    }
}