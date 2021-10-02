import java.util.Scanner;

public class DisplayTime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an Intteger for seconds =");
        int secnd = sc.nextInt();
        int minut = secnd/60;
        int remainingSecond = secnd % 60;

        System.out.print(secnd+" seconds is "+ minut+ " Minutes and "+ remainingSecond+ " seconds");
    }
}