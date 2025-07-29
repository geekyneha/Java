import java.util.*;
public class Functions {
    public static int addTwoNumbers(int a , int b){
        int sum = a + b;
        return sum;

    }
    public static void main( String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers to add:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = addTwoNumbers(a,b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
        sc.close();
    }
    
}
