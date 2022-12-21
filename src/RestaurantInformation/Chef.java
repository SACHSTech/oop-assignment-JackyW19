package RestaurantInformation;

public class Chef extends Employee{
  // Instance variable
  private int hours;

  /**
    * Constructor - creates a new Chef instance
    * @param fname - the Chef's first name
    * @param lname - the Chef's last name
    * @param address - the Chef's home address
    * @param med - the Chef's medical information
    * @param sal - the Chef's salary
    * @param theHours - the Chef's hours
    */
  public Chef(String fname, String lname, String address, String med, int sal, int theHours){
    // Triggers a parent constructor in Employee class
    super(fname, lname, address, med, sal);
    hours = theHours;
  }

  /**
  * Getter method for Chef's hours
  * @return Chef's hours
  */
  public int getHours(){
    return hours;
  }

  /**
  * String representation of a Chef
  * @return all the attributes regarding a Chef
  */
  public String toString(){
    System.out.println("--------------------------------------");
    System.out.println("Position: Chef");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Home Address: " + getAddress());
    System.out.println("Medical Information: " + getMedical());
    System.out.println("Salary: $" + getSalary());
    System.out.println("Number of Hours Worked: " + hours);
    return "--------------------------------------";
  }
}
