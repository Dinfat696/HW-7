public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        /*task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();*/
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2459000) {
            i++;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
            System.out.println();
            for (int i = 10; i > 0; i--) {
                System.out.print(i + " ");
            }
        }
    }
