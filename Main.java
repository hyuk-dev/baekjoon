import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if(N>1) System.out.println(arr[N-k]);
        else System.out.println(arr[0]);
    }
}

