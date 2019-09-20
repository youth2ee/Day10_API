package com.naver.t1;

public class Test3 {

	public static void main(String[] args) {
		double a = Math.ceil(3.22); //올림
		System.out.println(a);
		
		double b = Math.floor(6.72); //내림
		System.out.println(b);
		
		double c = Math.round(3.11); //반올림
		System.out.println(c);
		
		c = Math.round(3.48); //반올림 (소수점 첫째자리에서 반올림 판단된다.)
		System.out.println(c); //3
		
		double d = Math.random();
		System.out.println(d);// 돌릴때마다 다른값 준다.
		
		//랜덤한 수지만 0<= a < 1 범위의 값을 준다.
		
		//정수 0~9사이의 값으로 만들어줘
		d = d*10;
		int e = (int)d;
		System.out.println(e);
	}

}
