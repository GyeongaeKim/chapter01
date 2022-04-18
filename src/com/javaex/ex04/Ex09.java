package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			
			if(num==0) {
				System.out.println("종료");
				break;
			}else if(num%3==0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		
		
		/* 이건 내가 짠 것, 위의 강사님 것과 비교해볼 것!
		System.out.println("숫자를 입력하세요");
		
			
		while(true) {
			int num = sc.nextInt();
			
			if(num%3==0 && num!=0) {
				System.out.println("3의 배수입니다.");
				System.out.println("숫자를 입력하세요");
				
				
			}else if(num!=0){
				System.out.println("3의 배수가 아닙니다.");
				System.out.println("숫자를 입력하세요");
				
			}else {
				System.out.println("종료");
				break;
				
			}
			
		}
		*/
	
		sc.close();
		
	}

}
