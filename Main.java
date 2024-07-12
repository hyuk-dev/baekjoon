import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();

      int[]arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = i+1;
      }
      int a,b,s;
      for(int i=0; i<m; i++){
        a = sc.nextInt();
        b = sc.nextInt();

        s = arr[a-1];
        arr[a-1] = arr[b-1];
        arr[b-1] = s;
      }

      for(int i=0;i<n;i++){
        System.out.print(arr[i] +" ");
      }
    }
}