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

    private static void task1() {
        System.out.println("\nЗадача 1");
        byte maxBite = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        float maxFloat = 3.4028235E38F;
        double maxDouble = 1.7976931348623157E308;
        System.out.println("Значение переменной maxBite с типом byte равно " + maxBite);
        System.out.println("Значение переменной maxShort с типом short равно " + maxShort);
        System.out.println("Значение переменной maxInt с типом int равно " + maxInt);
        System.out.println("Значение переменной maxFloat с типом float равно " + maxFloat);
        System.out.println("Значение переменной maxDouble с типом double равно " + maxDouble);
    }

    private static void task2() {
        System.out.println("\nЗадача 2");
        double d1 = 27.12;
        long l1 = 987_678_965_549L;
        float f1 = 2.786F;
        short s1 = 569;
        short s2 = -159;
        int i1 = 27897;
        byte b = 67;
    }

    private static void task3() {
        System.out.println("\nЗадача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int students = class1 + class2 + class3;
        short paper = 480;
        int paperForStudent = paper / students;
        System.out.println(
                "На каждого ученика рассчитано " + paperForStudent + " листов бумаги"
        );
    }

    private static void task4() {
        System.out.println("\nЗадача 4");
        byte productivityInTwoMinutes = 16;
        byte twoMinutes = 2;
        int productivityInOneMinutes = productivityInTwoMinutes / twoMinutes;
        byte twentyMinutes = 20;
        int productivityInTwentyMinutes = productivityInOneMinutes * twentyMinutes;
        System.out.println("За 20 минут машина произвела " + productivityInTwentyMinutes + " штук бутылок");
        byte minutesInAnHour = 60;
        byte hoursInADay = 24;
        int minutesPerDay = minutesInAnHour * hoursInADay;
        int productivityInTwentyFourHours = productivityInOneMinutes * minutesPerDay;
        System.out.println("В сутки машина произвела " + productivityInTwentyFourHours + " штук бутылок");
        byte threeDays = 3;
        int minutesInThreeDays = minutesPerDay * threeDays;
        int productivityInThreeDays = productivityInOneMinutes * minutesInThreeDays;
        System.out.println("За 3 дня машина произвела " + productivityInThreeDays + " штук бутылок");
        byte daysInAMonth = 31;
        int minutesInAMonth = minutesPerDay * daysInAMonth;
        int productivityInTOneMonth = productivityInOneMinutes * minutesInAMonth;
        System.out.println("За 1 месяц машина произвела " + productivityInTOneMonth + " штук бутылок");
    }

    private static void task5() {
        System.out.println("\nЗадача 5");
        byte whitePaintConsumption = 2;
        byte brownPaintConsumption = 4;
        int consumption = brownPaintConsumption + whitePaintConsumption;
        byte cansOfPaint = 120;
        int classes = cansOfPaint / consumption;
        int whitePaint = classes * whitePaintConsumption;
        int brownPaint = classes * brownPaintConsumption;
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
    }

    private static void task6() {
        System.out.println("\nЗадача 6");
        byte bananas = 5;
        byte bananaWeightOfOneInGrams = 80;
        int bananasWeight = bananas * bananaWeightOfOneInGrams;
        short milkMl = 200;
        byte milkWeightInGrams100Ml = 105;
        int milkWeight = milkMl * milkWeightInGrams100Ml;
        byte iceCream = 2;
        byte iceCreamWeightOfOneInGrams = 100;
        int iceCreamWeight = iceCream * iceCreamWeightOfOneInGrams;
        byte eggs = 2;
        byte eggWeightOfOneInGrams = 70;
        int eggsWeight = eggs * eggWeightOfOneInGrams;
        int breakfastWeightInGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float grPerKg = 1000;
        float breakfastWeightInKilograms = breakfastWeightInGrams / grPerKg;
        System.out.println("Вес спортзавтрака равен " + breakfastWeightInGrams + " грамм или " + breakfastWeightInKilograms + " килограмм");
    }

    private static void task7() {
        System.out.println("\nЗадача 7");
        byte excessWeightInKilograms = 7;
        int excessWeightInGrams = excessWeightInKilograms * 1000;
        short weightLossMin = 250;
        short weightLossMax = 500;
        int minDays = excessWeightInGrams / weightLossMin;
        int maxDays = excessWeightInGrams / weightLossMax;
        int midDays = (minDays + maxDays) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, на похудение он потратит " + minDays + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, на похудение он потратит " + maxDays + " дней");
        System.out.println("В среднем, чтобы добиться результата похудения может потребоваться " + midDays + " дней");
    }

    private static void task8() {
        System.out.println("\nЗадача 8");
        byte percentageSalaryIncrease = 10;
        byte monthsOfTheYear = 12;
        double maryMonthlySalary = 67_760;
        double salaryIncrease = maryMonthlySalary / 100D * percentageSalaryIncrease;
        double newMonthlySalary = salaryIncrease + maryMonthlySalary;
        double yearSalary = maryMonthlySalary * monthsOfTheYear;
        double newYearSalary = newMonthlySalary * monthsOfTheYear;
        double profitPerYear = newYearSalary - yearSalary;
        System.out.println("Маша теперь получает " + newMonthlySalary + " рублей в месяц. Годовой доход вырос на " + profitPerYear + " рублей");
        double denisMonthlySalary = 83_690;
        salaryIncrease = denisMonthlySalary / 100D * percentageSalaryIncrease;
        newMonthlySalary = salaryIncrease + denisMonthlySalary;
        yearSalary = denisMonthlySalary * monthsOfTheYear;
        newYearSalary = newMonthlySalary * monthsOfTheYear;
        profitPerYear = newYearSalary - yearSalary;
        System.out.println("Денис теперь получает " + newMonthlySalary + " рублей в месяц. Годовой доход вырос на " + profitPerYear + " рублей");
        double kristinaMonthlySalary = 76_230;
        salaryIncrease = kristinaMonthlySalary / 100D * percentageSalaryIncrease;
        newMonthlySalary = salaryIncrease + kristinaMonthlySalary;
        yearSalary = kristinaMonthlySalary * monthsOfTheYear;
        newYearSalary = newMonthlySalary * monthsOfTheYear;
        profitPerYear = newYearSalary - yearSalary;
        System.out.println("Кристина теперь получает " + newMonthlySalary + " рублей в месяц. Годовой доход вырос на " + profitPerYear + " рублей");
    }

}
