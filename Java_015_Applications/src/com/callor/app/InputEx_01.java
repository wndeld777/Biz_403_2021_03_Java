package com.callor.app;

import com.wndeld777.stnadard.InputService;
import com.wndeld777.stnadard.impl.InputServiceimplV1;

public class InputEx_01 {

	public static void main(String[] args) {
		
		InputService isV1 = new InputServiceimplV1();
		
		isV1.inputValue("새우깡");
	}
}
