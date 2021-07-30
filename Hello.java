import  java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your last score:");
        int score1 = scanner.nextInt();
        System.out.print("Input your this score:");
        int score2 = scanner.nextInt();
        //float increase = new float
        float increase = score1/score2*100;
        System.out.printf("%.2f,%.2f,%.2f%%",score1,score2,increase);


    }
}