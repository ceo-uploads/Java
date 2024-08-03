//importing Scanner
import java.util.Scanner;

class Branching {
  public static void main(String[] args) {
    //instances..
    int number;

    //creating Scanner object..
    Scanner input = new Scanner(System.in);

    //Taking input from user..
    System.out.print("Enter a Number: ");
    number = input.nextInt();

    //we have put a if statement to check the number is either positive, negative or zero..
    if (number < 0) {
      //if the number is less than zero..
      System.out.println("The Number is Negative..");
    } else if (number > 0) {
      //if the number is greater thsn zero..
      System.out.println("The Number is Positive..");
    } else {
      //if the number is equal to zero..
      System.out.println("It is Zero..");
    }
  }
}
