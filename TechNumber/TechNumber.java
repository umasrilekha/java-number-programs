import java.lang.Math;

public class TechNum {

    public static boolean isTechNum(int n) {

        int c = getDigitCount(n);

        if (c % 2 != 0) return false;

        int p = c / 2;
        int divisor = (int)Math.pow(10, p);

        int h1 = n / divisor;
        int h2 = n % divisor;

        int sum = h1 + h2;
        int sq = sum * sum;

        return sq == n;
    }

    public static int getDigitCount(int n) {
        if (n == 0) return 1;

        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static void main(String[] args) {

        int num = 2025;

        if (isTechNum(num))
            System.out.println("Tech Number");
        else
            System.out.println("Not a Tech Number");
    }
}
