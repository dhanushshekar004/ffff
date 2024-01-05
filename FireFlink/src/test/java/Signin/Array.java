package Signin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Array {
	public static void main(String[] args) {
		int a []= {1,2,3,4,5};
		int b []= {10,9,8,7,6};
		int zeothIndex=b[0];
		int firstIndex=b[1];
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(b[i]==zeothIndex||b[i]==firstIndex) {
					continue;
			    }
              else if (b[i]>b[j]) {
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}	
		}
			
		}
		int c=a.length+b.length;
		int g[]=new int[c];
		System.arraycopy(a, 0, g, 0, a.length);
		System.arraycopy(b, 0, g, a.length, b.length);	
		System.out.println(Arrays.toString(g));
			
		}
		
	}
	
