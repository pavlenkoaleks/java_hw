//сделал только для вида a?+b?=cd
import java.util.Arrays;
import java.util.Scanner;

public class task4 {
 public static void main(String[] args) {
    
    Scanner scanner  =  new Scanner(System.in);
    System.out.println("Введите уравнение вида: q+w=e, q,w,e>=0. Искомые числа, обозначить знаком вопроса.");
    String eq = scanner.nextLine();
    String[] equations = eq.split("");
    for (int i = 0; i < equations.length; i++) {
         System.out.println(equations[i]);
    }
     
    if (equations[0]!="?") {
        if (equations[3]!="?") { for (int i = 0; i < 10; i++) {
                                      for (int j = 0; j < 10; j++) {
                                           if (10*Integer.parseInt(equations[0])+i+10*Integer.parseInt(equations[3])+j == 10*Integer.parseInt(equations[6])+Integer.parseInt(equations[7]))
                                           {equations[1]=Integer.toString(i);

                                           equations[4]=Integer.toString(j);

                                            System.out.println(Arrays.toString(equations));}
                                        //else {System.out.println("Решений нет ");} 
                                    } 
                                        
                                        }

    }


    }
    
    scanner.close();
    }
    
    
    
}