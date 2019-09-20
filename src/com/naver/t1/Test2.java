package com.naver.t1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//주민등록번호를 받아요
		//920720-2022222
		//이번호를 만드는 규칙
		//생년월일-성별/지역/
		//맞는번호인지 아닌지

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호");
		String num = sc.next();
		int[] count = new int[num.length()];

		char a='a';
		int m=0;
		int j=2;
		int k=2;
		int sum=0;
	

		for(int i=0;i<8;i++) {

			a = num.charAt(i);
			m = Integer.parseInt(String.valueOf(a));

			count[i]=m*j;
			j++;
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
		
		int plus = sum%11;
		plus = 11 - plus;
		
		a = num.charAt(12);
		m = Integer.parseInt(String.valueOf(a));
		
		boolean check = true;

		if(plus<10) {
			if(plus == m) {
			}else {
				check=false;
			}
		}else if (plus>=10) {
			plus = plus%10;
			if(plus == m) {
			}else {
				check=false;
			}
		}
		
		if(check) {
			System.out.println("주민번호입니다.");
		} else {
			System.out.println("주민번호 아닙니다.");
		}

	}

}

