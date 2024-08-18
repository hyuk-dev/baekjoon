import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x_max = -10000;
        int y_max = -10000;
        int x_min = 10000;
        int y_min = 10000;

        int N = sc.nextInt();
        int x;
        int y;
        for(int i=0;i<N;i++){
            x = sc.nextInt();
            y = sc.nextInt();

            if(x > x_max) x_max = x;
            if(x < x_min) x_min = x;

            if(y > y_max) y_max = y;
            if(y < y_min) y_min = y;

        }

        System.out.println((x_max-x_min)*(y_max-y_min));

    }
}

