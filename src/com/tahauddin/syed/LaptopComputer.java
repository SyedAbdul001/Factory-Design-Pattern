package com.tahauddin.syed;

public class LaptopComputer implements Computer {

	@Override
	public String compute() {
		System.out.println("This is Laptop Computer Impl Class");
		return "Laptop";
	}

}
