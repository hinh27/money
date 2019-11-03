import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money USD:");
        usd = sc.nextDouble();
        double change = usd * 23000;
        System.out.print(usd+"USD" + "=" + change + "VND");
    }
}
