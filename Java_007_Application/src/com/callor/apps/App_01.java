package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intNums = new int[20];
		int i = 0;
		
		for ( i = 0; i < 20; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
			for (int j = 2; j < 50; j++) {
				if (intNums[i] % j == 0) {
					break;
				}
			}
			System.out.println(intNums[i]);
		}

	}
}
