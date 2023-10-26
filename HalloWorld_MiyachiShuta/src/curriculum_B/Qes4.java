package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++ ) {
			
			for(int j = 1; j < 10; j++) {
				
				String num1 = String.format("%02d",i);
				String num2 = String.format("%02d",j);
				String num3 = String.format("%02d",(i * j));
				
				System.out.print(num1 + " * " + num2 + " = " + num3 + " || ");
				}
			System.out.println("");
			
		}
		
	}

}
