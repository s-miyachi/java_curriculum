package Program_2;

public class Person {

	public String name;
	public int age;
	public double height;
	public double weight;
	
	// 問１
	public static int count;

	Person(String name, int age, double height, double weight){
	
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
	
	// 問２
	count++;
	
	}

	public double bmi(){
		
	return this.weight / this.height / this.height;
	
	}

	public void print(){
		
	System.out.println("名前は" + this.name + "です");
	System.out.println("年は" + this.age + "です");
	
	}
	
	// 問４
	public static void printCount() {
		
		// 問５
		System.out.println("合計" + Person.count + "人です");
		
	}
}
