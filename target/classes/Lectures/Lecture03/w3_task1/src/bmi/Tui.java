package bmi;

import java.util.Scanner;

public class Tui {
private IFunk funk;
	
	public Tui(IFunk funk){
		this.funk = funk;
	}
	
	public void dialog(){
		Scanner tastatur = new Scanner(System.in);
		String cpr = null;

		System.out.println("indtast cpr-nr: ");
			cpr = tastatur.nextLine().trim();
		 	
			System.out.println(funk.getName(cpr) + "'s bmi er: " 
						+ funk.getBMI(cpr));
			System.out.println(funk.getTextualBMI(cpr));
		tastatur.close();		
	}
}
