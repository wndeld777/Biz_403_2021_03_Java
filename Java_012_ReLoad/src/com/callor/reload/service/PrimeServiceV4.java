package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {
	protected List<Integer> primeList;
	protected Random rnd;

	public PrimeServiceV4() {
		// TODO Auto-generated constructor stub
		primeList = new ArrayList<Integer>();
		rnd = new Random();
	}

	public void primeNum() {
		for (int i = 0; i < 50; i++) {
			int rndNum = rnd.nextInt(51) + 50;

			boolean notPrime = false;
			for (int index = 2; index < rndNum; index++) {
				if (rndNum % index == 0) {
					notPrime = true;
					break;
				}
			}
			if (!notPrime) {
				primeList.add(rndNum);
			}
		}
	}

	public void printPrimeNum() {
		// 배열, List 구조의 데이터들을 전체를 반복하여 (읽기)처리할 경우
		//for(int i = 0 ; i < primeList.size(); i++) {
		//	Integer prime = primeList.get(i)
		//}
		// 위의 2줄의 명령문을 한번에 실행하는 효과
		for (Integer prime : primeList) {
			System.out.println(prime);
		}
	}
}
