public class Main {
    public static void main(String[] args) {
        System.out.println ("Задача 1 ");
        int ball = 50;
        System.out.println ("Значение переменной ball с типом int равно " + ball );
        byte book = 100;
        System.out.println ("Значение переменной book с типом byte равно " + book );
        short stadium = 1000;
        System.out.println ("Значение переменной stadium с типом short равно " + stadium );
        long team = 888L;
        System.out.println ("Значение переменной team с типом long равно " + team );
        float cake = 3.5f;
        System.out.println ("Значение переменной cake с типом float равно " + cake );
        double game = 33.88888888;
        System.out.println ("Значение переменной game с типом double равно " + game );
        System.out.println ("Задача 2 ");
        int a = 27897;
        System.out.println (a);
        byte b = 2;
        System.out.println (b);
        short c = 786;
        System.out.println (c);
        long d = 987678965549L;
        System.out.println (d);
        float e = 27.12f;
        System.out.println (e);
        double f = 67.0;
        System.out.println (f );
        System.out.println ("Задача 3 ");
        byte classRoom1 = 23;
        System.out.println ("У Людмилы Павловны " +classRoom1+ " ученика");
        byte classRoom2 = 27;
        System.out.println ("У Анны Сергеевны " +classRoom2+ " учеников");
        byte classRoom3 = 30;
        System.out.println ("У Екатерины Андреевны " +classRoom3+ " учеников");
        short paper = 480;
        System.out.println ("Три учительницы закупили все вместе " +paper+ " листов бумаги на все три класса. ");
        int totalStudents = classRoom1 + classRoom2 + classRoom3;
        System.out.println ("Общее количество учеников в трёх классах: " + totalStudents);
        int oneStudentPaper = paper / totalStudents;
        System.out.println ("На каждого ученика рассчитано " +oneStudentPaper+ " листов бумаги.");
        System.out.println ("Задача 4 ");
        byte machineProductivity2Min = 16;
        System.out.println ("Производительность машины за 2 минуты " +machineProductivity2Min+ " бутылок");
        int machineProductivity20Min = machineProductivity2Min * 10;
        System.out.println ("За 20 минуту машина произвела бутылок " +machineProductivity20Min+ " штук");
        int machineProductivity1Day = machineProductivity20Min * 3 * 24;
        System.out.println ("За сутки машина произвела бутылок " +machineProductivity1Day+ " штук");
        int machineProductivity3Day = machineProductivity1Day * 3;
        System.out.println ("За 3 дня машина произвела бутылок " +machineProductivity3Day+ " штук");
        int machineProductivityMonth = machineProductivity3Day * 10;
        System.out.println ("За месяц машина произвела бутылок " +machineProductivityMonth+ " штук");

    }
}