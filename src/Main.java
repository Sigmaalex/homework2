public class Main {
    public static void main(String[] args) {

    //Задача №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
            System.out.println( "Переменная dog = " +dog);
            System.out.println( "Переменная cat = " +cat);
            System.out.println("Переменная paper = "+paper);

    //Задача №2
        dog=dog + 4;
        cat = cat + 4;
        paper = paper + 4;
            System.out.println("dog + 4 = "+dog);
            System.out.println("cat + 4 = "+cat);
            System.out.println("paper + 4 = "+paper);

    //Задача №3
        dog=dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
            System.out.println("dog - 3.5 = "+dog);
            System.out.println("cat - 1.6 = "+cat);
            System.out.println("paper - 7639 = "+paper);

    //Задача №4
        var friend =19;
            System.out.println("Переменная friend = "+friend);
        friend = friend * 2;
            System.out.println("Переменная friend * 2 = "+friend);
        friend = friend / 7;
            System.out.println("Переменная friend / 7 = "+friend);

    //Задача №5
        var frog =3.5;
            System.out.println("Переменная frog = "+frog);
        frog = frog * 10;
            System.out.println("Переменная frog * 10 = "+frog);
        frog = frog / 3.5;
            System.out.println("Переменная frog / 3.5 = "+frog);
        frog = frog + 4;
            System.out.println("Переменная frog + 4 = "+frog);

        //Задача №6
        var weightBoxer1 =78.2;
            System.out.println("Вес первого боксера = "+weightBoxer1+"кг");
        var weightBoxer2 =82.7;
            System.out.println("Вес второго боксера = "+weightBoxer2+"кг");
        var summWeight = weightBoxer1 + weightBoxer2;
            System.out.println("Общий вес двух бойцов = "+summWeight+ "кг");
        var result = weightBoxer2 - weightBoxer1;
            System.out.println("Разница веса между первым и вторым боксером = "+result+ "кг");

    //Задача №7

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println(secondBoxerWeight - firstBoxerWeight);
        System.out.println(secondBoxerWeight % firstBoxerWeight);

    //Задача №8

        var job = 640;
        var workers = job / 8;
        System.out.println("Всего работников в компании - " +workers+ " человек");
        var plusWorkers = workers + 94;
        var job2 = plusWorkers * 8;
        System.out.println("Если в компании работает "+plusWorkers+ " человек, то всего " +job2+ " часов работы может быть поделено между сотрудниками");

    }
    }