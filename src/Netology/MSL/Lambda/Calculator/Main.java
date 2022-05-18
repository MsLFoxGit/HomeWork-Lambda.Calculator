package Netology.MSL.Lambda.Calculator;

public class Main {

    public static void main(String[] args) {
        // Задание Калькулятор

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        System.out.println("Результат работы метода Сложения: " + a);

        int b = calc.minus.apply(1, 1);
        System.out.println("Результат работы метода Вычетания: " + b);

        int multiply = calc.multiply.apply(1, 2);
        System.out.println("Результат работы метода Умножения: " + multiply);

        // V1.0 Возможно деление на ноль
        try {
            int c = calc.devide.apply(a, b);
            System.out.println("Результат работы метода Деления: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Результат работы метода Деления: Деление на ноль!");
        }
        // V1.1 Возможно деление на ноль
        if (b != 0) {
            int c = calc.devide.apply(a, b);
            System.out.println("Результат работы метода Деления: " + c);
        } else {
            System.out.println("Результат работы метода Деления: Деление на ноль!");
        }
        // V1.2 Возможно деление на ноль
        String c = calc.devideStringResult.apply(a, b);
        System.out.println("Результат работы метода Деления: " + c);

        int pow = calc.pow.apply(a);
        System.out.println("Результат работы метода Возведение в квадрат: " + pow);

        int abs = calc.abs.apply(-a);
        System.out.println("Результат работы метода Модуль числа: " + abs);

        boolean isPositive = calc.isPositive.test(-a);
        System.out.println("Результат работы метода Положительно ли число: " + isPositive);

        System.out.print("Напечатал число методом Consumer: ");
        calc.println.accept(a);
    }
}
