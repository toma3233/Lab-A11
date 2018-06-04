/**
 * 
 * @author Tom Abraham
 * Period #1
 *
 */
	
public class Teacher extends Person{
	private String subject;
	private double salary;
	/**
	   * Constructor
	   * @param myName - teacher's name
	   * @param myAge - teacher's age
	   * @param myGender - teacher's gender
	   * @param sub - teacher's subject
	   * @param sal - teacher's salary
	   */
	public Teacher(String myName, int myAge, String myGender, String sub, double sal){
	   super(myName, myAge, myGender);
	   subject = sub;
	   salary = sal;
	}
	/**
	   * Method to get the teacher's subject
	   * @return - String representing the teacher's subject
	   */
	public String getSubject(){
	   return subject;
	}
	/**
	   * Method to get the teacher's salary
	   * @return - double representing the teacher's salary
	   */
	public double getSalary(){
	   return salary;
	}
	 /**
	   * Method to set the teacher's subject
	   * @param sub - String representing the teacher's subject
	   */
	public void setSubject(String sub){
	   subject = sub;
	}
	 /**
	   * Method to set the teacher's salary
	   * @param sal - double representing the teacher's salary
	   */
	public void setSalary(double sal){
	   salary = sal;
	}
	
	 /**
   * Method to create a string with the teacher's information
   * @return string with the teacher's information
   */
	public String toString(){
	   return super.toString() + ", subject: " + subject + ", salary: " + salary;
	}

}
