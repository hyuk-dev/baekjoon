import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int max = 1;

      int num;
      int x = 1;
      
      for(int i = 0; i<9; i++){
        num = sc.nextInt();
        if(max < num){
          x = i+1;
          max = num;
        }
      }

      System.out.print(max + "\n" +x);
      
      sc.close();
    }
}