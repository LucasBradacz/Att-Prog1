package Aula6;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Calendar;

public class att1 {

    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("pt", "BR"));

        Date hoje = Dia();
        
        SimpleDateFormat agora = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy, HH:mm:ss.SS");
        
        System.out.println(agora.format(hoje));
    }
	private static Date Dia() {
		
		Date dia = new Date();
		
		return dia;
	}

}
