import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i=0; i<n+1; i++){ // 2 3 5 9
            result = (int)Math.pow(1+(int)Math.pow(2,i),2); // 2*2 3*3 5*5 9*9
        }
        System.out.println(result);
    }
}