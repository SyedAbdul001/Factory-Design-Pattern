package com.tahauddin.syed;

public class SmartTVComputer implements Computer {

	@Override
	public String compute() {
		System.out.println("This is Smart TV Computer Impl Class");
		return "Smart TV";
	}

}
