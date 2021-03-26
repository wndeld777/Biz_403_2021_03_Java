package com.callor.apps;

import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=================================");
		System.out.println("정수 2개의 사칙연산");
		System.out.println("---------------------------------");
		System.out.println("정수값을 키보드로 입력하고 Enter를 눌러주세요");
		System.out.println("먼저 정수 1개를 입력하세요");
		System.out.print("정수1 >> ");
		float num1 = scan.nextInt();
		System.out.println("한번 더 정수 1개를 입력해 주세요");
		System.out.print("정수2 >> ");
		float num2 = scan.nextInt();
		System.out.println("입력된 두 정수의 사칙연산");
		System.out.println("---------------------------------");
		System.out.printf("%3.0f + %3.0f = %3.0f\n",num1 , num2,(num1 + num2));
		System.out.printf("%3.0f x %3.0f = %3.0f\n",num1 , num2,(num1 - num2));
		System.out.printf("%3.0f * %3.0f = %3.0f\n",num1 , num2,(num1 * num2));
		System.out.printf("%3.0f / %3.0f = %3.2f\n",num1 , num2,(num1 / num2));
		System.out.println(num1 + " % " + num2 + " = "  + (num1 % num2));
		System.out.println("=================================");
		
		
	}
}
