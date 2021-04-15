package com.callor.score.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.StudentService;
import com.callor.score.model.StudentVO;

public class StudentServiceImplV1 implements StudentService {
	protected Scanner scan;
	protected List<StudentVO> studentList;
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 학과 = 4;
	protected final int 주소 = 5;
	
	
	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
		this.loadStudent();
	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadStudent() {

		String studentFile = "src/com/callor/score/student.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;

				String student[] = reader.split(":");

				StudentVO stuVO = new StudentVO();
				stuVO.setNum(student[학번]);
				stuVO.setName(student[이름]);
				stuVO.setGrade(student[학년]);
				stuVO.setDept(student[학과]);
				stuVO.setAddress(student[주소]);
				studentList.add(stuVO);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 여는 동안 문제발생");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽는 동안 문제발생");
		}

	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < studentList.size() ; i++) {
			StudentVO studentVO = studentList.get(i);
			System.out.println(studentVO.toString());
			System.out.println("학번을 입력해주세요");
			System.out.print(">> ");
			String strNum = scan.nextLine();	
		}
		
		
		
		return null;
	}

	@Override
	public void printStudent() {
		
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t주소");
		System.out.println("-".repeat(80));
		
		int nSize = studentList.size();
		for(int i = 0 ; i < nSize ; i++) {
			StudentVO vo = studentList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getDept() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.print(vo.getAddress() + "\n");
		}
		System.out.println("=".repeat(80));
	}

}
