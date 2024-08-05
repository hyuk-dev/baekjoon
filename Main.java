import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num=0;
    for(int i=0; i<n; i++){
        num = sc.nextInt();
        if(num>=25){
            System.out.print((int)(num/25) + " ");
            num = num % 25;
        }
        else{
            System.out.print("0 ");
        }
        if(num>=10) {
            System.out.print((int) (num / 10) + " ");
            num = num % 10;
        }
        else{
            System.out.print("0 ");
        }
        if(num>=5){
            System.out.print((int)(num/5) + " ");
            num = num % 5;
        }
        else{
            System.out.print("0 ");
        }
        System.out.print(num);
        System.out.println();
    }
  }
}