// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task5();
        task6();
    }
    public static void task1() {
        System.out.println("Задание 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Он совершеннолетия");
        }

            if (age < 18) {
                System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
            }
        }
        public static void task2() {
        System.out.println("Задание 2");
        int temperatura = 10;
        if (temperatura >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");}
        if (temperatura < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");}
        }
        public static void task3() {
        System.out.println("Задание 3");
        int speed = 40;
        if (speed >= 60) {
            System.out.println("Придется заплатить штраф");}
        if (speed <60) {
            System.out.println("Можно ездить спокойно");}
        }
        public static void task5() {
        System.out.println("Задание 5");
        int age = 15;
        if (age < 2) {
            System.out.printf(" Если возраст ребенка меньше 5, то они не может кататься на аттракционах");}
        if (age == 5 || age < 14) {
            System.out.printf(" Если возраст ребенка равен 5 или больше, но меньше 14, то он может кататься, но только с сопровожднием взрослых");}
        if (age > 14){
            System.out.printf(" Если возраст ребенка больше 14, то он может кататься без сопровождения");}
        }
        public static void task6() {
            System.out.printf(" Задание 6 ");
            int capacityOfOneWagon = 106;
            int theNumberOfPeopleInTheCarriage = 77;
            System.out.printf("Колличество людей в поезде = " + theNumberOfPeopleInTheCarriage);
            if (theNumberOfPeopleInTheCarriage >=1 && theNumberOfPeopleInTheCarriage <= 60) {
                System.out.printf("Есть место сидячее"); }
            else if (theNumberOfPeopleInTheCarriage > 60 && theNumberOfPeopleInTheCarriage <102) {
                System.out.printf(" Есть стоячее место"); }
            else {System.out.printf(" Вагон полностью занят");}
        }
        }




