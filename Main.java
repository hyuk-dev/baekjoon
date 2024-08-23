import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int min_count = 5000;
        int check = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(j*3 + i*5 == N){
                    check = 1;
                    if(min_count > j+i) min_count = j+i;
                }
            }
        }

        if(check == 1) System.out.println(min_count);
        else System.out.println("-1");
    }
}

/*
18
13
8
3
0

11
6 3의 배수 될때까지 5로 빼준다.
3 3의 배수가 되고나서 3으로 빼준다.
 */