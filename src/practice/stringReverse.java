package practice;

import java.util.Scanner;

public class stringReverse {
	
	public static String problem1(String s) {
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		
		System.out.println("The reversed string is "+problem1(s1));
		
		System.out.println("Branch 1");

	}

}
