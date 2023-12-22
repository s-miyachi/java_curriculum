package pro;

import java.util.Scanner;

public class Name {
	
	private Scanner scan = new Scanner(System.in);
	
	private String name ;
	
	private int status ;
	
	public Name(String name) {
		
		this.name = scan.nextLine();
		
	}

	public Name() {
		
	}

	public String getName() {
		
		return this.name;
			
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public int getStatus() {
		
		return this.status;
			
	}
	
	public void setStatus(int status) {
		
		this.status = status;
		
	}
}
