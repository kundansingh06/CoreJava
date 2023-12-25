package prac_number;
public class FibonnaciSeries {
    public static void main(String[] args) {
        int N = 10;

        int [] arr=fibonacci2(N);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        /*for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i) + " ");
        }*/
    }
    static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static int [] fibonacci2(int limit) {
        int [] arr=new int[limit];
        arr[0]=0;
        arr[1]=1;
        for (int i=2; i<limit;i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
       return arr;
    }

}
