package com.tahauddin.syed;

public class PhoneComputer implements Computer {

	@Override
	public String compute() {
		System.out.println("This is Phone Computer Impl Class");
		return "Phone";
	}

}
