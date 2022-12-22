package RestaurantInformation;

import java.io.*;
import java.util.ArrayList;

import com.apple.laf.resources.aqua;


public class Restaurant {

  // Instance Variables
  private CEO ceo;
  private HeadChef headChef;
  private ArrayList<Cashier> cashiers;
  private ArrayList<Manager> managers;
  private ArrayList<Chef> chefs;
  private ArrayList<Waitress> waitresses;

  /**
    * Constructor - creates a new company instance
    * @param theCEO - the CEO
    */
  public Restaurant(CEO theCEO){
    ceo = theCEO;
    // Initializes the staff lists
    headChef =
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
  * @return number of cashiers
  */
  public int getNumCas(){
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
  * Method allows for getting the total cashier payroll
  * @return total payroll for cashiers
  */
  public int getPayrollDev(){
    int totalPayroll = 0;
    for(int i = 0; i < getNumDev(); i++){
      totalPayroll = totalPayroll + cashiers.get(i).getSalary();
    }
    return totalPayroll;
  }

  /**
  * Method allows for getting the total manager payroll
  * @return total payroll for managers
  */
  public int getPayrollManager(){
    int totalPayroll = 0;
    for(int i = 0; i < getNumManagers(); i++){
      totalPayroll = totalPayroll + managers.get(i).getSalary();
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
  * Method allows for the printing out of all the cashiers
  * @return void
  */
  public void printDevs(){
    for (int i = 0; i < getNumDev(); i++) {
      System.out.println(cashiers.get(i));
    }
  }

  /**
  * Method allows for the printing out of all the cashiers' hours
  * @return void
  */
  public void printDevHours(){
    for (int i = 0; i < getNumDev(); i++) {
      System.out.println(cashiers.get(i).getFirstName() + " " + cashiers.get(i).getLastName() + ": " + cashiers.get(i).getHours());
    }
  }

  /**
  * Method allows for the printing out of all the managers' current projects
  * @return void
  */
  public void printManagerProject(){
    for (int i = 0; i < getNumManagers(); i++) {
      System.out.println(managers.get(i).getFirstName() + " " + managers.get(i).getLastName() + ": " + managers.get(i).getCurrentProject());
    }
  }