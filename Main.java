import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int[]pn = new int[s.length()];
    for(int i=0;i<s.length();i++){
      if(s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C') pn[i] = 2;
      else if(s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F') pn[i] = 3;
      else if(s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I') pn[i] = 4;
      else if(s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L') pn[i] = 5;
      else if(s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O') pn[i] = 6;
      else if(s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S') pn[i] = 7;
      else if(s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V') pn[i] = 8;
      else if(s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z') pn[i] = 9;
    }
    int t=0;
    for(int i=0;i<s.length();i++){
      t += pn[i]+1;
    }
    System.out.print(t);
  }
}