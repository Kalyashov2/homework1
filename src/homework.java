public class homework {
    public static void main(String[] args) {
        byte banana =  3;
        System.out.println("Значение переменной banana с типом byte равно " + banana);
        short potato = 20;
        System.out.println("Значение переменной potato с типом short равно " + potato);
        int vegetables = 40;
        System.out.println("Значение переменной vegetables с типом int равно " + vegetables);
        long carrot = 60;
        System.out.println("Значение переменной carrot с типом long равно " + carrot);
        float radish = 4500;
        System.out.println("Значение переменной radish с типом float равно " + radish);
        double pineapple = 3.5;
        System.out.println("Значение переменной pineaplle с типом double равно " + pineapple);
        char letter = 71;
        System.out.println("Значение переменной letter с типом char равно " + letter);
        int age = 28;
        boolean age2 = age > 18;
        System.out.println("Значение переменной age2 с типом boolean равно " + age2);

        float pie = 27.12F;
        System.out.println(pie);
        float largeNumber = 987678965549F;
        System.out.println(largeNumber);
        float cucumber = 2.786F;
        System.out.println(cucumber);
        int height = 30;
        boolean height2 = height >= 40;
        System.out.println(height2);
        long slime = 569;
        System.out.println(slime);
        short window = -159;
        System.out.println(window);
        short apple = 27897;
        System.out.println(apple);
        int telephone = 67;
        System.out.println(telephone);

        byte LudmilaClass = 23;
        byte AnnaKlass = 27;
        byte EkaterinaKlass = 30;
        short paper = 480;
        int amountStudents = AnnaKlass + LudmilaClass + EkaterinaKlass;
        int sheets = paper / amountStudents;
        System.out.println("На каждого ученика расчитано " + sheets + " листов бумаги");

        int twoMinutes = 16;
        int minute = 16 / 2;
        int twelveMinute = minute * 20;
        System.out.println("За 20 минут машины привезли бутылок " + twelveMinute
        + " штук");
        int day = minute * 1440;
        System.out.println("За день машины привезли бутылок " + day + " штук");
        int threeDay = day * 3;
        System.out.println("За 3 дня машины привезли бутылок " + threeDay + " штук");
        int month = day * 30;
        System.out.println("За месяц машины привезли бутылок " + month + " штук");

        int totalPaint = 120;
        int totalClasses = totalPaint / 6;
        int whitePaint = 2 * totalClasses;
        int brownPaint = 4 * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint + " банок белой краски" +
                " и " + brownPaint + " банок коричневой краски");

        int banana2 = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int grammCocktail = banana2 * 5 + milk * 2 + iceCream * 2 + egg * 4;
        System.out.println(grammCocktail + " грамм");
        int kilogramCocktail = grammCocktail / 1000;
        System.out.println(kilogramCocktail + " кг");

        int weightKilograms = 7;
        int weightGramms = weightKilograms * 1000;
        int weightLoss = weightGramms / 250;
        int weightLoss2 = weightGramms / 500;
        System.out.println(weightLoss + " дней будет худеть спортсмен если будет сбрасывать по 250 грамм " +
                weightLoss2 + " дней будет худеть спортсмен если будет сбрасывать по 500 грамм");

        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int Masha2 = Masha / 100 * 10 + 67760;
        int Denis2 = Denis / 100 * 10 + 83690;
        int Kristina2 = Kristina / 100 * 10 + 76230;
        int yearMasha = Masha * 12;
        int yearMasha2 = Masha2 * 12;
        int differenceMasha = yearMasha2 - yearMasha;
        System.out.println("Теперь Маша будет получать " + Masha2 + " годовой доход вырос на " + differenceMasha);
        int yearDenis = Denis * 12;
        int yearDenis2 = Denis2 * 12;
        int differenceDenis = yearDenis2 - yearDenis;
        System.out.println("Теперь Денис будет получать " + Denis2 + " годовой доход вырос на " + differenceDenis);
        int yearKristina = Kristina * 12;
        int yearKristina2 = Kristina2 * 12;
        int differenceKristina = yearKristina2 - yearKristina;
        System.out.println("Теперь Кристина будет получать " + Kristina2 + " годовой доход вырос на " + differenceKristina);







    }
}
