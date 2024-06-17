package Program_1;

public class Person {
	// 問題１
	public String name;
	
	public int age;
	
	public double height;
	
	public double weight;
	
	public double bmi;
	
	public static int count;
	
	// 問題２
	
	Person(String name , int age , double height , double weight ){
		
		
	// 問題３
		
		this.name = name;
		
		this.age = age;
		
		this.height = height;
		
	// 問題４
		this.weight = weight;
		
		count++;
	}
	
	
	// 問題６,問題７
	public double BMI() {
		
		this.bmi = this.weight/((this.height)*(this.height));
		
		return bmi;
		
	}
	
	// 問題８,問題９
	public void print() {
		
		System.out.println("名前は"+ this.name + "です");
		
		System.out.println("年は" + this.age + "歳です");
		
		System.out.println("ＢＭＩは" + (Math.floor(this.bmi) + "です"));
		
		System.out.println("");
		
	 // 問題１０
	    System.out.println("合計" + (count) + "人です");

	}

}
