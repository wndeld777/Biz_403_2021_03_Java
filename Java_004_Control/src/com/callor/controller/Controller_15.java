package com.callor.controller;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] args) {
		
		Random rndKor = new Random();
		
		int intKor = 0;
		
		for(int i = 0 ; i <10 ; i++) {
			int num = rndKor.nextInt(100)+1;
			
			System.out.printf("학생 %d : %d\n ",i+1,  num);
		
		}
	}
}
