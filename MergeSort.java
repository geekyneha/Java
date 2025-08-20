public class MergeSort{


    public static void merge(int arr[], int si, int mid, int ei){

        int merged[] = new int [ei - si + 1];

        int p1 = si;
        int p2 = mid + 1;

        int pos = 0;

        while(p1 <= mid && p2 <= ei){
            if(arr[p1] <= arr[p2]){
                merged[pos] = arr[p1];
                pos++;
                p1++;
            }
            else{
                merged[pos] = arr[p2];
                pos++;
                p2++;
            }
        }

        while(p1 <= mid){
            merged[pos++] = arr[p1++];

        }

        while(p2<=ei){
            merged[pos++] = arr[p2++];
        }

        //copy merged array to original array

        for(int i = 0, j = si ; i < merged.length ; i++,j++){
            arr[j] = merged[i];
        }

    }

    public static void mergeSort(int arr[], int si, int ei){

        if(si >= ei){
            return;
        }
        //find mid
        int mid = si + (ei - si) /2; //to avoid overflow

        mergeSort(arr,si,mid);//left part
        mergeSort(arr,mid+1,ei);//right part

        merge(arr,si,mid,ei);



    }
    public static void main(String[] args){
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;

        mergeSort(arr, 0 , n-1);
        System.out.println("Sorted array: ");


        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");;
        }

    }
}