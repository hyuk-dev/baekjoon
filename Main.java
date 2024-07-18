import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    String s;
    while(sc.hasNext()){
      s = sc.next();
      count++;
    }
    System.out.print(count);
  }
}