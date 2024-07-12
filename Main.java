import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int[]arr = new int[42];
      for(int i=0; i<42; i++){
        arr[i] = 0;
      }
      int num;
      for(int i = 0; i < 10; i++){
        num = sc.nextInt();
        arr[num%42] = 1;
      }

      int count = 0;

      for(int i=0; i<42; i++){
        if(arr[i]==1) count++;
      }

      System.out.println(count);
      
    }
}