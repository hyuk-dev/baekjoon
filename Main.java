import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N을 소인수 분해 하라. 단, 1일때는 출력 안함.
        for(int i=2; i<N+1; i++){
            while(N%i ==0){
                N = N/i;
                System.out.println(i);
            }
        }
        if(N!=1) System.out.println(N);

    }
}

