package home_work_2;

import java.util.Scanner;

public class Calc {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Это калькулятор, введите число операция число" + System.lineSeparator()+
                "пример: 2 + 2" + System.lineSeparator()+
                "допустимые оперции +,-,*,/" + System.lineSeparator()+
                "пробуйте:");
        double num1;
        double num2;
        double res = 0;
        char operation;
        num1 = scanner.nextDouble();
        operation = scanner.next().charAt(0);
        num2 = scanner.nextDouble();
        switch (operation) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;

        }
        System.out.println("Результат операции: "+ res);
    }

}
