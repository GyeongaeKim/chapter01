package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();
		
		
		if(point>=90) {
			System.out.println("A등급");
		} else if(point>=80) {
			//90>85 && 85>=80     ---> T&&T ---> T ; 85점일때
			//90>75 && 75>=80     ---> T&&F ---> F ; 75점일때
			
			//**90이상인 값은 들어올 수 없기 때문에, 이 경우, 굳이 90미만(90>point)라는 조건을 달아줄 필요는 없다.
			System.out.println("B등급");
		} else if(point>=70) {
			System.out.println("C등급");
		} else if(point>=60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		} 
		
		
		
		
		/*
		if(point>=90) {
			System.out.println("A등급");
		
		} else if(90>point && point>=80) {
			//90>85 && 85>=80     ---> T&&T ---> T ; 85점일때
			//90>75 && 75>=80     ---> T&&F ---> F ; 75점일때
			System.out.println("B등급");
		
		} else if(80>point && point>=70) {
			System.out.println("C등급");
		
		} else if(70>point && point>=60) {
			System.out.println("D등급");
		
		} else {
			System.out.println("F등급");
		
		} 
		*/
		
		
		
		sc.close();

	}

}
