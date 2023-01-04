package RestaurantInformation;

public class Manager extends Employee{
    // Instance variable
  private int hours;

  /**
    * Constructor - creates a new Manager instance
    * @param fname - the Manager's first name
    * @param lname - the Manager's last name
    * @param address - the Manager's home address
    * @param med - the Manager's medical information
    * @param sal - the Manager's salary
    */
  public Manager(String fname, String lname, String address, String med, int sal, int theHours){
    // Triggers a parent constructor in Employee class
    super(fname, lname, address, med, sal);
    hours = theHours;
  }


  /**
  * Getter method for Manager's hours
  * @return Manager's hours
  */
  public int getHours(){
    return hours;
  }

  /**
  * String representation of a Manager
  * @return all the attributes regarding a Manager
  */
  public String toString(){
    System.out.println("--------------------------------------");
    System.out.println("Position: Manager");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Home Address: " + getAddress());
    System.out.println("Medical Information: " + getMedical());
    System.out.println("Salary: $" + getSalary());
    System.out.println("Number of Hours Worked: " + hours);
    return "--------------------------------------";
  }

}

