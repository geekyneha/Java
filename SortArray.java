public class SortArray {

    public static void main(String args[]){
        int[] arr = {5, 7, 4, 2, 4, 6, 2, 8, 1, 3};
        int n = arr.length;
       

        for(int i = 1 ; i < n ; i++){
             
            int curr = arr[i];
            int p = i-1;

              while(p>=0 && curr < arr[p]){
                arr[ p+1] = arr[p];
                p--;
              }

              arr[p+1] = curr;
        }
        for(int i = 0 ; i < n; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
