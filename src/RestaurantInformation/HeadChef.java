package RestaurantInformation;

public class HeadChef extends Employee{
    // Instance variable
  private int bonusPay;

  // Class variable
  private static int headChefPayroll = 0;

  /**
    * Constructor - creates a new HeadChef instance
    * @param fname - the HeadChef's first name
    * @param lname - the HeadChef's last name
    * @param address - the HeadChef's home address
    * @param med - the HeadChef's medical information
    * @param sal - the HeadChef's salary
    * @param bonus - the HeadChef's bonus
    */

  public HeadChef(String fname, String lname, String address, String med, int sal, int bonus){
    // Triggers a parent constructor in Employee class
    super(fname, lname, address, med, sal);
    bonusPay = bonus;

    // Calculates the total payroll for the HeadChef
    headChefPayroll = sal + bonus;
  }

  /**
  * Getter method for HeadChef's payroll
  * @return HeadChef's payroll
  */
  public static int getHeadChefPayroll(){
    return headChefPayroll;
  }

  /**
  * Getter method for HeadChef's bonus
  * @return HeadChef's bonus
  */
  public int getHeadChefBonus(){
    return bonusPay;
  }

  /**
  * String representation of a Head Chef
  * @return all the attributes regarding a Head Chef
  */
  public String toString(){
    System.out.println("--------------------------------------");
    System.out.println("Position: HeadChef");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Home Address: " + getAddress());
    System.out.println("Medical Information: " + getMedical());
    System.out.println("Salary: $" + getSalary());
    System.out.println("Bonus: $" + bonusPay);
    return "--------------------------------------";
  }
}
