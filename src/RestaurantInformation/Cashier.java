package RestaurantInformation;

public class Cashier extends Employee{

// Instance variable
  private int hours;

  /**
    * Constructor - creates a new Cashier instance
    * @param fname - the Cashier's first name
    * @param lname - the Cashier's last name
    * @param address - the Cashier's home address
    * @param med - the Cashier's medical information
    * @param sal - the Cashier's salary
    * @param theHours - the Cashier's hours
    */
  public Cashier(String fname, String lname, String address, String med, int sal, int theHours){
    // Triggers a parent constructor in Employee class
    super(fname, lname, address, med, sal);
    hours = theHours;
  }

  /**
  * Getter method for Cashier's hours
  * @return Cashier's hours
  */
  public int getHours(){
    return hours;
  }

  /**
  * String representation of a Cashier
  * @return all the attributes regarding a Cashier
  */
  public String toString(){
    System.out.println("--------------------------------------");
    System.out.println("Position: Cashier");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Home Address: " + getAddress());
    System.out.println("Medical Information: " + getMedical());
    System.out.println("Salary: $" + getSalary());
    System.out.println("Number of Hours Worked: " + hours);
    return "--------------------------------------";
  }
}
