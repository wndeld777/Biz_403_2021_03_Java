package com.callor.apps;

import java.util.Arrays;
import java.util.Scanner;

public class KeyInput_04 {

	public static void main(String[] args) {

		int[] intNum = new int[5];
		int intSum = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("==========================");
		System.out.println("정수 5개의 합");
		System.out.println("--------------------------");
		System.out.println("정수 5개를 입력하세요");
		System.out.println("--------------------------");

		for (int i = 0; i < intNum.length; i++) {
			System.out.print("정수 " + (i + 1) + " >> ");
			intNum[i] = scan.nextInt();
		}
		for (int i = 0; i < intNum.length; i++) {
			intSum += intNum[i];
		}
		System.out.print("입력한 숫자들 : ");
		System.out.println(Arrays.toString(intNum));
		System.out.println("--------------------------");
		System.out.println(intSum);
		System.out.println("==========================");
	}
}
