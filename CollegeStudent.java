/**
 * 
 * @author Tom Abraham
 * Period #1
 *
 */
	

public class CollegeStudent extends Student {
   private String major;
   private int year;
   
	  /**
	   * Constructor
	   * @param myName - CollegeStudent's name
	   * @param myAge - CollegeStudent's age
	   * @param myGender - CollegeStudent's gender
	   * @param myIdNum - CollegeStudent's ID number
	   * @param myGPA - CollegeStudent's GPA
	   * @param y - CollegeStudent's year
	   * @param m - CollegeStudent's major
	   */
   public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int y, String m){
      super(myName, myAge, myGender, myIdNum, myGPA);
      year = y;
      major = m;
   }
    /**
	   * Method to get the CollegeStudent's year
	   * @return - int representing the CollegeStudent's year
	   */
   public int getYear(){
      return year;
   }
    /**
	   * Method to get the CollegeStudent's major
	   * @return - String representing the CollegeStudent's major
	   */
   public String getMajor(){
      return major;
   }
   /**
	   * Method to set the CollegeStudent's year
	   * @param y - int representing the CollegeStudent's year
	   */
   public void setYear(int y){
      year = y;
   }
    /**
	   * Method to set the CollegeStudent's year
	   * @param m - String representing the CollegeStudent's major
	   */
   public void setMajor(String m){
      major = m;
   }
    /**
   * Method to create a string with the CollegeStudent's information
   * @return string with CollegeStudent's information
   */
   public String toString(){
      return super.toString() + ", year: " + year + ", major: " + major;
   }
   
   }
