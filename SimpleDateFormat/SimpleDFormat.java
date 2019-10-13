package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDFormat{
	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf.parse("10/10/2019");
		Date y2 = sdf1.parse("10/10/2019 12:04:54");
		Date x = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		System.out.println(y1+" | \n"+y1+" | \n"+x);
		System.out.println("S "+x2);
				
	}
	
}