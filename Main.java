import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] arr = new int[n];

      int a,b,c;
      for(int i=0; i<m; i++){
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        for(int j=a-1; j<=b-1; j++){
          arr[j] = c;
        }
      }
      for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
      }
    }
}