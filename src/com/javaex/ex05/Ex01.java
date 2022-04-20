package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		
		//랜덤함수 예제 1~10까지 수
		/*
		int num = (int)(Math.random()*10)+1;
		System.out.println(num);
		*/
		
		
		//로또번호 자동생성 6개 (1~45)
		int no1, no2, no3, no4, no5, no6;
		
		no1 = (int)(Math.random()*45)+1;
		no2 = (int)(Math.random()*45)+1;
		no3 = (int)(Math.random()*45)+1;
		no4 = (int)(Math.random()*45)+1;
		no5 = (int)(Math.random()*45)+1;
		no6 = (int)(Math.random()*45)+1;
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		System.out.println(no4);
		System.out.println(no5);
		System.out.println(no6);
		
		
		System.out.println("==========================");
		
		for(int i=1; i<=6; i++) {
			System.out.println("no"+i);
			}
		
		
		
		//로또번호 자동생성 6개 (1~45)
		for(int i=1; i<=6; i++) {
			int num = (int)(Math.random()*45)+1;
			System.out.print(num+"\t");
			}
	}

}
