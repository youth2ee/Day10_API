package com.naver.t1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("start");
		//주민번호 입력받기
		//받고나서 현재 이사람의 나이를 알려줘
		//이 사람이 태어난 계절을 알려줘
		//봄 345 여름 678 가을 91011 겨울 1212
		//성별 : 1번3번5번 남자, 2번4번6번 여자
		//2000년대 3번 4번

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호");
		String num = sc.next();
		
		//charAt : 문자 하나 빼오기
		//substring : 원하는 인덱스만큼 문자 빼오기

		if (num.length() == 14) {
			String a = num.substring(0, 2); //년도
			String b = num.substring(2, 4); //월
			String c = num.substring(7, 8); //성별
			//char c = num.charAt(7);
			
			
			int n2 =Integer.parseInt(b);
			int n3 =Integer.parseInt(c);

			if(n3==3 || n3==4) {
				a = "20"+a;
			}else if(n3==1 || n3==2 || n3==5 || n3==6) {
				a = "19"+a;
			}
			System.out.println("당신이 태어난 해 : "+a);
			
			int age = Integer.parseInt(a);
			age = 2019 - age + 1;
			System.out.println("당신의 나이 : "+age);
			
			//숫자로 바꿔서 1900 더하거나 2000을 더해도 됨

			if(n2>2 && n2<6) {
				System.out.println("태어난 계절 : 봄");
			} else if (n2>5 && n2<9) {
				System.out.println("태어난 계절 : 여름");
			} else if (n2>8 && n2<12) {
				System.out.println("태어난 계절 : 가을");
			} else if (n2 == 12 || n2<3 ) {
				System.out.println("태어난 계절 : 겨울");
			}

			if (n3==1 || n3==3 || n3==5) {
				System.out.println("당신의 성별 : 남자");
			} else if (n3==2 || n3==4 || n3==6) {
				System.out.println("당신의 성별 : 여자");
			}
			
			/*			
			 if (n3%2 == 1) {
				System.out.println("당신의 성별 : 남자");
			} else if (n3%2 == 0) {
				System.out.println("당신의 성별 : 여자");
			}
			 
			 */

		} else {
			System.out.println("잘못입력하셨습니다.");
		}


	}

}
