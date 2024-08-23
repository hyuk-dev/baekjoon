import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a = 665;
        int check = 0;
        int check_666 = 0;
        int c = 0;
        while(true){
            a = a + 1;
            int n = a;
            while(true){
                if(n%10 == 6){
                    check ++;
                }
                else{
                    check = 0;
                }

                n = (int) (n / 10);

                if(check == 3){
                    check_666 = 1;
                    break;
                }

                if (n < 1) break;





            }
            check = 0;
            if(check_666 == 1){
                c++;
                check_666 = 0;
            }
            if(c == N) break;
        }

        System.out.println(a);

    }
}
