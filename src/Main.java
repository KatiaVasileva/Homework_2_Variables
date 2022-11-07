import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
// Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

// Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

// Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

// Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

// Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

// Задача 6
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух боксеров составляет " + totalWeight + " кг.");
        var differenceInWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе составляет " + differenceInWeight + " кг!");

// Задача 7
        System.out.println("Задача 7");
        var differenceInWeight1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе составляет " + differenceInWeight1 + " кг! (способ 1)");
        var differenceInWeight2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе составляет " + differenceInWeight2 + " кг! (способ 2)");

// Задача 8
        System.out.println("Задача 8");
        var totalHours = 640;
        var oneEmployeeHours = 8;
        var employeeNumber = totalHours / oneEmployeeHours;
        System.out.println("Всего работников в компании - " + employeeNumber + " человек.");
        employeeNumber = employeeNumber + 94;
        var newTotalHours = employeeNumber * oneEmployeeHours;
        System.out.println("Если в компании работает " + employeeNumber + " человека, то всего " + newTotalHours + " часа работы может быть поделено между сотрудниками.");
    }
}