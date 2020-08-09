import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;

 

public class Data{

 
public Data(){
	
	
    
        Calendar c = Calendar.getInstance();
        c.set(2020, Calendar.AUGUST, 04);
        Date data = c.getTime();
        
        DateFormat dtHora = DateFormat.getDateTimeInstance();
        System.out.println(dtHora.format(data));

 
        

    }
}