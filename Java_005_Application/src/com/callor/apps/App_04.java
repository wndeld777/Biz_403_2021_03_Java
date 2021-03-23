package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intClass1 = rnd.nextInt(10) +50;
		int intClass2 = rnd.nextInt(10) +50;
		int intClass3 = rnd.nextInt(10) +50;
		int intClass4 = rnd.nextInt(10) +50;
		int intClass5 = rnd.nextInt(10) +50;
		
		int intTotal = 0;
	
		System.out.println("=====================================");
		System.out.printf("인원수\t 피자주문\t 전체 조각수\n");
		System.out.println("-------------------------------------");
		int pizzaBox =  intClass1 /6;
		if(intClass1 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}
		intTotal += pizzaBox;
		System.out.print(intClass1 + "\t");
		System.out.print(pizzaBox + "\t");
		System.out.println(pizzaBox * 6);
		
		if(intClass2 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}
		intTotal += pizzaBox;
		System.out.print(intClass2 + "\t");
		System.out.print(pizzaBox + "\t");
		System.out.println(pizzaBox * 6);
		
		if(intClass3 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}
		intTotal += pizzaBox;
		System.out.print(intClass3 + "\t");
		System.out.print(pizzaBox + "\t");
		System.out.println(pizzaBox * 6);
		
		if(intClass4 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}
		intTotal += pizzaBox;
		System.out.print(intClass4 + "\t");
		System.out.print(pizzaBox + "\t");
		System.out.println(pizzaBox * 6);
		
		if(intClass5 % (pizzaBox * 6) > 0) {
			pizzaBox++;
		}
		intTotal += pizzaBox;
		System.out.print(intClass5 + "\t");
		System.out.print(pizzaBox + "\t");
		System.out.println(pizzaBox * 6);
		
		System.out.println("----------------------------");
		System.out.print(intTotal+"\t");
		System.out.println(intTotal *6);
	}
}
