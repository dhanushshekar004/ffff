package Signin;

import java.util.Arrays;

public class sumOfTwoArray {
	public static void main(String[] args) {
		
	int sum=0;
	int a[]=new int[4];
	
      a[0]= 1;
      a[1]=-2;
      a[2]=9;
      int b[]=new int[4];
      b[2]=5;
      int c[]=new int[a.length+b.length];
      System.arraycopy(a, 0, c, 0, a.length);
      System.arraycopy(b, 0, c, a.length, b.length);
      System.out.println(Arrays.toString(c));
		for (int j = 0; j < c.length; j++) {
//			System.out.println(c[i]);
//			System.out.println(c[j]);
			sum=sum+c[j];
			
		}
		System.out.println(sum);	
      }
   
}
