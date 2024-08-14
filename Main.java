import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int min = 0;

        min = w-x;
        if(h-y < min) min = h-y;
        if(x < min) min = x;
        if(y < min) min = y;

        System.out.println(min);


    }
}

