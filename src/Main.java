public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        /*task5();
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

    public static void task3() {
        System.out.println("\nЗадача 3");
        int people=12000000;
        int newBorn=people/1000*17;
        int die=people/1000*8;
        int year = 0;
        while (year<10) {
            year++;
            people=people+newBorn-die;
            System.out.println("Год " + year + " численность населения составляет " + people);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int total = 15000;
        int i=0;
        while (total <12000000) {
            i++;
            total = total+total/100*7;
            System.out.println("Месяц " +i+ " сумма накоплений равна " + total + "рублей");
        }
    }

}

