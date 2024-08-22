import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int x,y;
        y = (int) ((a * f - d * c) / (a * e - d * b));
        if (a != 0) {
            x = (int) ((c - b * y) / a);
        }
        else{
            x = (int) ((f - e * y) / d);
        }

        System.out.println(x + " " + y);

    }
}

/*
ax = c - by
x = (c - by) / a

dx = f - ey
x = (f - ey) / d

(c - by) / a = (f - ey) / d
d(c - by) = a(f - ey)
dc - dby = af - aey
aey - dby = af - dc
(ae - db) y = af - dc
y = (af - dc) / (ae - db)
 */