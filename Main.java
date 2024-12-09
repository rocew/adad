import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числитель и знаменатель для первой дроби:");
        int numerator1 = scanner.nextInt();
        int denominator1 = scanner.nextInt();
        fraction f1 = new fraction(numerator1, denominator1);

        System.out.println("Введите числитель и знаменатель для второй дроби:");
        int numerator2 = scanner.nextInt();
        int denominator2 = scanner.nextInt();
        fraction f2 = new fraction(numerator2, denominator2);

        System.out.println("Введите числитель и знаменатель для третьей дроби:");
        int numerator3 = scanner.nextInt();
        int denominator3 = scanner.nextInt();
        fraction f3 = new fraction(numerator3, denominator3);

        System.out.println("\nВещественное значение первой дроби: " + f1.getDoubleValue());
        System.out.println("Вещественное значение второй дроби: " + f2.getDoubleValue());
        System.out.println("Вещественное значение третьей дроби: " + f3.getDoubleValue());

        fraction sumResult = f1.add(f2);
        fraction subtractResult = f1.subtract(f2);
        fraction multiplyResult = f1.multiply(f2);
        fraction divideResult = f1.divide(f2);
        System.out.println(f1.equals(f2));

        System.out.println("\nПримеры операций с дробями:");
        System.out.println(f1 + " + " + f2 + " = " + sumResult);
        System.out.println(f1 + " - " + f2 + " = " + subtractResult);
        System.out.println(f1 + " * " + f2 + " = " + multiplyResult);
        System.out.println(f1 + " / " + f2 + " = " + divideResult);

        fraction complexResult = f1.add(f2).divide(f3).subtract(5);
        System.out.println("\nРезультат выражения f1.add(f2).divide(f3).subtract(5): " + complexResult);

        System.out.println("\nВведите новый числитель для первой дроби:");
        int newNumerator1 = scanner.nextInt();
        f1.setNumerator(newNumerator1);
        System.out.println("Введите новый знаменатель для первой дроби:");
        int newDenominator1 = scanner.nextInt();
        f1.setDenominator(newDenominator1);

        System.out.println("\nИзмененная первая дробь: " + f1);
        System.out.println("Вещественное значение измененной первой дроби: " + f1.getDoubleValue());

        sumResult = f1.add(f2);
        subtractResult = f1.subtract(f2);
        multiplyResult = f1.multiply(f2);
        divideResult = f1.divide(f2);

        System.out.println("\nПримеры операций с измененной первой дробью:");
        System.out.println(f1 + " + " + f2 + " = " + sumResult);
        System.out.println(f1 + " - " + f2 + " = " + subtractResult);
        System.out.println(f1 + " * " + f2 + " = " + multiplyResult);
        System.out.println(f1 + " / " + f2 + " = " + divideResult);

        complexResult = f1.add(f2).divide(f3).subtract(5);
        System.out.println("\nРезультат выражения f1.add(f2).divide(f3).subtract(5) с измененной первой дробью: " + complexResult);

        Scanner cot = new Scanner(System.in);
        List<Cat> cats = new ArrayList<>();
        int numCats;
        System.out.print("Сколько котов вы хотите добавить? ");
        numCats = cot.nextInt();
        cot.nextLine();
        for (int i = 0; i < numCats; i++) {
            System.out.print("Введите имя кота " + (i + 1) + ": ");
            String catName = cot.nextLine();
            cats.add(new Cat(catName));
        }
        Funs.meowsCare(scanner, cats.toArray(new Meowable[0]));
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " мяукал: " + cat.getMeowCount() + " раз");
        }
        cot.close();
    }
}