package Vehicle;

public class Main {

	public static void main(String[] args) {

		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();

		Person.printCount();
		
		System.out.println("");
		
		Car car = new Car(); 
		
		Bicycle bicycle = new Bicycle();
		
		// owner person1
		car.setOwner(person1.fullName());
		
		// bicycle person2
		bicycle.setOwner(person2.fullName());
		
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		
		System.out.println("");
		// person1がcarを購入
		person1.buy(car);
		
		//　person2がcarを購入
		person2.buy(bicycle);
		
		
	}
}
