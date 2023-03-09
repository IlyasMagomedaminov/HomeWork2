public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1 () {
        System.out.println("Задача 1");
       byte cat = 100;
        System.out.println("bute cat = " + cat);
       short dog = 20000;
        System.out.println("short dog = " + dog);
       int duck = 283737449;
        System.out.println("int duck = " + duck);
       long fox = 837628536596875232L;
        System.out.println("long fox = " + fox);
       float cow = 8374.88398f;
        System.out.println("float cow = " + cow);
       double bigSheep = 8347730.90893039309;
        System.out.println("double bigSheep = " + bigSheep);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f,c = 2.786f;
        long b = 987678965549L;
        short h = 569,f = -159, r = 27897;
        byte t = 67;
        System.out.println(a + " , " + c + " , " + "" + b + " ," + h + " ," + f + " ," + r + " ," + t);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte yЛюдмилыПавловны = 23, уАнныСергеевны = 27,уЕкатериныАндреевны = 30;
        short allPaper = 480;

        int totalStudents = yЛюдмилыПавловны + уАнныСергеевны + уЕкатериныАндреевны;
        int paper = allPaper / totalStudents;

        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottle = 16/2;

        int twentyMites = 20 * bottle;
        System.out.println("За 20 минут машина произвела " + twentyMites + " штук бутылок");

        int day = 1440 * bottle;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");

        int threeDays = day * 3;
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");

        int month = day * 30;
        System.out.println("За месяц машина произвела " + month + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte repair = 120,whitePaint = 2,brownPaint = 4;

        int totalPaint = whitePaint + brownPaint;
        int numberOfClasses = repair / totalPaint;
        int totalWhitePaint = numberOfClasses * whitePaint;
        int totalBrownPaint = numberOfClasses * brownPaint;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        short banana = 5 * 80;
        short milk = (200 / 100) * 105;
        short iceCreamSundae = 2 * 100;
        short egg = 4 * 70;
        short kg = 1000;

        float totalWheight = banana + milk + iceCreamSundae + egg;
        float wheight = totalWheight / kg;

        System.out.println(wheight);
    }
    public static void task7() {
        System.out.println("Задача 7");

    }
    public static void task8() {
        System.out.println("Задвча 8");
        }

}