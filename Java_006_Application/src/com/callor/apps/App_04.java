package com.callor.apps;
/*
 * 배열에 저장된 값중에서 짝수가 저장된
 * 최초의 위치는 어디인가
 */
import java.util.Random;

public class App_04 {

	public static void main(String[] args) {
		// int intNums[] = new int[20];
		int[] intNums = new int[20];

		Random rnd = new Random();

		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		for(int i = 0; i < intNums.length; i++) {
			if (intNums[i] % 2 == 0) {
				System.out.print("3의 배수가 저장된 최초의 위치:" + intNums[i]);
				System.out.println(i + "번");
				break;
			}
		}
	}
}
