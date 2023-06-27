
import java.util.Scanner;

public class task3 {
 public static void main(String[] args) {
    
    Scanner scanner  =  new Scanner(System.in);
    System.out.println("Калькулятор! Какую операцию выполнить? Введите номер:");
    System.out.println("1 - сумма чисел");
    System.out.println("2 - разность чисел ");
    System.out.println("3 - произведение чисел");
    System.out.println("4 - частное чисел");
    System.out.println("5 - остаток от деления");
    int a = scanner.nextInt();
    System.out.println("Введите первое число: ");
    double n1 = scanner.nextInt();
    System.out.println("Введите второе число: ");
    double n2 = scanner.nextInt();
    switch(a) {
        case 1:
        double result = n1+n2;
        System.out.println("результат: "+result);
        break;
        case 2:
        double result1 = n1-n2;
        System.out.println("результат: "+result1);
        break;
        case 3:
        double result2 = n1*n2;
        System.out.println("результат: "+result2);
        break;
        case 4:
        double result3 = n1/n2;
        System.out.println("результат: "+result3);
        break;
        case 5:
        double result4 = n1%n2;
        System.out.println("результат: "+result4);
        break;

    }

   
    scanner.close();
    }
    
    
    
}