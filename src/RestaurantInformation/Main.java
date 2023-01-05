package RestaurantInformation;

import java.io.*;

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
    Waitress Jeremy;
    
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
      System.out.println("\nUsername and Password Accepted... Your secure ID# is 1000.");
      System.out.println("Your clearance level grants you access to the private information below.");
      System.out.println("1 - CEO");
      System.out.println("2 - Managers");
      System.out.println("3 - Cashiers");
      System.out.println("4 - Chefs");
      System.out.println("5 - Waitresses");
      System.out.println("6 - Summary Report");

      System.out.println("Please enter the secure passcode. E.g. 1001 for CEO or 1002 for Managers.");

      choice = keyboard.readLine();

    } 
    
    // If the username or password is incorrect, the user must try again from the beginning 
    else if (!username.equalsIgnoreCase("Jacky") && !password.equalsIgnoreCase("Wang")) {
      System.out.println("Incorrect Username/Password. Please try again later.");
      choice = "";
    }

    // Creates existing employees
    Phineas = new CEO("Phineas", "Flynn", "2308 Maple Drive.", "Peanut Allergy", 200000, 10000);
    Ferb = new Manager("Ferb", "Fletcher", "2308 Maple Drive.", "n/a", 90000, 66);
    Heinz = new Manager("Heinz", "Doofenshmirtz", "75 Main Street.", "n/a", 90000, 67);
    Candace = new Cashier("Candace", "Flynn", "2308 Maple Drive.", "Asthma", 70000, 60);
    Linda = new Cashier("Linda", "Fletcher", "2308 Maple Drive.", "n/a", 70000, 58);
    Baljeet = new Chef("Baljeet", "Brown", "28 Alvin Street.", "Dog Allergy", 120000, 62);
    Perry = new Chef("Perry", "Platypus", "30 Platy Avenue", "Seafood Allergy", 120000, 63);
    Vanessa = new Waitress("Vanessa", "Doofenshmirtz", "75 Main Street", "n/a", 60000, 57, 2700);
    Isabella = new Waitress("Isabella", "Shapiro", "157 Danville Street", "Peanut Allergy", 60000, 56, 2600);
    Jeremy = new Waitress("Jeremy", "Johnson", "28 Macdonald Street", "Asthma", 60000, 58, 2850);
    // Creates a Resturant object
    Restaurant theResturant = new Restaurant(Phineas);

    // Adds esisting managers and developers to the arraylist
    theResturant.addManager(Ferb);
    theResturant.addManager(Heinz);
    theResturant.addCashier(Candace);
    theResturant.addCashier(Linda);
    theResturant.addChef(Baljeet);
    theResturant.addChef(Perry);
    theResturant.addWaitress(Vanessa);
    theResturant.addWaitress(Isabella);
    theResturant.addWaitress(Jeremy);

    // Allows the user to select any option and as many times as they want
    while (choice.equals("1001") || choice.equals("1002") || choice.equals("1003") || choice.equals("1004") || choice.equals("1005") || choice.equals("1006")) { 

      // Displays information about the CEO
      if (choice.equals("1001")) {
        // Prints out the CEO
        System.out.println(Phineas);
        
        // The user can view other menu options or exit the program
        System.out.println("\nPlease enter the secure passcode or any other key to exit");
        choice = keyboard.readLine();
      } 
      
    // Displays information about managers and allows the user to add managers
    if (choice.equals("1002")) {
      // Prints out the existing managers
      theResturant.printManagers();          

      // Asks the user if they would like to add another manager
      System.out.println("Enter 'yes' if you would like to add a new manager or enter any other key for 'no'");
      String addCashier = keyboard.readLine();

      // Allows the user to create another manager
      while (addCashier.equalsIgnoreCase("yes")) {
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

        // Creates a new Manager with given information and prints out the new Manager
        Manager newManager = new Manager(fName, lName, address, medCondition, 70000, hours);
        theResturant.addManager(newManager);
        System.out.println(newManager);

        System.out.println("Enter 'yes' if you would like to add a new Manager or enter any other key for 'no'");
        addCashier = keyboard.readLine();
      }

      // The user can view other menu options or exit the program
      System.out.println("\nPlease enter the secure passcode or any other key to exit");
      choice = keyboard.readLine();
    }
      
      // Displays information about cashiers and allows the user to add cashiers
      if (choice.equals("1003")) {
        // Prints out the existing cashiers
        theResturant.printCashiers();          

        // Asks the user if they would like to add another cashier
        System.out.println("Enter 'yes' if you would like to add a new cashier or enter any other key for 'no'");
        String addCashier = keyboard.readLine();

        // Allows the user to create another cashier
        while (addCashier.equalsIgnoreCase("yes")) {
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

          // Creates a new Cashier with given information and prints out the new Cashier
          Cashier newCashier = new Cashier(fName, lName, address, medCondition, 70000, hours);
          theResturant.addCashier(newCashier);
          System.out.println(newCashier);

          System.out.println("Enter 'yes' if you would like to add a new Cashier or enter any other key for 'no'");
          addCashier = keyboard.readLine();
        }

        // The user can view other menu options or exit the program
        System.out.println("\nPlease enter the secure passcode or any other key to exit");
        choice = keyboard.readLine();
      }

       // Displays information about chefs and allows the user to add chefs
       if (choice.equals("1004")) {
        // Prints out the existing chefs
        theResturant.printChefs();          

        // Asks the user if they would like to add another chef
        System.out.println("Enter 'yes' if you would like to add a new chef or enter any other key for 'no'");
        String addChef = keyboard.readLine();

        // Allows the user to create another chef
        while (addChef.equalsIgnoreCase("yes")) {
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

          // Creates a new Chef with given information and prints out the new Chef
          Chef newChef = new Chef(fName, lName, address, medCondition, 120000, hours);
          theResturant.addChef (newChef);
          System.out.println(newChef);

          System.out.println("Enter 'yes' if you would like to add a new Chef or enter any other key for 'no'");
          addChef = keyboard.readLine();
        }

        // The user can view other menu options or exit the program
        System.out.println("\nPlease enter the secure passcode or any other key to exit");
        choice = keyboard.readLine();
      }

       // Displays information about waitresses and allows the user to add waitresses
       if (choice.equals("1005")) {
        // Prints out the existing waitresses
        theResturant.printWaitresses();       

        // Asks the user if they would like to add another waitress
        System.out.println("Enter 'yes' if you would like to add a new waitress or enter any other key for 'no'");
        String addWaitress = keyboard.readLine();

        // Allows the user to create another waitresss
        while (addWaitress.equalsIgnoreCase("yes")) {
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

          System.out.print("Amount of Tips (per week): ");
          int tips = Integer.parseInt(keyboard.readLine());

          // Creates a new waitress with given information and prints out the new waitress
          Waitress newWaitress = new Waitress(fName, lName, address, medCondition, 60000, hours, tips);
          theResturant.addWaitress(newWaitress);
          System.out.println(newWaitress);

          System.out.println("Enter 'yes' if you would like to add a new waitress or enter any other key for 'no'");
          addWaitress = keyboard.readLine();
        }

        // The user can view other menu options or exit the program
        System.out.println("\nPlease enter the secure passcode or any other key to exit");
        choice = keyboard.readLine();
      }

      // Allows the user to view the summary report
      if (choice.equals("1006")) {

        // Prints out the Report
        System.out.println("\nBelow is the Overall report of the Restaurant");

        // States the number of employees for each level
        System.out.println("\nTotal Number of CEOs: 1");
        System.out.println("Total Number of Managers: " + theResturant.getNumManagers());
        System.out.println("Total Number of Cashiers: " + theResturant.getNumCashiers());
        System.out.println("Total Number of Chef: " + theResturant.getNumChefs());
        System.out.println("Total Number of Waitresses: " + theResturant.getNumWaitresses());

        // States the payroll for each level
        System.out.println("\nTotal Payroll for CEO: $" + CEO.getCEOPayroll());
        System.out.println("Total Payroll for Managers: $" + theResturant.getManagerPayroll());
        System.out.println("Total Payroll for Cashiers: $" + theResturant.getCashierPayroll());
        System.out.println("Total Payroll for Chefs: $" + theResturant.getChefPayroll());
        System.out.println("Total Payroll for Waitresses: $" + theResturant.getWaitressPayroll());

        // States the total payroll for all employees
        totalPayroll = CEO.getCEOPayroll() + theResturant.getManagerPayroll() + theResturant.getCashierPayroll() + theResturant.getChefPayroll() + theResturant.getWaitressPayroll();
        System.out.println("Total Payroll: $" + totalPayroll);

        // States specific attributes of each level
        System.out.println("\nCEO Bonus Pay: $" + Phineas.getCEOBonus());
        System.out.println("\nManager Working Hours (per week)");
        theResturant.printManagerHours();
        System.out.println("\nCashier Working Hours (per week)");
        theResturant.printCashierHours();
        System.out.println("\nChef Working Hours (per week)");
        theResturant.printChefHours();
        System.out.println("\nWaitress Working Hours (per week)");
        theResturant.printWaitressHours();
        System.out.println("\nWaitress Tips (per week)");
        theResturant.printWaitressTips();

        // The user can view other menu options or exit the program
        System.out.println("\nPlease enter the secure passcode or any other key to exit");
        choice = keyboard.readLine();

      }

    }

  }
}