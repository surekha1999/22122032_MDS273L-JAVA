import java.util.Scanner;


public class lab1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
//Taking name input
    System.out.print("Enter name: ");
    String name = input.nextLine();
//Taking Age input
    System.out.print("Enter age: ");
    int age = input.nextInt();
//Taking Gender Input
    System.out.print("Enter gender (m/f): ");
    input.nextLine();
    char gender = input.nextLine().charAt(0);
//Taking State input
    System.out.print("Enter state: ");
    String state = input.nextLine();
//Company Details input
    System.out.print("Enter company: ");
    String company = input.nextLine();
//Employee Details Print
    System.out.println("\nEmployee Details:");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
//Match Gender and Print string accordingly
    if (gender == 'm') {
      System.out.println("Gender: MALE");
    } else if (gender == 'f') {
      System.out.println("Gender: FEMALE");
    }
//Match State names and print where the employee must work accordingly
    if (state.equalsIgnoreCase("Andhra Pradesh") || 
        state.equalsIgnoreCase("Karnataka") ||
        state.equalsIgnoreCase("Kerala") ||
        state.equalsIgnoreCase("Tamil Nadu")) {
      System.out.print("The Employee is from the southern states of India; Preferable work location is in " + state);
    }
    if (state.equalsIgnoreCase("Jammu & Kashmir") || 
        state.equalsIgnoreCase("Delhi") ||
        state.equalsIgnoreCase("Himachal Pradesh") ||
        state.equalsIgnoreCase("Punjab")||
        state.equalsIgnoreCase("Uttarakhand")||
        state.equalsIgnoreCase("Haryana")||
        state.equalsIgnoreCase("Rajasthan")||
        state.equalsIgnoreCase("Uttar Pradesh")) {
      System.out.print("The Employee is from the northern states of India; Preferable work location is in " + state);
    }

    if (company.equalsIgnoreCase("Facebook") || 
        company.equalsIgnoreCase("Google") ||
        company.equalsIgnoreCase("Microsoft") ||
        company.equalsIgnoreCase("Samsung") ||
        company.equalsIgnoreCase("IBM") ||
        company.equalsIgnoreCase("Apple")) {
      System.out.println("The employee is working in Top MNC Companies");
    }
  }
}
	
