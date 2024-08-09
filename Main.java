import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t; // x와 y의 합
        int x=1, y=1; // x: 분자 , y: 분모

        for(int i=0;i<n-1;i++){

            t = x+y;

            if(t%2 == 0){
                if(x>1) x--;
                y++;
            }
            else{
                x++;
                if(y>1) y--;
            }



        }

        System.out.println(x + "/" + y);

    }
}


/*
t = 합

1: 1/1 > t=2
2: 1/2 > t=3
3: 2/1 > t=3
4: 3/1 > t=4
5: 2/2 > t=4
6: 1/3 > t=4
7: 1/4 > t=5
8: 2/3 > t=5
9: 3/2 > t=5
10: 4/1 > t=5

 */