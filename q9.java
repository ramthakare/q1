package Test;
import java.util.*;
import java.lang.*;
import java.io.*;
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				Scanner obj=new Scanner(System.in);
				int t=obj.nextInt();
			        long answer=0;
				while(t-->0)
				{
				    int n=obj.nextInt();
				    long[] arr=new long[n];
				    for(int i=0;i<n;i++)
				    arr[i]=obj.nextInt();
				    Arrays.sort(arr);
				    answer=arr[0]*(n-1);
				    System.out.println(answer);
				}
	}

}
