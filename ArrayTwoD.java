import java.util.*;

public class ArrayTwoD {

     public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols= sc.nextInt();

        int arr[][] = new int [rows][cols];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<rows;i++){
            for(int j=0; j<cols; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the number to search:");
        int num = sc.nextInt();
        System.out.println("The elements of the 2D array are:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j] == num){
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                }
            }
            
        }

        sc.close();
     }

}

