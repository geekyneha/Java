public class Patterns {
    public static void main(String[] args){
        int n = 5;
        int m= 5;
        // Pattern 1
        // Solid Rectangle
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        System.out.println("Pattern 1: Solid Rectangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* "); 
            }
            System.out.println();
        }
         
        // Pattern 2
        // Hollow Rectangle
        // * * * * *
        // *       *
        // *       *
        // * * * * *
        System.out.println("Pattern 2: Hollow Rectangle");

        for(int i = 1; i <=n ; i++){
            for(int j = 1 ; j<=m; j++){
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  " );
                }

            }
             System.out.println();
        }

        // Pattern 3
    // Half Pyramid
    // *
    // * *
    // * * *
    // * * * *


    System.out.println("Pattern 3: Half Pyramid");
    for (int i = 0 ; i < n ; i++){
        for (int j = 0 ; j <= i ; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

        // Pattern 4
        // Inverted Half Pyramid
        // * * * *
        // * * *
        // * *
        // *

    System.out.println("Pattern 4: Inverted Half Pyramid");

      for (int i = 0 ; i < n ; i++){
        for (int j = 0; j < n-i ; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

        // Pattern 5
        // Inverted Half Pyramid with Spaces
        //       *
        //     * *
        //   * * *
        // * * * *      

    System.out.println("Pattern 5: Inverted Half Pyramid with Spaces(rotated 180 degrees)");

     for(int i = 0 ; i < n ; i++){
        for(int j = 0; j < n - i+1; j++){
            System.out.print("  ");
        }
        for(int j= 0 ; j < i+1 ; j++){
            System.out.print("* ");
        } 
        System.out.println();
     }


        // Pattern 6
        // Half Pyramid with Numbers
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4          
    System.out.println("Pattern 6: Half Pyramid with Numbers ");
     for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < i + 1; j++){
            System.out.print(j+1 + " ");
        }
        System.out.println();
     }


        // Pattern 7
        // Inverted Triangle
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
    System.out.println("Pattern 7: Inverted Half Pyramid with Numbers");
     for(int i = 0 ; i < n  ; i++){
        for(int j = 0 ;  j < n - i ; j++){
             System.out.print( j + 1 + " ");
        }
        System.out.println();
     }

        // Pattern 8
        // Floyd's Triangle
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
    System.out.println("Pattern 8: Floyd's Triangle");

    int count = 0;
    for(int i =  0; i < n ; i++){
        for(int j = 0 ; j<= i  ; j++){
           count++;
           System.out.print(count + " ");
        } 
        System.out.println();
    }

    // pattern 9 : 0-1 Pattern;
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    System.out.println("Pattern 9: 0-1 Pattern");

    for(int i = 1 ; i <= n ; i++){
      for(int j = 1; j <= i ; j++){
        if((i + j) % 2 == 0){
            System.out.print(1 + " ");
        }
        else{
            System.out.print(0 + " ");
        }
      }
        System.out.println();
    } 
    }

    
}
