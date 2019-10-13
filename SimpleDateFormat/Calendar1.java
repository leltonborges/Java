package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendar1 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		Date d = Date.from(Instant.parse("2018-10-17T16:32:30Z"));
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance();
		//Add data no Calendar
		cal.setTime(d);
		int minute = cal.get(Calendar.MINUTE);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		//foi add + 1 pq o janeiro começa com 0
		int month = cal.get(Calendar.MONTH) + 1;
		
		System.out.println("Minutos "+ minute);
		System.out.println("Dias " + day);
		System.out.println("Dias " + month);
		
		//add o tempo desejado: horas, minutos, mes, dias, etc 
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		
		}

}
