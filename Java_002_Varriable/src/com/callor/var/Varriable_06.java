package com.callor.var;

public class Varriable_06 {

	public static void main(String[] args) {
		
		int intNum = 0;
		//System.out.println(intNum = intNum +1);
		System.out.println( "숫자 : "+ (intNum + 1));
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		
		intNum = 0;
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		
		intNum = 0;
		// 1
		intNum += 1;
		System.out.println(intNum);
		// 19번과 20번 명령문을 한 명령문으로 만들면
		System.out.println(++intNum);
		
		// 2
		System.out.println(intNum);
		intNum += 1;
		
		//25번과 26번을 한 명령문으로 만들면
		System.out.println(intNum ++);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
