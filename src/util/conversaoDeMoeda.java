package util;

public class conversaoDeMoeda {
	
	public static double IOF = 0.5;
	
	public static double ancapToReal (double amount, double ancapPrice) {
		return amount * ancapPrice * IOF;
		
	}

}
