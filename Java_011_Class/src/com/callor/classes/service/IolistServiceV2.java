package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV2 extends IolistServiceV1 {

	/*
	 * V1의 input method를 재 정의 한다 매입단가, 매출단가는 반드시 0 이상이어야 한다 유효성검사를 하도록 코드를 재 정의 한다
	 */
	@Override
	public void input() {
		// TODO 매입매출 등록

		System.out.println("===============================");
		System.out.println("매입 매출 등록");
		System.out.println("-------------------------------");
		System.out.print("상품명 >> ");
		String pname = scan.next();
		System.out.print("거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();
		System.out.print("거래처명 >> ");
		String dname = scan.next();
		System.out.print("매입매출 구분 >> ");
		String inout = scan.next();
		System.out.print("수량 >> ");
		Integer qty = scan.nextInt();

		Integer iprice = 0;
		while (true) {
			System.out.print("매입단가 >> ");
			iprice = scan.nextInt();
			if (iprice < 0) {
				System.out.println("0이상으로 입력해주세요");
			} else {
				break;
			}
		}

		Integer oprice = 0;
		while (true) {
			System.out.print("매출단가 >> ");
			oprice = scan.nextInt();
			if (oprice < 0) {
				System.out.println("0이상으로 입력해주세요");
				continue;
			}
			break;
		}

		IolistVO iolistVO = new IolistVO();
		iolistVO.setPname(pname);
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInout(inout);
		iolistVO.setIprice(iprice);
		iolistVO.setOprice(oprice);
		iolistVO.setQty(qty);

		// iolistVO에 저장한 데이터를 확인하기!!
		this.printIolist(iolistVO);

		// 입력된 매입매출 데이터를 데이터리스트에 담기
		iolist.add(iolistVO);
	}

}
