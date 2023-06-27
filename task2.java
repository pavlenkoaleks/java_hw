
public class task2 {
 public static void main(String[] args) {
    
    System.out.println("Простые числа от 0 до 1000: ");
    for (int i = 1; i <= 1000; i++) {
        int count_delitel=0;
        for (int j = 1; j <=i; j++) {
           
            if (i%j == 0) {count_delitel++;}
       
        }
        if (count_delitel==2) {System.out.println(i+" "); }

 }
 
}
        
}