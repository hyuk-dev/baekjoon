import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int test = sc.nextInt();
      String a;

      for(int i=0;i<test;i++){
        a = sc.next();
        System.out.println(a.charAt(0)+""+a.charAt(a.length()-1));
      }

      
      
    }
}