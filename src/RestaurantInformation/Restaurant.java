package RestaurantInformation;

import java.util.ArrayList;


public class Restaurant {

  // Instance Variables
  private CEO CEO;
  private ArrayList<Cashier> cashiers;
  private ArrayList<Manager> managers;
  private ArrayList<Chef> chefs;
  private ArrayList<Waitress> waitresses;

  /**
    * Constructor - creates a new company instance
    * @param theCEO - the CEO
    */
  public Restaurant(CEO theCEO){
    CEO = theCEO;
    // Initializes the staff lists
    cashiers = new ArrayList<Cashier>();
    managers = new ArrayList<Manager>();
    chefs = new ArrayList<Chef>();
    waitresses = new ArrayList<Waitress>();
  }

  /**
  * Method allows for the adding of a cashier
  * @return void
  */
  public void addcashier(Cashier newCashier){
    cashiers.add(newCashier);
  }

  /**
  * Method allows for the adding of a manager
  * @return void
  */
  public void addManager(Manager newManager){
    managers.add(newManager);
  }

/**
  * Method allows for the adding of a chef
  * @return void
  */
  public void addChef(Chef newChef){
    chefs.add(newChef);
  }

/**
  * Method allows for the adding of a waitress
  * @return void
  */
  public void addWaitress(Waitress newWaitress){
    waitresses.add(newWaitress);
  }
  
  
  /**
  * Method allows for getting number of cashiers
  * @return number of staff
  */
  public int getNumCashiers(){
    return cashiers.size();
  }

  /**
  * Method allows for getting number of managers
  * @return number of cashiers
  */
  public int getNumManagers(){
    return managers.size();
  }

   /**
  * Method allows for getting number of managers
  * @return number of cashiers
  */
  public int getNumChefs(){
    return chefs.size();
  }

   /**
  * Method allows for getting number of 
  * @return number of cashiers
  */
  public int getNumWaitresses(){
    return waitresses.size();
  }


  /**
  * Method allows for getting the total cashier payroll
  * @return total payroll for cashiers
  */
  public int getCashierPayroll(){
    int totalPayroll = 0;
    for(int i = 0; i < getNumCashiers(); i++){
      totalPayroll = totalPayroll + cashiers.get(i).getSalary();
    }
    return totalPayroll;
  }

  /**
  * Method allows for getting the total manager payroll
  * @return total payroll for managers
  */
  public int getManagerPayroll(){
    int totalPayroll = 0;
    for(int i = 0; i < getNumManagers(); i++){
      totalPayroll = totalPayroll + managers.get(i).getSalary();
    }
    return totalPayroll;
  }

  /**
  * Method allows for getting the total chef payroll
  * @return total payroll for chefs
  */
  public int getChefPayroll(){
    int totalPayroll = 0;
    for(int i = 0; i < getNumChefs(); i++){
      totalPayroll = totalPayroll + chefs.get(i).getSalary();
    }
    return totalPayroll;
  }

  /**
  * Method allows for getting the total waitress payroll
  * @return total payroll for waitresses
  */
  public int getWaitressPayroll(){
    int totalPayroll = 0;
    for(int i = 0; i < getNumWaitresses(); i++){
      totalPayroll = totalPayroll + waitresses.get(i).getSalary();
    }
    return totalPayroll;
  }

  /**
  * Method allows for the printing out of all the managers
  * @return void
  */
  public void printManagers(){
    for (int i = 0; i < getNumManagers(); i++) {
      System.out.println(managers.get(i));
    }
  }

  /**
  * Method allows for the printing out of all the waitresses
  * @return void
  */
  public void printWaitresses(){
    for (int i = 0; i < getNumWaitresses(); i++) {
      System.out.println(waitresses.get(i));
    }
  }

  /**
  * Method allows for the printing out of all the cashiers
  * @return void
  */
  public void printCashiers(){
    for (int i = 0; i < getNumCashiers(); i++) {
      System.out.println(cashiers.get(i));
    }
  }

  /**
  * Method allows for the printing out of all the chefs
  * @return void
  */
  public void printChefs(){
    for (int i = 0; i < getNumChefs(); i++) {
      System.out.println(chefs.get(i));
    }
  }

  /**
  * Method allows for the printing out of all the cashiers' hours
  * @return void
  */
  public void printCashierHours(){
    for (int i = 0; i < getNumCashiers(); i++) {
      System.out.println(cashiers.get(i).getFirstName() + " " + cashiers.get(i).getLastName() + ": " + cashiers.get(i).getHours());
    }
  }

  /**
  * Method allows for the printing out of all the chefs hours
  * @return void
  */
  public void printChefHours(){
    for (int i = 0; i < getNumChefs(); i++) {
      System.out.println(chefs.get(i).getFirstName() + " " + chefs.get(i).getLastName() + ": " + chefs.get(i).getHours());
    }
  }

  /**
  * Method allows for the printing out of all the managers hours
  * @return void
  */
  public void printManagerHours(){
    for (int i = 0; i < getNumManagers(); i++) {
      System.out.println(managers.get(i).getFirstName() + " " + managers.get(i).getLastName() + ": " + managers.get(i).getHours());
    }
  }

  /**
  * Method allows for the printing out of all the waitresses hours
  * @return void
  */
  public void printWaitressHours(){
    for (int i = 0; i < getNumWaitresses(); i++) {
      System.out.println(waitresses.get(i).getFirstName() + " " + waitresses.get(i).getLastName() + ": " + waitresses.get(i).getHours());
    }
  }

  
  }