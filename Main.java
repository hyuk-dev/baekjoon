import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[][] arr = new char[5][15];
    for(int i=0;i<5;i++){
        String s = sc.next();
        for(int j=0;j<s.length();j++){
            arr[i][j] = s.charAt(j);
        }
    }
    for(int j=0;j<15;j++){
        for(int i=0;i<5;i++){
            if(arr[i][j] != '\0') System.out.print(arr[i][j]+ "");
        }
    }

  }
}