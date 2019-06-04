package array;
public class InsertionSort {
	 public static void main (String[] args)
	    {
	        int a[] = {16, 19, 11, 15, 10, 12, 14};
	        for(int i=0;i<a.length;i++)
	        {
	            int j = i;
	            while(j>0)
	            {
	                if(a[j-1] > a[j])
	                {   
	                    int temp = a[j-1];
	                    a[j-1] = a[j];
	                    a[j] = temp;
	                }           
	                else
	                {
	                    break;
	                }
	                j--;
	            }
	        }
	        for(int x : a)
	        {
	            System.out.println(x);
	        }
	    }
	}