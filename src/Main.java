public class Main {
    public static void main(String[] args) {
        // Exercise 1
        int cat = 420;
        byte dog = 2;
        short pussyCat = 3;
        long champ = 10L;
        float curry = 5.0f;
        double samuel = 69;
        System.out.println("Значение переменной с типом int равно " + cat + System.lineSeparator() + "Значение переменной с типом byte равно " + dog + System.lineSeparator() + "Значени переменной с типом short равно " + pussyCat + System.lineSeparator() + "Значение перемнной с типом long равно " + champ + System.lineSeparator() + "Значение переменной с типом float равно " + curry + System.lineSeparator() + "Значение переменной с типов double равно " + samuel );
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
        byte firstPeriod = 20;
        short secondPeriod = 1440;
        short thirdPeriod = 4320;
        int fourthPeriod = 43200;
        System.out.println("За " + firstPeriod + " минут машина произвела " + firstPeriod / 2 + " штук бутылок" + System.lineSeparator() + "За " + secondPeriod + " минут машина произвела " + secondPeriod / 2 + " штук бутылок" + System.lineSeparator() +"За " + thirdPeriod + " минут машина произвела " + thirdPeriod / 2 + " штук бутылок" + System.lineSeparator() +"За " + fourthPeriod + " минут машина произвела " + fourthPeriod / 2 + " штук бутылок");;
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
        int mashaBeforeRaise =          67760;
        int denisBeforeRaise =          83690;
        int krisBeforeRaise =           76230;
        int yearIncomeMashaBefore =     mashaBeforeRaise * 12;
        int yearIncomeKrisBefore =      krisBeforeRaise * 12;
        int yearIncomeDenisBefore =     denisBeforeRaise * 12;
        int mashaAfterRaise =           ((mashaBeforeRaise / 100) * 10) + mashaBeforeRaise;
        int denisAfterRaise =           ((denisBeforeRaise / 100) *10) + denisBeforeRaise;
        int krisAfterRaise =            ((krisBeforeRaise / 100) * 10) + krisBeforeRaise;
        int yearIncomeMashaAfter =      ((yearIncomeMashaBefore / 100) *10) + yearIncomeMashaBefore;
        int yearIncomeDenisAfter =      ((yearIncomeDenisBefore / 100) * 10) + yearIncomeDenisBefore;
        int yearIncomeKrisAfter =       ((yearIncomeKrisBefore / 100) * 10) + yearIncomeKrisBefore;
        System.out.println("маша до повышения получала в месяц: " + mashaBeforeRaise + " в год: " + yearIncomeMashaBefore + ". после повышения: " + mashaAfterRaise + " и в год: " + yearIncomeMashaAfter + System.lineSeparator() + "денис получал до повышения в месяц: " + denisBeforeRaise + " и в год: " + yearIncomeDenisBefore + ". после повышения: " + denisAfterRaise + "  в месяц и в год: " + yearIncomeDenisAfter + System.lineSeparator() + "кристина получала до повышения " + krisBeforeRaise + " в месяц и в год: " + yearIncomeKrisBefore + ". после повышениея: " + krisAfterRaise + " в месяц и в год: " + yearIncomeKrisAfter);

    }
}