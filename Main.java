import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[100];
    int result = 0;
    int check = 1;
    for(int i=0; i<N; i++){
      String s = sc.next();
      check = 1;
      arr[s.charAt(0)-97] = 1;
      for(int j=1; j<s.length(); j++){
        if(arr[s.charAt(j)-97] == 0){
          arr[s.charAt(j)-97] = 1;
        }
        else if(arr[s.charAt(j)-97] == 1 && !(s.charAt(j) == s.charAt(j-1))){
          check = 0;
          break;
        }
        
      }
      if(check == 1) result ++;
      Arrays.fill(arr, 0);
    }
    System.out.print(result);
  }
}