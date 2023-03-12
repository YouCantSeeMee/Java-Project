import java.util.Scanner;

public class ACServiceManagementSystem {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int choice;
    
    do {
      System.out.println("AC Service Management System Menu:");
      System.out.println("1. Add new customer");
      System.out.println("2. Add new AC unit");
      System.out.println("3. View customer list");
      System.out.println("4. View AC unit list");
      System.out.println("5. Schedule AC service");
      System.out.println("6. View service schedule");
      System.out.println("7. Exit");
      
      System.out.print("Enter your choice (1-7): ");
      choice = input.nextInt();
      
      switch(choice) {
        case 1:
          addCustomer();
          break;
        case 2:
          addACUnit();
          break;
        case 3:
          viewCustomerList();
          break;
        case 4:
          viewACUnitList();
          break;
        case 5:
          scheduleACService();
          break;
        case 6:
          viewServiceSchedule();
          break;
        case 7:
          System.out.println("Exiting AC Service Management System. Thank you!");
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
          break;
      }
      
    } while (choice != 7);
    
    input.close();
  }
  
  private static void addCustomer() {
    // code to add a new customer
  }
  
  private static void addACUnit() {
    // code to add a new AC unit
  }
  
  private static void viewCustomerList() {
    // code to view the list of customers
  }
  
  private static void viewACUnitList() {
    // code to view the AC units List
  }
  
  private static void scheduleACService() {
    // code to schedule an AC service
  }
  
  private static void viewServiceSchedule() {
    // code to view the service schedule
  }
  
}
