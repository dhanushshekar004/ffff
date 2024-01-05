package Signin;

public class removeDuplicateinString {
	
	    public static void main(String[] args) {
	    	String input="hDhanush";
	    	StringBuilder ss=new StringBuilder();
	    	for (int i = 0; i < input.length(); i++) {
	    		char cc= input.charAt(i);
	    		if (ss.indexOf(String.valueOf(cc))==-1) {
	    			ss.append(cc);
					
				}
				
			}
	    	System.out.println(ss);
	    	
	       
	    }

	   
	     	
	       
	    }
	


