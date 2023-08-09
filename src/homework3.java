public class homework3 {
    public static void main(String[] args) {
        byte clientOS = 0;
        byte clientAndroid = 1;
        boolean isCleientOSHeavierThanClientAndroid = clientOS > clientAndroid;
        if (isCleientOSHeavierThanClientAndroid) {
            System.out.println("Установите приложение для iOS по ссылке");
        }
        boolean isClientAndroidHeavierThanClientOS = clientAndroid > clientOS;
        if (isClientAndroidHeavierThanClientOS) {
            System.out.println("Установите приложение для Android по ссылке");
        }

        int versionAndroid = 2016;
        int versionIos = 2014;
        if (versionIos < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (versionAndroid < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (versionAndroid > 2015 && versionAndroid == 2015)
        { System.out.println("Установите версию для Android по ссылке"); }
         if (versionIos > 2015 && versionIos==2015)
         { System.out.println("Установите версию для iOS по ссылке");}

         int year = 2021;
                 if (year%4==0&& year%100!=0 || year%400==0)
                     System.out.println("Указаный год високосный");
                 else
                     System.out.println("Указанный год не високосный");

    int monthNumber = 3;
    switch (monthNumber) {
        case 1:
            System.out.println("Январь");
            break;
        case 2:
            System.out.println("Февраль");
            break;
        case 3:
            System.out.println("Март");
            break;
        case 4:
            System.out.println("Апрель");
            break;
        case 5:
            System.out.println("Май");
            break;
        case 6:
            System.out.println("Июнь");
            break;
        case 7:
            System.out.println("Июль");
            break;
        case 8:
            System.out.println("Август");
            break;
        case 9:
            System.out.println("Сентябрь");
            break;
        case 10:
            System.out.println("Октябрь");
            break;
        case 11:
            System.out.println("Ноябрь");
            break;
        case 12:
            System.out.println("Декабрь");
            break;
    }
        int deliveryDistance = 95;
    switch (deliveryDistance) {
        case 0 - 20:
            System.out.println("Доставка займёт сутки");
            break;
        case 20 - 60:
            System.out.println("Доставка займёт двое суток");
            break;
        case 61 - 100:
            System.out.println("Доставка займёт трое суток");
            break;
        case 101 - 150:
                System.out.println("Доставка займёт 4 дня");
                break;
    }


    }
}
