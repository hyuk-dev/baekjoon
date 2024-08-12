import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(true){
            n = sc.nextInt();
            if(n == -1) break;
            int sum = 0;
            for(int i=1; i<n; i++){
                if(n%i == 0) sum += i;
            }
            if(n == sum){
                System.out.print(n + " = ");
                for(int i=1; i<n; i++){
                    if(n%i == 0){
                        if(i == 1) System.out.print(i);
                        else System.out.print(" + " + i);
                    }
                }
                System.out.println("");
            }
            else{
                System.out.println(n + " is NOT perfect.");

            }

        }

    }
}

