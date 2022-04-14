package com.javaex.ex01;

public class Ex10 {
	
	public static void main(String[] args) {
		
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리연산자 기본 && AND
		System.out.println("&& 연산자");
		System.out.println(true && true);   // true
		System.out.println(true && false);  // false
		System.out.println(false && true);  // false
		System.out.println(false && false); // false
		
		//논리연산자 기본 || OR
		System.out.println("|| 연산자");
		System.out.println(true || true);   // true
		System.out.println(true || false);  // true
		System.out.println(false || true);  // true
		System.out.println(false || false); // false
		
		
		//논리연산자 응용
		System.out.println("응용");
		System.out.println((a>b)&&(a<b));   // (F)&&(T) -> false
		System.out.println((a>b)&&(a>b));   // (F)&&(F) -> false
		
		System.out.println("========================");
		System.out.println((a>b)||(a<b));   // (F)||(T) -> true
		
		//논리연산자 기본 !
		System.out.println("========================");
		System.out.println(a>b);   // 5>7 -> false
		System.out.println(!(a>b));// !(false) -> true
		
		System.out.println(a<b);   // 5<7 -> true
		System.out.println(!(a<b));// !(true) -> false
		
	}

}
