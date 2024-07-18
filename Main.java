import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int r;
    String s;
    int m;
    for(int i=0;i<t;i++){
      m = sc.nextInt();
      s = sc.next();
      for(int j = 0;j<s.length();j++){
        for(int k = 0;k < m; k++){
          System.out.print(s.charAt(j));
        }
      }
      System.out.println("");
    }
  }    
}