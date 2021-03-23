package com.callor.apps;

public class App_06 {

	public static void main(String[] args) {
		
		int intMon1 = 3723560;
		int intMon2 = intMon1 / 50000;
		int intMon3 = intMon1 / 50000 % 10000;
		int intMon4 = 3560 / 1000;
		int intMon5 = 560 / 500;
		int intMon6 = 60 / 50;
		int intMon7 = 10 / 10;
		
		System.out.println("=========================");
		System.out.println("급여수령액 : " + intMon1);
		System.out.println("=========================");
		for(int i = 0; i<1 ; i++) {
		System.out.printf("50,000 원권\t %d매\n",intMon2);
		System.out.printf("10,000 원권\t %d매\n",intMon3);
		System.out.printf(" 5,000 원권\t 0매\n");
		System.out.printf(" 1,000 원권\t %d매\n", intMon4);
		System.out.printf("   500 원권\t %d매\n",intMon5);
		System.out.printf("   100 원권\t 0매\n");
		System.out.printf("    50 원권\t %d매\n",intMon6);
		System.out.printf("    10 원권\t %d매\n",intMon7);
		System.out.println("==========================");
		
		}
		
		
		
		
		
		
	}
}
