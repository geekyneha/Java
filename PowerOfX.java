public class PowerOfX {

    public static int powerOfx(int x, int n){

        if(n==0) return 1;
        if(x==0) return 0;

        return x * powerOfx(x , n-1);


    }

    public static void main(String args[]){
        int n = 5;

        int x = 2;

        System.out.println(powerOfx (x,n));;
    }
    
}
