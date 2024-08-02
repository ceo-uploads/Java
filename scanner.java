//imports...
import java.util.Scanner;

class scanner {
  public static void main(String[] args) {
    //instances..
    int number;
    //Creating an Scanner object named input...
    Scanner input = new Scanner(System.in);

    //taking input using Scanner..
    System.out.print("Enter a Number: ");
    number = input.nextInt();

    //Printing input using Scanner...
    System.out.println("You Entered: "+number);
  }
}
