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
		//920720-2222222
		
		int[] count = new int[num.length()];
		
		int sum=0;
		int idx=2;
		
		//문자 하나씩 받기
		
		/*
		1. split
		String [] nums = num.split(""); //자르는 기준이 없다.
		for(int i=0;i<nums.length;i++){}
		
		2. substring
		: 꺼내면 새로운 문자열
		for(int i =0; i<num.length();i++){
			String n1 = num.substring(i,i+1);
			int n= Integer.parseInt(n1);
			//parse는 string타입을 받는다.
		}

		3. chatAt */
		for(int i=0;i<num.length()-1;i++){ //마지막번호는 빼야한다.
			
			if(i==6) {
				continue; //증감식으로 간다.
			}
			
			char a = num.charAt(i);
			//string을 하나씩 받아서 char타입으로 하나씩 받는다.
			//문자를 문자열로 바꿔야 한다.(char -> string)
			//String 클래스나 Character 클래스를 확인
			String s = String.valueOf(a); //(char -> string)
			int n = Integer.parseInt(s); //(string -> int)
			
			sum = sum + n*idx;
			idx++;
			
			if(idx==10) {
				idx=2;
			}
		}
		
		sum = sum%11;
		sum = 11 - sum;
		
		if(sum>9) { //if문 안써도 상관은 없다.
			sum = sum%10;
		}
		
		int result = Integer.parseInt(String.valueOf(num.charAt(num.length()-1)));
		
		if(sum==result) {
			System.out.println("주민번호입니다.");
		} else {
			System.out.println("주민번호 아닙니다.");
		}
		
		
		

	}

}

