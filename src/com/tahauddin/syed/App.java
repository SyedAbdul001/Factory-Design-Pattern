package com.tahauddin.syed;

public class App {
	
	public static void main(String[] args) {
		ComputerFactory computerFactory = new ComputerFactory();
		Computer computer = computerFactory.getComputer("smart tv");
		String compute = computer.compute();
		System.out.println(compute);
	}

}
