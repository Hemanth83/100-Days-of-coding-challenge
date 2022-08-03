import java.util.*;
import java.lang.*;
import java.io.*;

public class Bubble_Sort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i=0; i<n; i++){
        a[i] = sc.nextInt();
      }
      int swap = 0;
      for(int i=0; i<n; i++){
        for(int j=0; j<n-1; j++){
          if(a[j] > a[j+1]){
            int temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
            swap++;
          }
        }
      }
      System.out.println("Array is sorted in " + swap + " swaps.");
      System.out.println("First Element: " + a[0]);
      System.out.println("Last Element: " + a[n-1]);
	}
}