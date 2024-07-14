import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int[] int_arr = new int[n];

      for(int i=0; i<n; i++){

        int_arr[i] = sc.nextInt();

      }

      int max = 0;
      int sum = 0;

      for(int i=0; i<n; i++){
        if(max < int_arr[i]) max = int_arr[i];
      }

      double[] double_arr = new double[n];

      for(int i=0; i<n; i++){
        double_arr[i] = ((double) int_arr[i]/max)*100;
      }

      double avr = 0;

      for(int i=0; i<n; i++){
        avr += double_arr[i];
      }

      System.out.print(avr/n);

    }
}
