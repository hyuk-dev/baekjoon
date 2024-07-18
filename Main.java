import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    StringBuffer sba = new StringBuffer(a);
    String ar = sba.reverse().toString();

    StringBuffer sbb = new StringBuffer(b);
    String br = sbb.reverse().toString();

    int ai = Integer.parseInt(ar);
    int bi = Integer.parseInt(br);

    if (ai>bi) System.out.print(ai);
    else System.out.print(bi);
  }
}