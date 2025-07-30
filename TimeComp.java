import java.util.*;
public class TimeComp {

    public static int Complexity(int n){
        int result = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                result += i + j;
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate time complexity:");
        int n = sc.nextInt();
        int result = Complexity(n);
        System.out.println("The result of the complexity calculation for " + n + " is: " + result);
        sc.close();

    }
        
}
