import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0; // 최소 생성자
        int sum = 0;
        int a = 0;
        int check = 0;
        for(int i=1; i<N; i++){
            a=i;
            while(true){
                if(a%10 == 0) check = 1;
                sum += a%10;
                a = a/10;
                if(a<9) break;
            }
            sum += a;
            if(sum + i == N && check == 0){
                result = i;
            }
            sum = 0;
            check = 0;
        }

        System.out.println(result);

    }
}

