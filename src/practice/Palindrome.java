package practice;

import java.util.Scanner;

public class Palindrome {
	
	public static Boolean checkPalindrome(int num) {
		int last, reverse=0, copy;
		boolean res=false;
		
		copy=num;
		
		while(num>0) {
			last=num%10;
			reverse=reverse*10+last;
			num=num/10;
		}
		
		if(copy==reverse) {
			res=true;
		}
		else {
			res=false;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num1=sc.nextInt();
		
		boolean res1=checkPalindrome(num1);
		
		if(res1==true) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not palindrome");
		}

	}

}
