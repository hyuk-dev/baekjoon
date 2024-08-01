import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int i=0;
        int[] arr = new int[1000];
        while(n>0){
            arr[i] = n%b;
            n = (int) (n/b);
            i++;
        }
        for(int j=i-1;j>=0;j--){
            if(arr[j]>=10){
                System.out.print((char)(arr[j]+'A'-10));
            }
            else System.out.print(arr[j]);
        }
    }
}