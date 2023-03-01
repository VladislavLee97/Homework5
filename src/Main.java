public class Main {
   public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task5();
   }
    public static void task1 () {
        System.out.println("Задача 1");
        byte clientOS = 0;
        
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte clientOS = 1;
        int year =  2013;
        if (year < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (year < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (year >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (year >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2400;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
       int deliveryDistance = 95;
       if (deliveryDistance <= 20) {
           System.out.println("Потребуется дней 1");
       } else if (deliveryDistance <= 60) {
               System.out.println("Потребуется дней 2");
           } else if (deliveryDistance <= 100) {
               System.out.println("Потребуется дней 3");
           } else {
               System.out.println("Доставки нет");
           }
       }
    public static void task5 () {
        System.out.println("Задача 5");
        byte monthNumber = 1;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + "-й месяц принадлежит сезону зима");
                break;
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит сезону зима");
                break;
            case 3:
                System.out.println(monthNumber + "-й месяц принадлежит сезону весна");
                break;
            case 4:
                System.out.println(monthNumber + "-й месяц принадлежит сезону весна");
                break;
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит сезону весна");
                break;
            case 6:
                System.out.println(monthNumber + "-й месяц принадлежит сезону лето");
                break;
            case 7:
                System.out.println(monthNumber + "-й месяц принадлежит сезону лето");
                break;
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит сезону лето");
                break;
            case 9:
                System.out.println(monthNumber + "-й месяц принадлежит сезону осень");
                break;
            case 10:
                System.out.println(monthNumber + "-й месяц принадлежит сезону осень");
                break;
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит сезону осень");
                break;
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}