package com.tahauddin.syed;

public class ComputerFactory {
	
	public Computer getComputer(String computerName) {
		
		if(computerName.equalsIgnoreCase("laptopComputer")) {
			return new LaptopComputer();
		}
		else if(computerName.equalsIgnoreCase("Smart TV")) {
			return new SmartTVComputer();
		}
		else if(computerName.equalsIgnoreCase("PhoneComputer")) {
			return new PhoneComputer();
		}else {
			return null;
		}
	}

}
