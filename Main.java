import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] arr = new char[N][M];
        char[][] chess = new char[N][M];

        for(int i = 0; i < N; i++){
            String s = sc.next();
            for(int j = 0; j < M; j++){
                arr[i][j] = s.charAt(j);

            }
        }

        int result = 0;
        int min_result = 65;
        for(int i = 0; i <= N-8; i++){
            for(int j = 0; j <= M-8; j++){

                for(int k = i; k < i + 8; k++){
                    for(int t = j; t < j + 8; t++){
                        chess[k][t] = arr[k][t];

                    }

                }
                for(int k = i; k < i + 8; k++){
                    for(int t = j; t < j + 8; t++){
                        if(t > j){

                            if(chess[k][t] == chess[k][t-1]){

                                result ++;
                                if(chess[k][t] == 'W') chess[k][t] = 'B';
                                else chess[k][t] = 'W';
                            }
                        }
                        if(k > i){
                            if(chess[k][t] == chess[k-1][t]){

                                result ++;
                                if(chess[k][t] == 'W') chess[k][t] = 'B';
                                else chess[k][t] ='W';
                            }
                        }
                    }

                }



                if(min_result > result){
                    min_result = result;
                }

                result = 1;

                for(int k = i; k < i + 8; k++){
                    for(int t = j; t < j + 8; t++){
                        chess[k][t] = arr[k][t];

                    }

                }

                if(chess[i][j] == 'W') chess[i][j] = 'B';
                else chess[i][j] = 'W';

                for(int k = i; k < i + 8; k++){
                    for(int t = j; t < j + 8; t++){
                        if(t > j){

                            if(chess[k][t] == chess[k][t-1]){

                                result ++;
                                if(chess[k][t] == 'W') chess[k][t] = 'B';
                                else chess[k][t] = 'W';
                            }
                        }
                        if(k > i){
                            if(chess[k][t] == chess[k-1][t]){

                                result ++;
                                if(chess[k][t] == 'W') chess[k][t] = 'B';
                                else chess[k][t] ='W';
                            }
                        }
                    }

                }


                if(min_result > result){
                    min_result = result;
                }

                result = 0;

            }
        }
        System.out.println(min_result);
    }
}
