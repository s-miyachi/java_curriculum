package exe1_23;

import pro1_23.Animal;

public class Main1_23 {

	public static void main(String[] args) {
		
		Animal a = new Animal("ライオン",2.1,80);
		
		System.out.println("動物名：" + a.getAnimal());
		
		System.out.println("体長："+ a.getLength() +"m");
		
		System.out.println("速度："+ a.getSp() + "km/h");
		
		
	}

}
