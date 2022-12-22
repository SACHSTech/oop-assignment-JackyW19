package RestaurantInformation;

import java.io.*;
import java.util.ArrayList;

import org.hamcrest.core.Is;

public class Main {
     public static void main(String[] args) throws IOException{

    // Initialize objects
    CEO Phineas;
    Manager Ferb;
    Manager Heinz;
    Cashier Candace;
    Cashier Linda;
    Chef Baljeet;
    Chef Perry;
    Waitress Vanessa;
    Waitress Isabella;
    
    // Initialize variables
    String choice = "0";
    String username;
    String password;
    int totalPayroll;

		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Starting interface that asks for a username and password
    System.out.println(" ");
    System.out.println("Welcome to the American Restaurant Information System");
    System.out.println("Please enter your username (First Name) and password (Last Name)");
    System.out.print("Username: ");
    username = keyboard.readLine();
    System.out.print("Password: ");
    password = keyboard.readLine();

    if (username.equalsIgnoreCase("Jacky") && password.equalsIgnoreCase("Wang")) {

      // Provides an ID# and states what information the user can access
      System.out.println("\nAcceptable Username and Password...Your secure ID# is 1100");
      System.out.println("Your clearance level grants you access to the private HR information below");
      System.out.println("1 - CEO");
      System.out.println("2 - Manager");
      System.out.println("3 - Cashier");
      System.out.println("4 - Head Chef");
      System.out.println("5 - Chefs");
      System.out.println("6 - Waitresses");
      System.out.println("7 - HR Report");

      System.out.println("Please enter the secure passcode. E.g. 11001 for CEO or 11002 for Managers");

      choice = keyboard.readLine();

    } 
    
    // If the username or password is incorrect, the user must try again from the beginning 
    else if (!username.equalsIgnoreCase("Jacky") && !password.equalsIgnoreCase("Wang")) {
      System.out.println("Incorrect Username/Password. Please try again later.");
      choice = "";
    }

    // Creates existing employees
    Phineas = new CEO("Phineas", "Flynn", "2308 Maple Drive.", "Peanut Allergy", 2000000, 10000);
    Ferb = new Manager("Ferb", "Fletcher", "2308 Maple Drive.", "n/a", 90000, 5500);
    Heinz = new Manager("Heinz", "Doofenshmirtz", "75 Main Street.", "n/a", 90000, 6000);
    Candace = new Cashier("Candace", "Flynn", "2308 Maple Drive.", "Asthma", 70000, 4500);
    Linda = new Cashier("Linda", "Fletcher", "2308 Maple Drive.", "n/a", 70000, 5100);
    Baljeet = new Chef("Baljeet", "Brown", "28 Alvin Street.", "Dog Allergy", 120000, 6500);
    Perry = new Chef("Perry", "Platypus", "30 Platy Avenue", "Seafood Allergy", 120000, 6400);
    Vanessa = new Waitress("Vanessa", "Doofenshmirtz", "75 Main Street", "n/a", 60000, 4500);
    Isabella = new Waitress("Isabella", "Shapiro", "157 Danville Street", 60000, 4600);

    // Creates a Resturant object
    Restaurant theResturant = new Restaurant(Ferb);

    // Adds esisting managers and developers to the arraylist
    theResturant.addManager(Ferb);
    theResturant.addManager(Heinz);
    theResturant.addCashier(Candace);
    theResturant.addCashier(Linda);
    theResturant.addChef(Baljeet);
    theResturant.addChef(Perry);
    theResturant.addWaitress(Vanessa);
    theResturant.addWaitress(Isabella);

    // Allows the user to select any option and as many times as they want
    while (choice.equals("11001") || choice.equals("11002") || choice.equals("11003") || choice.equals("11004") || choice.equals("11005") || choice.equals("11006") || choice.equals("11007")) { 

      // Displays HR information about the CEO
      if (choice.equals("11001")) {
        // Prints out the CEO
        System.out.println(Phineas);
        
        // The user can view other menu options or exit the program
        System.out.println("\nPlease enter the secure passcode or any other key to exit");
        choice = keyboard.readLine();
      } 
      
      // Displays HR information about managers and allows the user to add managers
      if (choice.equals("11002")) {
        // Prints out the current managers
        theResturant.printManagers();          

        System.out.println("Enter 'yes' if you would like to add a new Manager or enter any other key for 'no'");
        String addManager = keyboard.readLine();

        // Allows the user to add as many managers as they want
        while (addManager.equalsIgnoreCase("yes")) {
          System.out.print("First Name: ");
          String fName = keyboard.readLine();

          System.out.print("Last Name: ");
          String lName = keyboard.readLine();

          System.out.print("Home Address: ");
          String address = keyboard.readLine();

          System.out.print("Medical Information: ");
          String medCondition = keyboard.readLine();

          // Creates a new manager with given information and prints out the new developer
          newManager = new Manager(fName, lName, address, medCondition, 90000, hours);
          theResturant.addManager(newManager);
          System.out.println(newManager);

          System.out.println("Enter 'yes' if you would like to add a new Manager or enter any other key for 'no'");
          addManager = keyboard.readLine();
        }

        // The user can view other menu options or exit the program
        System.out.println("\nPlease enter the secure passcode or any other key to exit");
        choice = keyboard.readLine();
      } 
      
      // Displays HR information about developers and allows the user to add developers
      if (choice.equals("11003")) {
        // Prints out the existing developers
        theResturant.printDevs();          

        // Asks the user if they would like to add another developer
        System.out.println("Enter 'yes' if you would like to add a new Developer or enter any other key for 'no'");
        String addDev = keyboard.readLine();

        // Allows the user to create another developer
        while (addDev.equalsIgnoreCase("yes")) {
          System.out.print("First Name: ");
          String fName = keyboard.readLine();

          System.out.print("Last Name: ");
          String lName = keyboard.readLine();

          System.out.print("Home Address: ");
          String address = keyboard.readLine();

          System.out.print("Medical Information: ");
          String medCondition = keyboard.readLine();

          System.out.print("Number of Working Hours (per week): ");
          int hours = Integer.parseInt(keyboard.readLine());

          // Creates a new developer with given information and prints out the new developer
          newDev = new Developer(fName, lName, address, medCondition, 90000, hours);
          theResturant.addDeveloper(newDev);
          System.out.println(newDev);

          System.out.println("Enter 'yes' if you would like to add a new Developer or enter any other key for 'no'");
          addDev = keyboard.readLine();
        }

        // The user can view other menu options or exit the program
        System.out.println("\nPlease enter the secure passcode or any other key to exit");
        choice = keyboard.readLine();
      }

      // Allows the user to view the HR summary report
      if (choice.equals("11004")) {

        // Prints out the HR Report
        System.out.println("\nBelow is the HR Overall ResttheResturant Report");

        // States the number of employees for each level
        System.out.println("\nTotal Number of CEOs: 1");
        System.out.println("Total Number of Software Development Managers: " + theResturant.getNumManagers());
        System.out.println("Total Number of Software Developers: " + theResturant.getNumDev());

        // States the payroll for each level
        System.out.println("\nTotal Payroll for CEO: $" + CEO.getCEOPayroll());
        System.out.println("Total Payroll for Software Development Managers: $" + theResturant.getPayrollManager());
        System.out.println("Total Payroll for Software Developers Developers: $" + theResturant.getPayrollDev());

        // States the total payroll for all employees
        totalPayroll = CEO.getCEOPayroll() + theResturant.getPayrollManager() + theResturant.getPayrollDev();
        System.out.println("Total Payroll: $" + totalPayroll);

        // States specific attributes of each level
        System.out.println("\nCEO Bonus Pay: $" + SpongeBob.getCEOBonus());
        System.out.println("\nSoftware Developer Working Hours (per week)");
        theResturant.printDevHours();
        System.out.println("\nSoftware Development Manager Current Projects");
        theResturant.printManagerProject();

        // The user can view other menu options or exit the program
        System.out.println("\nPlease enter the secure passcode or any other key to exit");
        choice = keyboard.readLine();

      }

    }

  }
}