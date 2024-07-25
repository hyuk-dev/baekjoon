import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int result = 0;
    for(int i=0; i<s.length(); i++){
      if(i<s.length()-2 && s.charAt(i) == 'd' && s.charAt(i+1) == 'z' && s.charAt(i+2) == '='){
        result ++;
        i+=2;
      }
      else if(i<s.length()-1 && s.charAt(i) =='c' && s.charAt(i+1) == '='){
        result ++;
        i ++;
      }
      else if(i<s.length()-1 && s.charAt(i) =='c' && s.charAt(i+1) == '-'){
        result ++;
        i ++;
      }
      else if(i<s.length()-1 && s.charAt(i) == 'd' && s.charAt(i+1) == '-'){
        result++;
        i++;
      }
      else if(i<s.length()-1 && s.charAt(i) == 'l' && s.charAt(i+1) == 'j'){
        result++;
        i++;
      }
      else if(i<s.length()-1 && s.charAt(i) == 'n' && s.charAt(i+1) == 'j'){
        result++;
        i++;
      }
      else if(i<s.length()-1 && s.charAt(i) == 's' && s.charAt(i+1) == '='){
        result++;
        i++;
      }
      else if(i<s.length()-1 && s.charAt(i) == 'z' && s.charAt(i+1) == '='){
        result++;
        i++;
      }
      else result++;
    }
    System.out.print(result);
  }
}