import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatConversion {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		System.out.println("New Date Format is "+ dateFormatConversion("ddMMyyyy","dd/MM/yyyy","30031993"));

	}
	
	public static String dateFormatConversion(String inputDateFormat, String outputDateFormat, String givenDate) throws ParseException {
		SimpleDateFormat inpFormat = new SimpleDateFormat(inputDateFormat);
		SimpleDateFormat outFormat = new SimpleDateFormat(outputDateFormat);
		
		Date date = inpFormat.parse(givenDate);
		String requiredDate = outFormat.format(date);
		
		return requiredDate;
		
		
	}

}
