package interviewques;
import java.util.Scanner;

public class SecHigh {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array");
		int num=sc.nextInt();
		int arr[] = new int[num];
		System.out.println("enter the values of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int high=arr[0];
		int sechigh=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>high) {
				sechigh=high;
				high=arr[i];
				
			}
			if(arr[i]<high&&arr[i]>sechigh)
			{
				sechigh=arr[i];
				
			}
		}
		System.out.print("second highest no."+sechigh);
		}
		

	}


