public class Main {
   /* public static void main(String[] args) {
        int age = 5;
        if (age > 18) {
            System.out.println("Ты должен праздновать");
            if (age < 21) {
                System.out.println("Выпей сливочного пива");
            } else {
                System.out.println("Иди куда хочешь и пей что хочешь");
            }
        } else if (age > 7) {
            System.out.println("Иди в школу");
        } else {
            System.out.println("Иди в детский сад");
        }
        int age = 6;
        if (age == 18) {
            System.out.println("С окончанием школы");
        } else if (age == 21) {
            System.out.println("Теперь тебе можно пить алкоголь");
        } else if (age == 7) {
            System.out.println("Иди в школу");
        } else {
            System.out.println("Пока сказать нечего");
        }
    } */
   public static void main(String[] args) {
       task1();
       task2();
       task3();
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
        int year =  99;
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

    }
}