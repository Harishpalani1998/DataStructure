package array;

import java.util.Scanner;

public class Find {

	public static void main(String[] args) {
		int n, x, flag = 1, loc = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element you want to Find:");
        x = s.nextInt();
        for (int i = 0; i < n; i++) 
        {
            if(a[i] == x)
            {
                flag =1;
                loc=i;
                
                break;
            }
            else if(a[i]!= x)
            {
            	loc =i;
                flag = 0;
            }
            }
        if(flag == 1) {
        	System.out.println(x+" is exist");
        }
        else if(flag == 0) {
        	System.out.println(x+" is not exist");
        }
        
	}

}
