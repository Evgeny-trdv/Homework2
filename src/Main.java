public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение dog = " + dog);
        System.out.println("Значение cat = " + cat);
        System.out.println("Значение paper = " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Значение dog для второй задачи = " + dog);
        System.out.println("Значение cat для второй задачи = " + cat);
        System.out.println("Значение paper для второй задачи = " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Значение dog для третьей задачи = " + dog);
        System.out.println("Значение cat для третьей задачи = " + cat);
        System.out.println("Значение paper для третьей задачи = " + paper);

        var friend = 19;
        System.out.println("Значение friend = " + friend);
        friend = friend + 2;
        System.out.println("Значение friend = " + friend);
        friend = friend / 7;
        System.out.println("Значение friend = " + friend);

        var frog = 3.5;
        System.out.println("Значение frog = " + frog);
        frog = frog * 10;
        System.out.println("Значение frog = " + frog);
        frog = frog / 3.5;
        System.out.println("Значение frog = " + frog);
        frog = frog + 4;
        System.out.println("Значение frog = " + frog);

        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        System.out.println("Общая масса двух боксеров = " + (boxerFirst + boxerSecond));
        System.out.println("Разница в массе между двух боксеров = " + (boxerSecond - boxerFirst));

        System.out.println("Остаток от деления между двумя боксерами = " + (boxerSecond % boxerFirst));

        var workers = 0; // количество сотрудников
        var allTime = 640; // всего времени
        var workerTime = 8; // количество часов работы одного сотрудника
        workers = workers + (allTime / workerTime);
        System.out.println("Всего работников в компании - " + workers + " человек");

        workers = workers + 94;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + (workers * workerTime) + " часов работы может быть поделено между сотрудниками");

    }
}