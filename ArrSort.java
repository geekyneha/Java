public class ArrSort {

    public static void main(String args[]){
        int [] arr= { 5, 7 ,4 , 2, 4, 6, 2, 8,1 ,3};
        int n = arr.length;


        for(int i = 0 ; i < n -1; i++){
            int minIndex = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex= j;
                }
            }

            // swapping the elements

            if(minIndex != i ){
                int temp = arr[i];
               arr[i] = arr[minIndex];
              arr[minIndex] = temp;
        }
        }

        System.out.println("Sorted Array: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " "); 
        }
    }
    
}
