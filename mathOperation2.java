// utility imports...
import java.util.Scanner;
class mathOperation2{
  public static void main(String[] args) {
    // Scanner object...
    Scanner input = new Scanner(System.in);
    // Taking inputs...
    System.out.println("Enter two number: ");
    // input section
    int a = input.nextint();
    int b = input.nextInt();
    // math operation to verify the minimum number...
    int minimum = (int) (Math.min(a,b));
    // displaying output...
    System.out.println("The minimum number is: " +minimum); 

    input.close(); // if doesn't,, the resource will be leaked..
}
