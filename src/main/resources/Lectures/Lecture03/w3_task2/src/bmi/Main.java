/*

*/
package bmi;

public class Main {
	public static void main(String[] args) {
//		IData d = new Data(); 					// implementering af IData
//		IFunk f = new Funk(d); 					// implementering af IFunk
//		Tui g = new Tui(f);
//		g.dialog();
		
		new Tui(new Funk(new Data())).dialog();
	}
}
