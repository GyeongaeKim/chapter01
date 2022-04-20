package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		//반복문 안에, 입력,합계를 받아야함!!
		
		int sum = 0; 
		//이건 합계! 근데 지금 합계를 낼 수 없음, 계산이 틀어지는 것을 막기 위해 0으로 설정.
		int num;
		/*
		do {
			num = sc.nextInt(); //이건 입력임~!
			sum = sum + num;
			System.out.println("합계: " + sum);
		}while(num != 0);
		*/
		
		
		
		while(true) {
			num = sc.nextInt(); //이건 입력임~!
			sum = sum + num;
			System.out.println("합계: " + sum);
			if(num==0) {
				break;
			}
		}
		
		
		
		
		
		
		sc.close();
		}

}
