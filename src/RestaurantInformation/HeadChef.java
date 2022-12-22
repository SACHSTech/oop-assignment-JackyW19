package RestaurantInformation;

public class HeadChef extends Employee{

    // Instance variable
  private int hours;

  /**
    * Constructor - creates a new Head Chef instance
    * @param fname - the Head Chef's first name
    * @param lname - the Head Chef's last name
    * @param address - the Head Chef's home address
    * @param med - the Head Chef's medical information
    * @param sal - the Head Chef's salary
    * @param theHours - the Head Chef's hours
    */
  public HeadChef(String fname, String lname, String address, String med, int sal, int theHours){
    // Triggers a parent constructor in Employee class
    super(fname, lname, address, med, sal);
    hours = theHours;
  }

  /**
  * Getter method for Head Chef's hours
  * @return Head Chef's hours
  */
  public int getHours(){
    return hours;
  }

  /**
  * String representation of a Head Chef
  * @return all the attributes regarding a Head Chef
  */
  public String toString(){
    System.out.println("--------------------------------------");
    System.out.println("Position: Head Chef");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Home Address: " + getAddress());
    System.out.println("Medical Information: " + getMedical());
    System.out.println("Salary: $" + getSalary());
    System.out.println("Number of Hours Worked: " + hours);
    System.out.println("Number of Dishes Cooked" + hours);
    return "--------------------------------------";
  }
}

