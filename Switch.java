import java.util.*;
public class Switch {

    public static void main(String[] args){
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter a number between 1 and 5: ");

         int button = sc.nextInt();

         switch(button){
            case 1: System.out.println("Hello!");;
            break;
            case 2: System.out.println("Hola!");
            break;
            case 3: System.out.println("Bonjour!");
            break;
            case 4: System.out.println("Ciao!");
            break;
            case 5: System.out.println("Hallo!");
            break;
            default: System.out.println("Invalid input!");

         }

    }
    
}
