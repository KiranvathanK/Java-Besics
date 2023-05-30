package org.phone;

public class InternalStorage {
	
	public void processorName() {
		System.out.println("processor name is Snapdrogn");
	}
	
	public void ramSize() {
		System.out.println("ram is 16GB");
	}

public static void main(String[] args) {
	InternalStorage istg = new InternalStorage();
	ExternalStorage estg = new ExternalStorage();
	istg.processorName();
	istg.ramSize();
	estg.size();
}
}
