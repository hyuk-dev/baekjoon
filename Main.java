import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }

      int findnum = sc.nextInt();
      int result = 0;
      
      for (int i = 0; i < n; i++){
        if(arr[i] == findnum) result++;
      }

      System.out.println(result);
      sc.close();
    }
}