import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        int a = 1;
        int i = 1;
        while(n > a){
            a = a+6*i;
            i++;
            result++;
        }

        System.out.println(result);
    }
}