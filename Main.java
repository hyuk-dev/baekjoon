import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=1;
        int b=1;
        int c=1;
        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();

            if(a==0 && b==0 && c==0) break;
            if(a < b+c && b < a+c && c < a+b){
                if(a == b && b == c) {
                    System.out.println("Equilateral");
                }
                else if(a == b || b == c || a == c){
                    System.out.println("Isosceles");
                }
                else if(a<b+c && b<a+c && c<a+b){
                    System.out.println("Scalene");
                }
            }

            else{
                System.out.println("Invalid");
            }

        }

    }
}

