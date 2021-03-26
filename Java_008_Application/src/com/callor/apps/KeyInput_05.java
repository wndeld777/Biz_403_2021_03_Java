package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(LinesService.dLines(50));
		System.out.println("정수를 입력하세요");
		System.out.print(" >> ");
		int num = scan.nextInt();
		System.out.println(LinesService.dLines(50));

		if (num % 2 == 0) {
			System.out.println("입력한 정수 " + num + "는 짝수입니다");
		} else {
			System.out.println("입력한 정수 " + num + "는 짝수가 아닙니다");
		}
		int i = 0;
		for ( i = 2; i < num; i++) {
			if (num % i == 0) {
				break;
			}
		}
		if (i < num) {
			System.out.println("입력한 정수 " + num + "는 소수가 아닙니다");
		} else {
			System.out.println("입력한 정수 " + num + "는 소수입니다");
		}
		/*
		 * boolean bYes = false; 
		 * for(int i = 0; i < num; i++) { 
		 * if(num % i == 0) { 
		 * bYes = true; 
		 * break; } } 
		 * if (bYes) { 
		 * System.out.println(num + "는 소수입니다"); 
		 * } else {
		 * System.out.println("입력한 정수 "+num + "는 소수가 아닙니다"); }
		 */
		System.out.println(LinesService.dLines(50));

	}
}
