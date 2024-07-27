import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double result = 0; // 전공평점 = (학점*과목평점)의 합 / 학점의 합
    double sum_subject = 0;
    double sum_credit= 0;

    for(int i=0; i<20; i++){
        sc.next();
        double credit = sc.nextDouble();
        double subject = 0;
        String s = sc.next();
        if(s.equals("A+")){
            subject = 4.5;
        }
        if(s.equals("A0")){
            subject = 4.0;
        }
        if(s.equals("B+")){
            subject = 3.5;
        }
        if(s.equals("B0")){
            subject = 3.0;
        }
        if(s.equals("C+")){
            subject = 2.5;
        }
        if(s.equals("C0")){
            subject = 2.0;
        }
        if(s.equals("D+")){
            subject = 1.5;
        }
        if(s.equals("D0")){
            subject = 1.0;
        }
        if(s.equals("F")){
            subject = 0.0;
        }
        if(!(s.equals("P"))){
            sum_credit += credit;
            sum_subject += credit*subject;
        }
    }
    System.out.print(sum_subject/sum_credit);
  }
}