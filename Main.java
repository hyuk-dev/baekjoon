import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int b = sc.nextInt();
    int val = 0; // B진법 으로 나타냈을 때 영문으로 된 경우 숫자로 변경해서 저장
    int result = 0;
    int c = 1;
    for(int i=n.length()-1; i>=0; i--){
        val = Character.getNumericValue(n.charAt(i));
        result += val*c;
        c *= b;
    }
      if(result <= 1000000000) System.out.print(result);
      else System.out.print("1000000000");
  }
}