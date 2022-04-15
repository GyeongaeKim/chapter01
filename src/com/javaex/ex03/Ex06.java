package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		
		int pay;
		
		if(time<=8) {
			pay = time*10000;
		}else {
			pay = 80000 + (time-8)*((int)(10000*1.5));
			//pay = 80000 + (time-8)*10000*3/2; 
			//분수로 표기하는 것 보다는 int로 바꿔주는 게 더 나을수도..!
			}
		System.out.println("임금은 "+pay+"원 입니다.");
		
		
		sc.close();
		
		
	}

}
