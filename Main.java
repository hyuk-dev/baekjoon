import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int C = 0;
        int R = 0;
        for(int i=1;i<N+1;i++){
            if(N % i == 0) C++;
            if(N % i == 0 && K == C) {
                R = i;
                break;
            }
        }

        System.out.print(R);

    }
}

