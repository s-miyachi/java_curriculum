package pro;

import java.util.Random;

public class Status extends Name {


	private static String name;

	public Status() {
		super(name);
	}

	public void display() {
		
		System.out.println("ステータス");
		
		String  [] st = {"HP","MP","攻撃力","素早さ","防御力"};
		
		for(int i = 0; i < st.length; i++) {
			
			Random rand = new Random();

			int intArray = rand.nextInt(1000);

			setStatus(intArray);
			
			System.out.println(st[i]+":"+getStatus());
		}
	}
}
