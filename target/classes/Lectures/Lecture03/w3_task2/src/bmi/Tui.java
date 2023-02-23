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

		System.out.println("enter cpr-nr: ");
			cpr = tastatur.nextLine().trim();

		try{
			System.out.println(funk.getName(cpr) + "'s bmi is: "
					+ funk.getBMI(cpr));
			System.out.println(funk.getTextualBMI(cpr));
		}
		catch (DataException e){
			System.out.println("Person not found!");

		}

		tastatur.close();		
	}
}
