package org.gitSample;

public class sample {
	private void git1() {
		System.out.println("New Line Created");

	}
public static void main(String[] args) {
	
	sample s= new sample();
	s.git1();
	
	int given= 1234;
	int reversed=0;
	
	while (given!=0) {
		reversed= reversed*10;
		reversed= reversed+given%10;
		given= given/10;

	}
System.out.println(reversed);		
	
}
}

