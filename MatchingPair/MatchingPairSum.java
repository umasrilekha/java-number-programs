public class MatchingPairSum {
	
	public static boolean checkMatchingPairSum(int[] a, int sum) {
		int i=0,j=a.length-1;
		while(i<j) {
			if(a[i]+a[j]==sum) return true;
			if(a[i]+a[j]<sum) i++;
			else j--;
		}
        return false;
    }
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		System.out.println(checkMatchingPairSum(a,9));
	}
