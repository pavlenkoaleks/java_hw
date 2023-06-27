import java.time.LocalTime;
import java.util.Scanner;

public class task1 {
 public static void main(String[] args) {
    
    Scanner scanner  =  new Scanner(System.in);
    System.out.println("Введите число n:");
    double n = scanner.nextInt();
    double n_treug = 0.5*n*(n+1);
    System.out.println("n - треугольное число: "+ n_treug);
    double n_fact=1;
    for (int i = 1; i <= n; i++) {
        n_fact=n_fact*i;


    
 }
System.out.println("факториал числа n: "+ n_fact);
   
    scanner.close();
    }
    
    
    
}