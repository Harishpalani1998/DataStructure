package array;
import java.util.*;
public class AddAndSum {

	public static void main(String[]arg) {
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			 a[i] = sc.nextInt();
	            sum = sum + a[i];
		}
		System.out.println("Sum:"+sum);
	}
}
