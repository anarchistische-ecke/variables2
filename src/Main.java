public class Main {
    public static void main(String[] args) {
        // Exercise 1
        int cat = 420;
        byte dog = 2;
        short pussyCat = 3;
        long champ = 10L;
        float curry = 5.0f;
        double samuel = 69;
        System.out.println("Значение переменной cat с типом int равно " + cat + System.lineSeparator() + "Значение переменной dog с типом byte равно " + dog + System.lineSeparator() + "Значени переменной pussycat с типом short равно " + pussyCat + System.lineSeparator() + "Значение перемнной champ с типом long равно " + champ + System.lineSeparator() + "Значение переменной curry с типом float равно " + curry + System.lineSeparator() + "Значение переменной samuel с типов double равно " + samuel );
        // Exercise 2
        float one = 27.12f;
        long two = 987678965549L;
        double three = 2.786;
        short four = 569;
        short five = -159;
        int six = 27897;
        byte seven = 67;
        // Exercise 3
        byte lyuda = 23;
        byte ana = 27;
        byte kata = 30;
        short bumaga = 480;
        System.out.println("На каждого ученика расчитано " + bumaga / (lyuda + ana + kata) + " листов бумаги");
        // Exercise 4
        byte twentyMinutes = 20;
        short oneDay = 24 * 60;
        int threeDays = oneDay * 3;
        int aMonth = oneDay * 30;
        int bottlesPerMinute = 16 / 2;
        System.out.println("За " + twentyMinutes + " минут машина произвела " + twentyMinutes * bottlesPerMinute + " штук бутылок" + System.lineSeparator() + "За " + oneDay + " минут машина произвела " + oneDay * bottlesPerMinute + " штук бутылок" + System.lineSeparator() +"За " + threeDays + " минут машина произвела " + threeDays * bottlesPerMinute + " штук бутылок" + System.lineSeparator() +"За " + aMonth + " минут машина произвела " + aMonth * bottlesPerMinute + " штук бутылок");;
        // Exercise 5
        byte allPaint = 120;
        byte whitePaintNeededForOneRoom = 2;
        byte brownPaintNeededForOneRoom = 4;
        int rooms = allPaint / (whitePaintNeededForOneRoom + brownPaintNeededForOneRoom);
        System.out.println("В школе, где " + rooms + " классов, нужно " + whitePaintNeededForOneRoom * rooms + " банок белой краски и " + brownPaintNeededForOneRoom * rooms + " банок коричневой краски.");
        // Exercise 6
        byte oneBanana = 80;
        short allBananas = 5 * 80;
        byte oneMilk = 105;
        short allMilk = 2* 105;
        byte iceCream = 100;
        short allIceCream = 2 * 100;
        byte egg = 70;
        short allEggs = 70 * 4;
        double wholeWeight = allEggs + allBananas + allMilk + allIceCream;

        System.out.println("Вес завтрака в граммах равен " + wholeWeight + " граммам и " + wholeWeight / 1000 + " киллограммам");
        // Exercise 7
        short target = 7000;
        short minimumLoss = 250;
        short maximumLoss = 500;
        int averageLoss = (minimumLoss + maximumLoss) / 2;
        System.out.println("При похудении на 250 грамм в день 7 кг получится сбросить за " + target / minimumLoss + " дней. При 500 г в день: " + target / maximumLoss + " в среднем: " + target / averageLoss);
        // Exercise 8
        double percentRaise =              0.1;
        byte timePeriod =                  12;
        int mashaBeforeRaise =             67760;
        int denisBeforeRaise =             83690;
        int krisBeforeRaise =              76230;
        int yearIncomeMashaBefore =        mashaBeforeRaise * timePeriod;
        int yearIncomeKrisBefore =         krisBeforeRaise * timePeriod;
        int yearIncomeDenisBefore =        denisBeforeRaise * timePeriod;
        double mashaAfterRaise =           (mashaBeforeRaise * percentRaise) + mashaBeforeRaise;
        double denisAfterRaise =           (denisBeforeRaise * percentRaise) + denisBeforeRaise;
        double krisAfterRaise =            (krisBeforeRaise * percentRaise) + krisBeforeRaise;
        double yearIncomeMashaAfter =      (yearIncomeMashaBefore * percentRaise) + yearIncomeMashaBefore;
        double yearIncomeDenisAfter =      (yearIncomeDenisBefore * percentRaise) + yearIncomeDenisBefore;
        double yearIncomeKrisAfter =       (yearIncomeKrisBefore * percentRaise) + yearIncomeKrisBefore;
        System.out.println("Маша теперь получает " + mashaAfterRaise + " рублей. Годовой доход вырос на " + (yearIncomeMashaAfter - yearIncomeMashaBefore) + " рублей." + System.lineSeparator() + "Денис теперь получает " + denisAfterRaise + " рублей. Годовой доход вырос на " + (yearIncomeDenisAfter - yearIncomeDenisBefore) + " рублей." + System.lineSeparator() + "Кристина теперь получает " + krisAfterRaise + " рублей. Годовой доход вырос на " + (yearIncomeKrisAfter - yearIncomeKrisBefore));

    }
}