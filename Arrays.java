import java.util.*;
public class Arrays {

    public static void main(String args[]){
        // int [] arr = new int [5];
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        



        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }


        for(int i = 0; i < n; i++){
            System.out.print(i+": "+arr[i] + " ");
        }
      sc.close();


    }
    
}
