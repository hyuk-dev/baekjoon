import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        while(true){
            if(a < b+c && b < a+c && c < a+b) break;

            if(a >= b+c){
                a--;
            }
            else if(b >= a+c){
                b--;
            }
            else if(c >= a+b){
                c--;
            }
        }

        System.out.println(a+b+c);

    }
}

