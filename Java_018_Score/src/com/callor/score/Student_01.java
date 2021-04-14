package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/student.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) {
					break; 
				}
		
				String[] scores = reader.split(":");
				
				System.out.printf("%s\t  %s\n",scores[1],scores[5]);
				
				
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(fileName + "파일이 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽는동안 문제발생");
		}
		
		
	}
}
