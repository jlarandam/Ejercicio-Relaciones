package fechaNacimiento;

public class Main {
	
	private static Date date;
	private static Person person;
	
	public static void main(String[] args) {
		date = new Date(25,4,2017);
		person = new Person(date);
		System.out.println(person.getDate().getDate());			
	}

}
