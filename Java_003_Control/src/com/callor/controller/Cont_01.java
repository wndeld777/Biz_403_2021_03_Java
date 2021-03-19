package com.callor.controller;

public class Cont_01 {

	public static void main(String[] args) {
		
		int intNum = 0;
		
		for(; intNum <10 ;){
			// 가급적 for문 안에는 ++를 붙이지 않는다
			System.out.printf("%d. 우리나라 대한민국\n", ++intNum);
					
			// ++가 다른 명령문과 함께 사용될때는
			// 변수의 앞,뒤에 따라 결과가 달라진다
			// main() 메서드의 코드는 Topdown으로 진행이 된다.
			// 코드가 정상 진행되는 과정에서
			// for() 명령문을 만나면 조건을 검사하고
			// 조건에 따라 반복하는 코드가 실행된다
			// 이처럼 Topdown으로 진행되는
			// 코드의 흐름을 바꾸는 명령을
			// "제어명령", "control 명령"
		}
		intNum = 0;
		for(; intNum <10 ; intNum++) {
			System.out.println(intNum + ". 우리나라 대한민국");	
		}
		/*
		 * for() 명령을 만나면 intNum=0을 실행한다
		 * 		이 명령은 반복횟수와 관계없이
		 * 		최초에 딱 한번만 실행된다
		 * 
		 * intNum < 10 을 실행하여 조건을 검사
		 * 		결과가 true 이면 {} 의 명령을 실행
		 * 
		 * 명령 실행이 끝나면 다시 for() 명령문 시작으로 되돌아 온다
		 * 증가 : intNum++ 명령을 실행
		 * 조건검사 : intNum < 10 조건검사
		 * 
		 * 증가, 조건검사를 반복하면서
		 * 	조건검사 결과가 false 가 될때까지(조건검사 결과가 true 인동안)
		 *  반복하여 {} 의 명령을 실행
		 */
		for(intNum = 0 ; intNum < 10 ; intNum++) {
			System.out.println(intNum);
			
		}
		
	}
}
