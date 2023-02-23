package bmi;
import java.util.*;



public class Data implements IData
{
	private class Person {
		String cpr;
		String name;
		double height;
		double weight;
		public Person(String cpr, String name, double height, double weight) {
			super();
			this.cpr = cpr;
			this.name = name;
			this.height = height;
			this.weight = weight;
		}

		public String toString(){
			return cpr + " " + name;
		}
	}
	
	private final ArrayList<Person> persons;
	
	public Data(){
		persons = new ArrayList<Person>();
		//
		persons.add(new Person("123456-1234", "Ib Olsen", 1.80, 75.0));
		persons.add(new Person("456789-0123", "Ole Jensen", 1.75, 95.0));
		persons.add(new Person("123456-7890", "Eva Hansen", 1.65, 65.0));
		persons.add(new Person("111111-1111", "Peter Jensen", 1.95, 55.0));
		persons.add(new Person("222222-2222", "Albert Svanesen", 1.65, 65.0));
		persons.add(new Person("333333-3333", "Oskar Petersen", 1.65, 75.0));
		persons.add(new Person("444444-4444", "Hans Olsen", 1.70, 170.0));
		// print dem lige ud af hensyn til debug
		Iterator<Person> it =  persons.iterator();
        while(it.hasNext()) 
        System.out.println(it.next());
        System.out.println("---");
	}
	
	//Return person name
	public String getName(String cpr){
		int i = 0;
		try{
			while (!(persons.get(i).cpr.equals(cpr)))
				i++;
		}
		catch (IndexOutOfBoundsException e){
			return null;
		}
		return persons.get(i).name;
	}
	

	public double getWeight(String cpr){
		int i = 0;
		try{
			while (!(persons.get(i).cpr.equals(cpr)))
				i++;
		}
		catch (IndexOutOfBoundsException e){
			return -1.0;
		}
		return persons.get(i).weight;

	}
	//Returner personens h�jde
	public double getHeight(String cpr){
		int i = 0;
		try{
			while (!(persons.get(i).cpr.equals(cpr)))
				i++;
		}
		catch (IndexOutOfBoundsException e){
			return -1.0;
		}
		return persons.get(i).height;
	}
}