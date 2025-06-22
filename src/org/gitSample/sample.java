package org.gitSample;

public class sample {
public static void main(String[] args) {
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

