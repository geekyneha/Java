public class SortArr {

    public static void main(String args[]){
        int nums[]= {5, 2, 9, 1, 5, 6};
        int n = nums.length;


        for(int i= 0; i < n-1 ; i++){
            for(int j = 0 ; j < n- i - 1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1] = temp;

                }
            }
        }

        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");        
        }
    }
    
}
