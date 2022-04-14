package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//일반적인 방식
		double pi = 3.14;
		double result01 = pi*5*5;
		System.out.println(result01);
		
		//pi값이 변경되는 경우
		pi=3.1415926;
		double result02 = pi*5*5;
		System.out.println(result02);
		
		
		
		//상수로 정의할 경우 -> 이름을 대문자로 표기(의무는 아니지만, 그냥 암묵적인 규칙같은)
		final double PI = 3.14;
		double result03 = PI*5*5;
		System.out.println(result03);
		
		//***상수의 값을 변경하려고 할 때, -> 오류가 난다
		/*
		PI = 3.1415926;
		double result04 = PI*5*5;
		System.out.println(result03);
		*/
		
		
		
		
	}

}
