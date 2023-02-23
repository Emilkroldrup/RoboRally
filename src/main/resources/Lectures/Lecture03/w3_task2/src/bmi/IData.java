package bmi;

public interface IData {
	String getName(String cpr) throws DataException;;
	double getWeight(String cpr) throws DataException;;
	double getHeight(String cpr) throws DataException;;
}

