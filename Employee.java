/**
 * Simulates an hourly employee of a grocery store
 * @author Tom Abraham
 * period  1
 *
 */
public  class Employee {
	private String name;
	/**
	 * Assigns the parameter name to the instance variable name
	 * @param name - String is the name of the employee
	 */
	public Employee(String name) {
		this.name = name;
	}
	/**
	 * This method is used to return the name of the employee
	 * @return name - name of the employee that is returned a String
	 */
	public String getName() {
		return name;
	}
}
