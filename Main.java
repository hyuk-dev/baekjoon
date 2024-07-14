import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] arr = new int[n];
      int a, b;
      for(int i=0; i<n; i++){
        arr[i] = i+1;
      }
      int bin;
      for(int i=0; i<m; i++){
        a = sc.nextInt() -1;
        b = sc.nextInt() -1;
        while(a<b){ // for문으로 하다가 계속 실패함
          bin = arr[a];
          arr[a++] = arr[b];
          arr[b--] = bin;

        }
      }
      for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
      }



    }
}

// 2 1 4 3 5
// 3 4 1 2 5
// -> 이 문제에서 역순이란 크기별로 역순이 아니라 기존 배치에서 역순으로.