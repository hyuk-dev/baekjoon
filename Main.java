import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int max = 0;
    int max_i = 0;
    int max_j = 0;
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++) {
            int next = sc.nextInt();
            if (max <= next) {
                max = next;
                max_i = i;
                max_j = j;
            }
        }
    }
    System.out.println(max);
    System.out.print((max_i+1) + " " + (max_j+1));
  }
}