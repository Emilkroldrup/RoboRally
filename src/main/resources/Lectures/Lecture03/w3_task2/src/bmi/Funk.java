package bmi;

public class Funk implements IFunk {
	private IData data;

	public Funk(IData data){
		this.data = data;
	}
	
	public double getBMI(String cpr) throws DataException {
		double hoejde = data.getHeight(cpr);
		double vaegt = data.getWeight(cpr);
		double bmi = vaegt / (hoejde * hoejde);
		return bmi;
	}
	
	public String getTextualBMI(String cpr) throws DataException {
		double bmi = getBMI(cpr);
		String bmiStr = getName(cpr) + " vejer for lidt.";
		if ((bmi >= 18.5) && (bmi < 25))
			bmiStr = getName(cpr) + "'s v�gt er passende.";
		if ((bmi >= 25) && (bmi <= 30))
			bmiStr = getName(cpr) + " er overv�gtig.";
		if (bmi > 30)
			bmiStr = getName(cpr) + " er sv�rt overv�gtig.";
		return bmiStr;
	}
	
	public String getName(String cpr) throws DataException {
		return data.getName(cpr);
	}
}
