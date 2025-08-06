public class BitMan {

    public static void main(String args[]){

        // clear 
        int pos = 1;
        int n = 5;

        int bitMask = 1 << pos;

        // int newBitMask = ~(bitMask);

        int newNumber= bitMask | n ;
         System.out.println(newNumber);

         


    }
    
}
