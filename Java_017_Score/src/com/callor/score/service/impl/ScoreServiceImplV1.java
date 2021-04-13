package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.wndeld777.stnadard.InputService;
import com.wndeld777.stnadard.MenuService;
import com.wndeld777.stnadard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected MenuService mService;
	protected InputService inScore;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;


	@Override
	public void selectMenu() {

		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("학생정보 등록");
		scoreMenu.add("성적 등록");
		scoreMenu.add("성적정보 열기");
		scoreMenu.add("성적정보 저장");
		scoreMenu.add("성적정보 출력");
		mService = new MenuServiceImplV1("대한 고등학교 성적처리 시스템 2021", scoreMenu);
		
		while(true) {
			Integer menu = mService.selectMenu();
			if(menu == null) {
				System.out.println("업무종료");
				break;
			}
			if(menu == 1) {
				this.inputStudents();
			}else if(menu == 2) {
				this.inputScore();
			}else if(menu == 3) {
				this.readScore();
			}else if(menu == 4) {
				this.saveScore();
			}else if(menu == 5) {
				this.printScore();
			}
			
		}
		
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputStudents() {
		// TODO Auto-generated method stub
		
	}

}
