import java.util.*;
public class Loops {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number:");
         int n = sc.nextInt();



         int sum = 0;
         for (int i = 1; i <= n ; i++){
            sum+=i;

         }
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
            
        sc.close();

        // n*(n+1)/2 formula
        int formulaSum = n * (n + 1) / 2;
        System.out.println("Sum using formula: " + formulaSum);

        // Using while loop
        int i = 1;
        sum = 0; // Resetting sum for while loop
        while(i <=n){
            sum += i;
            i++;
        }

        System.out.println("Sum using while loop: " + sum);

        // Using do-while loop
        i = 1; // Resetting i for do-while loop
        sum = 0; // Resetting sum for do-while loop
        do {
            sum +=i;
            i++;
        }while(i <= n);

        System.out.println("Sum using do-while loop: " + sum);

    }
    
}
