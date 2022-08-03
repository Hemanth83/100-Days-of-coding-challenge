import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{ 
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
          a[i] = sc.nextInt();
          }
        int temp = a[n-1], flag = 0;
        for(int i=n-2; i>=0; i--){
          if(a[i] <= temp){
            a[i+1] = temp;
            flag = 1;
            break;
          }else{
            a[i+1] = a[i];
          }
          for(int j=0; j<n; j++)
            System.out.print(a[j] + " ");
          System.out.println();
      }
      if(flag == 0) a[0] = temp;
      for(int j=0; j<n; j++)
        System.out.print(a[j] + " ");
      System.out.println();
	}
}