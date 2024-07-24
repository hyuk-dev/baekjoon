import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int arr[] = new int[26];
      for(int i=0; i<s.length(); i++){
          if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
              arr[s.charAt(i)-'A']++;
          }
          else {
              arr[s.charAt(i)-'a']++;
          }
      }
      int max = -1;
      char c = 0;
      for(int i=0; i<26; i++){
          if(max < arr[i]){
              max = arr[i];
              c = (char)(i+65);
          }
          else if(max == arr[i]){
              c = '?';
          }
      }

      System.out.println(c);


    }
}
