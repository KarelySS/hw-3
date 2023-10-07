public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задача 1
        System.out.println("Задача 1");
        byte a = 13;
        short b = 130;
        int c = 130000;
        long d = 200000000;
        float e = 7.7777777F;
        double f = 9.99999999999;
        System.out.println("Значение переменной 'a' с типом 'byte' равно " + a);
        System.out.println("Значение переменной 'b' с типом 'short' равно " + b);
        System.out.println("Значение переменной 'c' с типом 'int' равно " + c);
        System.out.println("Значение переменной 'd' с типом 'long' равно " + d);
        System.out.println("Значение переменной 'e' с типом 'float' равно " + e);
        System.out.println("Значение переменной 'f' с типом 'double' равно " + f);

        //Задача 2
        System.out.println("Задача 2");
        double g = 27.12;
        System.out.println("Значение переменной 'g' с типом 'double' равно " + g);
        long h = 987678965549L;
        System.out.println("Значение переменной 'h' с типом 'lomg' равно " + h);
        float i = 2.786F;
        System.out.println("Значение переменной 'i' с типом 'float' равно " + i);
        short j = 569;
        System.out.println("Значение переменной 'j' с типом 'short' равно " + j);
        int k = -159;
        System.out.println("Значение переменной 'k' с типом 'int' равно " + k);
        short l = 27897;
        System.out.println("Значение переменной 'l' с типом 'short' равно " + l);
        byte m = 67;
        System.out.println("Значение переменной 'm' с типом 'byte' равно " + m);

        //Задача 3
        System.out.println("Задача 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short totalSheets = 480;
        int totalStudent = lp + as + ea;
        byte everyStudent = (byte) (totalSheets / totalStudent);
        System.out.println("На каждого ученика расчитано " + everyStudent + " листов бумаги");

        //Задача 4
        System.out.println("Задача 4");
        byte bottles = 16;
        byte minutes = 2;
        int bottlesPerMin = bottles / minutes;
        int bottlesPer20Min = bottlesPerMin * 20;
        int bottlesPerDay = bottlesPerMin * 60 * 24;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPer30Days = bottlesPer3Days * 10;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Min + " штук бутылок");
        System.out.println("За день машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPer30Days + " штук бутылок");

        //Задача 5
        System.out.println("Задача 5");
        byte totalTin = 120;
        byte oneClass = 6;
        int totalClass = totalTin / oneClass;
        int totalWhite = totalClass * 2;
        int totalBrown = totalClass * 4;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhite + " банок белой " +
                "краски и " + totalBrown + " банок коричневой краски");

        //Задача 6
        System.out.println("Задача 6");
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        short cocktailGr = (short) (bananas + milk + iceCream + eggs);
        double cocktailKg = cocktailGr / 1000.0;
        System.out.println("Завтрак спортсмена- " + cocktailGr + " грамм");
        System.out.println("Завтрак спортсмена- " + cocktailKg + " килограмм");

        //Задача 7
        System.out.println("Задача 7");
        byte toLooseKG = 7;
        short dayMin = (short) (toLooseKG * 1000 / 250);
        short dayMax = (short) (toLooseKG * 1000 / 500);
        short dayAvg = (short) ((dayMin + dayMax) / 2);
        System.out.println("Если спортсмен будет худеть на 250 грамм в день, то ему понадобится " + dayMin + " дней");
        System.out.println("Если спортсмен будет худеть на 500 грамм в день, то ему понадобится " + dayMax + " дней");
        System.out.println("В среднем спортсмену понадобится " + dayAvg + " дней");

        //Задача 8
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float newMasha = (float) (masha * 1.1);
        float newDenis = (float) (denis * 1.1);
        float newKristina = (float) (kristina * 1.1);
        int yearMasha = masha * 12;
        int yearDenis = denis * 12;
        int yearKristina = kristina * 12;
        double newYearMasha = newMasha * 12;
        double newYearDenis = newDenis * 12;
        double newYearKristina = newKristina * 12;
        double diffMasha = newYearMasha - yearMasha;
        double diffDenis = newYearDenis - yearDenis;
        double diffKristina = newYearKristina - yearKristina;
        System.out.println("Маша теперь получает " + newMasha + " рублей. " +
                "Годовой доход вырос на " + diffMasha + "рублей");
        System.out.println("Денис теперь получает " + newDenis + " рублей. " +
                "Годовой доход вырос на " + diffDenis + "рублей");
        System.out.println("Кристина теперь получает " + newKristina + " рублей. " +
                "Годовой доход вырос на " + diffKristina + "рублей");
    }
}