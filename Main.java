import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int check = 0;
        int sum = 0;
        int min = N;
        for(int i=M;i<=N;i++){
            check = 0;
            if(i==1){
                continue;
            }
            if(i==2){
                sum += 2;
                min = 2;
                continue;
            }
            for(int j=2;j<i;j++){
                if(i%j == 0) {
                    check = 1;
                }
            }
            if(check == 0){
                sum += i;
                if(min > i) min = i;
            }
        }
        if(sum!=0){
            System.out.println(sum);
            System.out.println(min);
        }

        else System.out.println("-1");

    }
}

