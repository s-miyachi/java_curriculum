package pro.curriculum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {

	public LocalDateTime data = LocalDateTime.now();
	DateTimeFormatter dtformat = 
			DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	public String fmtData = dtformat.format(data); 
	
	public void d () {
		
		this.fmtData = dtformat.format(data);
		
	}
	
}
