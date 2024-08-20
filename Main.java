import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        int check = 0;

        for(int i = n0; i<=100; i++){
            if (a1 * i + a0 > c * i) {
                check = 1;
                break;
            }
        }

        if(check == 1) System.out.println("0");
        else System.out.println("1");


    }
}

