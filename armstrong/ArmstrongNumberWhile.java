import java.util.Scanner;
public class ArmstrongNumberWhile{
	
	public static boolean isArmstrong(int n) {
		
		int temp = n,sum = 0;
		while(n>0) {
			int d = n%10;
			sum = sum + d*d*d;;
			n=n/10;
		}
		if (sum==temp) return true;
		else return false;
	}
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number: ");
        int num = sc.nextInt();
        if(isArmstrong(num))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");

   }
	
}
