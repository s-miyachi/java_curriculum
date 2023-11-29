package exe.curriculum;

import pro.curriculum.Data;
import pro.curriculum.Text;

public class ExeClass {

	public static void main(String[] args) {
		
		Text t = new Text();
		
		t.str();
		
		System.out.println(t.s + "！ここは" + t.country + "です！");
		
		System.out.println("この" + t.food + "はうまい");
		
		System.out.println(t.food + "は" + t.foodtype + "です");
		
		Data now = new Data();
		
		now.d();
		
		System.out.println("今の現在日時は" + now.fmtData + "です");
	}

}
