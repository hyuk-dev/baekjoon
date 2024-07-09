import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            int a,b;
            for(int i=1;i<=n;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                bw.write("Case #"+i+": ");
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                bw.write(a+" + "+b+" = "+ (a+b) +"\n");
            }
            br.close();
            bw.flush();
            bw.close();
    }
}