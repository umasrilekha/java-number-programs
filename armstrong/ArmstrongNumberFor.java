import java.util.Scanner;

public class ArmstrongNumberFor {

    public static boolean isArmstrong(int n) {

        int temp = n, sum = 0;

        for (; n > 0; n /= 10) {
            int d = n % 10;
            sum = sum + d * d * d;
        }

        return sum == temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number:");

        int num = sc.nextInt();

        if (isArmstrong(num))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");

        sc.close();
    }
}
