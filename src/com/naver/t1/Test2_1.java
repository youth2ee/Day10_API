package com.naver.t1;

import java.util.Scanner;

public class Test2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호");
		String num = sc.next();
		//920720-2222222

		int[] count = new int[num.length()];


		char a='a';
		int m=0;
		int j=2;
		int k=2;
		int sum=0;


		for(int i=0;i<num.length();i++) {
			a = num.charAt(i);
			m = Integer.parseInt(String.valueOf(a));
			
			count[i]=m*j;
			j++;
			
			if(i==)
		}

		for(int i=8;i<12;i++) {

			a = num.charAt(i);
			m = Integer.parseInt(String.valueOf(a));
			count[i]=m*k;
			k++;	
		}


		for(int i=0; i<count.length;i++) {
			sum = sum + count[i];
		}

		sum = sum%11;
		sum = 11 - sum;
		
		if (sum>=10) {
			sum = sum%10;
		}
		
		m = Integer.parseInt(String.valueOf(num.charAt(12)));
		
		boolean check = false;
		
		if(sum==m) {
			check =true;
		}
	
		if(check) {
			System.out.println("주민번호입니다.");
		} else {
			System.out.println("주민번호 아닙니다.");
		}

	}

}
