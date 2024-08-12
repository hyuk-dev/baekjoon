import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        for(int i=0; i<N; i++){

            int check = 0;
            int num = sc.nextInt();
            for(int j=1; j<=num; j++){
                if(num % j ==0) check ++;
            }

            if(check == 2) result ++;

        }
        System.out.print(result);


    }
}

