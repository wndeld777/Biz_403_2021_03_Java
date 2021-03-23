package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intMembers = rnd.nextInt(25) + 26;
		
		
		if(intMembers % 6 == 0) {
			
			System.out.println("인원 : "+ intMembers);
			System.out.println("피자 : "+ (intMembers/6));
		}
		if(intMembers % 3 == 0) {
			
			System.out.println("인원 : " + intMembers);
			System.out.println("피자 : " + (intMembers/3));
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
