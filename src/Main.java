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
        System.out.println ("Задача 5 ");
        byte whitePaintPot = 2;
        byte brownPaintPot = 4;
        System.out.println ("На ремонт одного класса требуется: " +whitePaintPot+ " банки белой краски и " +brownPaintPot+ " банки коричневой краски");
        int totalPaintPotClassroom = whitePaintPot + brownPaintPot;
        System.out.println ("На ремонт одного класса требуется всего: " +totalPaintPotClassroom+ " банок краски");
        int totalPaintPotSchool = 120;
        System.out.println ("На ремонт школы требуется всего: " +totalPaintPotSchool+ " банок краски");
        int totalClassroom = totalPaintPotSchool/totalPaintPotClassroom;
        System.out.println ("Всего классов в школе: " +totalClassroom);
        int totalWhitePaintPot = whitePaintPot * totalClassroom;
        int totalBrownPaintPot = brownPaintPot * totalClassroom;
        System.out.println ("В школе, где " +totalClassroom+ " классов, нужно " +totalWhitePaintPot+ " банок белой краски и " +totalBrownPaintPot+ " банок коричневой краски.");
        System.out.println ("Задача 6 ");
        byte banana = 80;
        byte milk100Ml = 105;
        byte iceCreamBriquette = 100;
        byte egg = 70;
        System.out.println ("Банан весит: " +banana+ " грамм");
        System.out.println ("Молоко 100 мл весит: " +milk100Ml+ " грамм");
        System.out.println ("Мороженое один брикет весит: " +iceCreamBriquette+ " грамм");
        System.out.println ("Яйцо весит: " +egg+ " грамм");
        int bananas5 = banana * 5;
        int milk200Ml = milk100Ml * 2;
        int iceCream2Briquette = iceCreamBriquette * 2;
        int egg4 = egg * 4;
        System.out.println ("Вес всех бананов по рецепту: " +bananas5+ " грамм");
        System.out.println ("Вес молока по рецепту: " +milk200Ml+ " грамм");
        System.out.println ("Вес мороженого по рецепту: " +iceCream2Briquette+ " грамм");
        System.out.println ("Вес яйц по рецепту: " +egg4+ " грамм");
        int sportsBreakfast = bananas5 + milk200Ml + iceCream2Briquette + egg4;
        System.out.println ("Вес завтрака спорсмена по рецепту: " +sportsBreakfast+ " грамм");
        float sportsBreakfastKg = sportsBreakfast/1000f;
        System.out.println ("Вес завтрака спорсмена по рецепту: " +sportsBreakfastKg+ " кг.");
        System.out.println ("Задача 7 ");
        short oneDayWeightOut1 = 250;
        short oneDayWeightOut2 = 500;
        short totalWeightOut = 7;
        System.out.println ("Спортсмен теряет вес за один день: " +oneDayWeightOut1+ " грамм.");
        System.out.println ("Спортсмен теряет вес за один день: " +oneDayWeightOut2+ " грамм.");
        System.out.println ("Спортсмен должен сбросить вес: " +totalWeightOut+ " кг.");
        float oneDayWeightOut1Kg = oneDayWeightOut1 / 1000f;
        float oneDayWeightOut2Kg = oneDayWeightOut2 / 1000f;
        System.out.println ("Спортсмен теряет вес за один день: " +oneDayWeightOut1Kg+ " кг.");
        System.out.println ("Спортсмен теряет вес за один день: " +oneDayWeightOut2Kg+ " кг.");
        float totalDayWeightOut1Kg = totalWeightOut / oneDayWeightOut1Kg;
        float totalDayWeightOut2Kg = totalWeightOut / oneDayWeightOut2Kg;
        System.out.println ("Спортсмен теряет вес " +totalWeightOut+ " кг за " +totalDayWeightOut1Kg+ " дней при ежедневном сбросе 250 грамм.");
        System.out.println ("Спортсмен теряет вес " +totalWeightOut+ " кг за " +totalDayWeightOut2Kg+ " дней при ежедневном сбросе 500 грамм.");
        float averageWeightOutDays = (totalDayWeightOut1Kg + totalDayWeightOut2Kg)/2;
        System.out.println ("В среднем спортсмен теряет вес: " +totalWeightOut+ " кг за " +averageWeightOutDays+ " дней.");
        System.out.println ("Задача 8 ");
        int wagesMonthMasha = 67760;
        int wagesMonthDenis = 83690;
        int wagesMonthKristina = 76230;
        System.out.println ("Маша получает в месяц: " +wagesMonthMasha+ " рублей.");
        System.out.println ("Денис получает в месяц: " +wagesMonthDenis+ " рублей.");
        System.out.println ("Кристина получает в месяц: " +wagesMonthKristina+ " рублей.");
        int wagesYearMasha = wagesMonthMasha *12;
        int wagesYearDenis = wagesMonthDenis * 12;
        int wagesYearKristina = wagesMonthKristina * 12;
        System.out.println ("Маша получает в год: " +wagesYearMasha+ " рублей.");
        System.out.println ("Денис получает в год: " +wagesYearDenis+ " рублей.");
        System.out.println ("Кристина получает в год: " +wagesYearKristina+ " рублей.");
        float wagesMonthMashaUp = wagesMonthMasha * 1.1f;
        float wagesMonthDenisUp = wagesMonthDenis * 1.1f;
        float wagesMonthKristinaUp = wagesMonthKristina *1.1f;
        System.out.println ("После увеличения зарплаты на 10%, Маша получает в месяц: " +wagesMonthMashaUp+ " рублей.");
        System.out.println ("После увеличения зарплаты на 10%, Денис получает в месяц: " +wagesMonthDenisUp+ " рублей.");
        System.out.println ("После увеличения зарплаты на 10%, Кристина получает в месяц: " +wagesMonthKristinaUp+ " рублей.");
        float wagesYearMashaUp = wagesMonthMashaUp * 12;
        float wagesYearDenisUp = wagesMonthDenisUp * 12;
        float wagesYearKristinaUp = wagesMonthKristinaUp * 12;
        System.out.println ("После увеличения зарплаты на 10%, Маша получает в год: " +wagesYearMashaUp+ " рублей.");
        System.out.println ("После увеличения зарплаты на 10%, Денис получает в год: " +wagesYearDenisUp+ " рублей.");
        System.out.println ("После увеличения зарплаты на 10%, Кристина получает в год: " +wagesYearKristinaUp+ " рублей.");
        float wageDifferenceYearMasha = wagesYearMashaUp - wagesYearMasha;
        float wageDifferenceYearDenis = wagesYearDenisUp - wagesYearDenis;
        float wageDifferenceYearKristina = wagesYearMashaUp - wagesYearMasha;
        System.out.println ("Маша теперь получает в месяц: " +wagesMonthMashaUp+ " рублей. Годовой доход вырос на : " +wageDifferenceYearMasha+ " рублей.");
        System.out.println ("Денис теперь получает в месяц: " +wagesMonthDenisUp+ " рублей. Годовой доход вырос на : " +wageDifferenceYearDenis+ " рублей.");
        System.out.println ("Кристина теперь получает в месяц: " +wagesMonthKristinaUp+ " рублей. Годовой доход вырос на : " +wageDifferenceYearKristina+ " рублей.");
        System.out.println ("ДЗ выполнено! ");
    }
}