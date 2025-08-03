import java.util.*;
public class Strings {


    // Strings are non-primitive data types in Java.
    // They are immutable, meaning once created, they cannot be changed.
    public static void main(String args[]){


        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();


        for(int i =0; i < str.length(); i++){
            System.out.println("Character at index " + i + ": " + str.charAt(i));
        }

        //string functions

        // substring
        System.out.println("Substring from index 2 to 5: " + str.substring(2, 5));

    }

}
