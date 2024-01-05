package Signin;

import java.util.ArrayList;

public class ComplexArray {
public static void main(String[] args) {
	int [][]a={ {1,2,3,4},{2,3,4,5},{4,5,6,7},{4,4,5,6}};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[i][j]+" ");
	}
		System.out.println();
	}
	ArrayList<Integer>aa=new ArrayList<Integer>();
	for (int i = 0; i < a.length; i++) {
	int sum =0;
	for (int j = 0; j < a.length; j++) {
		if (j%2!=0) {
			sum=sum+a[i][j];
			
			
		}
		aa.add(sum);
		
	}
	
	System.out.print(sum);
}
}
}