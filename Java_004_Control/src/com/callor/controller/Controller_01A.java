package com.callor.controller;

public class Controller_01A {

	public static void main(String[] args) {
		
		// 1. 0 ~ 99 + 1 => 1 ~ 100
		for(int i = 0 ; i < 100 ; i++) {
			
			// 1-1. 1 ~ 100
			int num = i + 1;
			// 2. 3의 배수이면
			if(num % 3 == 0) {
				System.out.print(num);
				System.out.print(",");
			}
			// 3. 4의 배수이면
			if(num % 4 == 0) {
				System.out.println(num);
			}
		
		}
	
		// 3의 배수의 합, 4의 배수의합
		// 합을 구하기 위해 변수를 선언한다
		int intSum3 = 0;
		int intSum4 = 0;
		int intSum5 = 0;
		for(int i = 0 ; i < 20; i++) {
			int num = i + 1;
			
			// num값이 3의 배수이면
			// num값을 intSum3변수에 누적
			if(num % 3 == 0) {
				intSum3 += num;
				//3의 배수 이면 4의 배수에는 합산을 하지말라
			} 
			if(num % 4 == 0) {
				intSum4 += num;
			
		
	
			/*
			 * 여기에서 else if 를 사용하면
			 * 3의 배수이면서 4의 배수인 경우
			 * 3의 배수에는 합산(누적)이 되지만
			 * 4의 배수에는 누락이 된다.
			 */
	
			/*
			 * 3의 배수이면서 5의 배수
			 * 
			 * num % 3 == 0 AND num % 5 == 0
			 */
			if(num % 3 == 0) {
				if(num % 5 == 0) {
					intSum5 += num;
				}
			}
	
	}		
	}
			System.out.println("=======================");
			System.out.println("3의 배수의 합 :"+ intSum3);
			System.out.println("4의 배수의 합 :"+ intSum4);
			System.out.println("3 AND 5의 배수 :"+ intSum5);
	
	
	
	
	}
}
