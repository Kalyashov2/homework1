public class Main {
    public static void main(String[] args) {
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog * 4;
        System.out.println(dog);
        cat = cat * 4;
        System.out.println(cat);
        paper = paper * 4;
        System.out.println(paper);

        var dog1 = 123213;
        var cat1 = 21354;
        var paper1 = 12;
        dog1 = dog1 / 3;
        cat1 = cat1 / 2;
        paper1 = paper1 / 7639;
        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(paper1);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weight1 = 78.3;
        var weight2 = 82.7;
        var totalWeight = weight2 + weight1;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");


        var weightDifference = weight2 - weight1;
        System.out.println("Разница весов " + weightDifference + " кг");

        var totalHours = 640;
        var hoursPerDay = 8;
        var people = totalHours / hoursPerDay;
        System.out.println("Всего работников в компании - " +  people + " человек");

        var people2 = people + 94;
        var hoursPerDay2 = totalHours / people2;
        System.out.println("Если в компании работает " + people2 + " человека, то всего " + hoursPerDay2 + " часа " +
                "работы может быть поделено между сотрудниками");





    }
}