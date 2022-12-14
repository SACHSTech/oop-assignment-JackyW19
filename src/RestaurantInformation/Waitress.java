package RestaurantInformation;

public class Waitress extends Employee{

// Instance variable
  private int hours;
  private int tips;


  /**
    * Constructor - creates a new Waitress instance
    * @param fname - the Waitress's first name
    * @param lname - the Waitress's last name
    * @param address - the Waitress's home address
    * @param med - the Waitress's medical information
    * @param sal - the Waitress's salary
    * @param theHours - the Waitress's hours
    * @param theTips - the Waitress's tips
    */
  public Waitress(String fname, String lname, String address, String med, int sal, int theHours, int theTips){
    // Triggers a parent constructor in Employee class
    super(fname, lname, address, med, sal);
    hours = theHours;
    tips = theTips;
  }

  /**
  * Getter method for Waitress's hours
  * @return Waitress's hours
  */
  public int getHours(){
    return hours;
  }

  /**
  * Getter method for Waitress's tips
  * @return Waitress's tips
  */
  public int getTips(){
    return tips;
  }


  /**
  * String representation of a Waitress
  * @return all the attributes regarding a Waitress
  */
  public String toString(){
    System.out.println("--------------------------------------");
    System.out.println("Position: Waitress");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Home Address: " + getAddress());
    System.out.println("Medical Information: " + getMedical());
    System.out.println("Salary: $" + getSalary());
    System.out.println("Number of Hours Worked: " + hours);
    System.out.println("Amount of Tips: " + tips);
    return "--------------------------------------";
  }
}
