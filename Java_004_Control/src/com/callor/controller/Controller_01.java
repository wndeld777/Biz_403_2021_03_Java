package com.callor.controller;

public class Controller_01 {

	public static void main(String[] args) {
		
		int intSum = 0 ;
		for(int index=3; index < 100 ; index += 3 ) {
			intSum += index;
			System.out.println(intSum);
		}
		intSum = 0 ;
		for(int index=4; index <= 100 ; index +=4 ) {
			intSum += index;
			System.out.println(intSum);
		}
		intSum = 0 ;
		for(int index=15; index < 100 ; index +=15 ) {
			intSum += index;
			System.out.println(intSum);
		}
	
		System.out.println("============================");
		System.out.println("3의 배수의 합 : 1683");
		System.out.println("4의 배수의 합 : 1300");
		System.out.println("3과 5의 배수의 합 : 315");
		System.out.println("============================");
	
	
	
	
	}
}
