public class homework2 {
    public static void main(String[] args) {
        byte age = 18;
        if (age >= 18) {
            System.out.println("С совершеннолетием! ");
        } else {
            System.out.println("Тебе ещё нет 18, нужно немного подождать! ");
        }

        int age2 = 26;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Пора отправляться на первую работу!");
        }

        int carSeats = 102;
        if (carSeats == 102) {
            System.out.println("Вагон забит");}
        else if (carSeats > 60 && carSeats < 102) {
            System.out.println("Остались стоячие места"); }
        else {
            System.out.println("Остались сидячие места");}

        int agePeople = 25;
        if (agePeople>=2 && agePeople <= 6) {
            System.out.println("Нужно в детский сад");}
        else if (agePeople >= 7 && agePeople <= 18)
        { System.out.println("Нужно ходить в школу"); }
        else if (agePeople >18 && agePeople <= 24) {
            System.out.println("Твоё место в университете");}
        else {
            System.out.println("Пора на работу");}

        int ageChildren = 16;
        if (ageChildren < 5)
        {System.out.println("Ребенок не может кататься на атракционах");}
        else if (ageChildren>5 && ageChildren<14)
        {System.out.println("Кататься только с сопровождением взрослых");}
        else {
            System.out.println("Ребенок может катататься без сопровождения взрослых");
        }

        int one =1;
        int two = 2;
        int three = 3;
        if (one==two) {
            System.out.println("1 = 2 ");}
        else if (two==three){
            System.out.println(" 2 = 3"); }
        else if (three==three){
            System.out.println("3 самое больше число"); }



        }
    }

