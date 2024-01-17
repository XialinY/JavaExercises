package at.technikum.Exercises.Covid;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple demo application
 * 
 *
 */
public class Main {
	
	/**
	 * the main function
	 * 
	 * <ol>
	 * 		<li>creates the test-data</li>
	 * 		<li>displays the corona-status of all persons for several days</li>
	 * 		<li>prints the test statistics for all persons</li>
	 * 
	 * </ol>
	 * 
	 * @param args
	 *            optional args (not used)
	 */
	public static void main(String[] args) {
		
	}

	public static void printPersons(List<Person> persons, Date d){

	}

	public static void printTestStatistics(List<Person> persons){
		for (int i = 0; i < persons.size(); i++) {
			persons.get(i);
		}
	}
	
	/**
	 * Create some demo-data
	 * 
	 * @ProgrammingProblem.Hint provided
	 * @return the persons
	 */
	private static List<Person> init() {
		List <Person> persons = new ArrayList<>();
		persons.add(
			new Person("Mimi Musterfrau",
				new Date(1999, 2, 1),
				new CoronaTest[] {
						new AntigenTest(new Date(2021, 1, 1), false),
						new PcrTest(new Date(2021, 2, 1), true),
						new AntigenTest(new Date(2021, 2, 3), false),
						new AntigenTest(new Date(2021, 2, 16), false), }));

		persons.add(
			new Person("Max Mustermann",
				new Date(1970, 6, 10),
				new CoronaTest[] {
						new AntigenTest(new Date(2021, 1, 1), false),
						new AntigenTest(new Date(2021, 2, 1), false),
						new AntigenTest(new Date(2021, 2, 3), false),
						new AntigenTest(new Date(2021, 3, 1), true), }));

		persons.add(
			new Person("Marla Mustermann",
				new Date(1985, 11, 7),
				new CoronaTest[] {
						new PcrTest(new Date(2021, 1, 1), false),
						new PcrTest(new Date(2021, 2, 1), false),
						new PcrTest(new Date(2021, 3, 1), false), }));

		persons.add(
			new Person("Mark Mustermann",
				new Date(1945, 9, 23),
				new CoronaTest[] {
						new AntigenTest(new Date(2021, 1, 1), false),
						new PcrTest(new Date(2021, 2, 1), true),
						new PcrTest(new Date(2021, 2, 7), true),
						new AntigenTest(new Date(2021, 2, 20), false),
						new PcrTest(new Date(2021, 3, 1), false), }));

		return persons;
	}
}
