public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

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
        frog = frog +4;
        System.out.println(frog);

        var weightOneBoxer = 78.2;
        var weightTwoBoxer = 82.7;
        var weightTotalBoxer = weightOneBoxer + weightTwoBoxer;
        System.out.println("Общий вес боксеров " + weightTotalBoxer + " кг!");

        var weightDifferenceBoxer = weightTwoBoxer - weightOneBoxer;
        System.out.println("Разница в весе " + weightDifferenceBoxer + " кг!");

        var weightBoxerAbout = weightTwoBoxer % weightOneBoxer;
        System.out.println("разница в весе с остатком " + weightBoxerAbout + " кг!");

        var totalTime = 640;
        var oneWorkTime = 8;
        var totalWork = totalTime / oneWorkTime;
        System.out.println("Всего работников в компании - " + totalWork + " человек");

        var moreWork = totalWork + 94;
        var moreWorkTime = totalTime / moreWork;
        System.out.println("Если в компании работает " + moreWork + " человек, то всего " + moreWorkTime + " часов работы может быть поделено между сотрудниками.");





    }
}