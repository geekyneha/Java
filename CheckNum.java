import java.util.*;
public class CheckNum {
    public static void main(String [] args){
     
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        if( a > b ){
            System.out.println("a is greater.");
        }
        else if( a < b) {
            System.out.println("b is greater.");
        }
        else {
            System.out.println("Both are equal.");
        }

    
      sc.close();
    }
    
}
