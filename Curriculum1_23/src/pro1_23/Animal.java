package pro1_23;

public class Animal {
	
	private String animal ;
	
	private double length ;
	
	private int sp ;
	
	public Animal(String animal,double length,int sp) {
		
		this.animal = animal;
		this.length = length;
		this.sp = sp;
		
	}
	
	// animal getter
	public String getAnimal() {
			
		return this.animal;
			
	}
	
	// animal setter
	public void setAnimal(String animal) {
		
		this.animal = animal;
		
	}
	
	// length getter
	public double getLength () {
		
		return this.length;
	}
	
	// length setter
	public void setLength(double length) {
		
		this.length = length;
	}
	
	
	// sp getter
	public int getSp() {
		
		return this.sp;
	}
	
	// sp setter
	public void setSp(int sp) {
		
		this.sp = sp;
	}
}
