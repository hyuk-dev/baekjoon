import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int a=0;
        int b=0;
        int c=0;
        int most = 0; // 합이 M에 가장 가까운 3장 합

        for(int i=0; i<N; i++){
            a = arr[i];
            for(int j=0; j<N; j++){
                if(arr[j] == a) continue;
                b = arr[j];
                for(int k=0; k<N; k++){
                    if(arr[k] == arr[j] || arr[k] == arr[i]) continue;
                    c = arr[k];

                    if(a+b+c <= M && most < a+b+c){
                        most = a+b+c;

                    }
                }
            }
        }

        System.out.println(most);

    }
}

