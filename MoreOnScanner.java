//imports.
import java.util.Scanner;

class MoreOnScanner {
  public static void main(String[] args) {
    //instances..
    String name;
    int id;
    int batch;
    String Dept;
    double cgpa;

    //Scanner object - input..
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Your Name: ");
    name = input.next();
    //taking char only..
    System.out.print("Enter Your ID: ");
    id = input.nextInt();
    //taking Integer..
    System.out.print("Enter Your Batch: ");
    batch = input.nextInt();
    //taking Integer..
    System.out.print("Enter Your Department: ");
    Dept = input.nextLine();
    //taking tha hole String as line...
    System.out.print("Enter Your CGPA: ");
    cgpa = input.nextDouble();
    //taking floating variable as Double..

    //printing inputs..
    System.out.println("You Entered- ");
    System.out.println("Name: "+name);
    System.out.println("ID: "+id);
    System.out.println("Batch: "+batch);
    System.out.println("DEpartment: "+department);
    System.out.println("CGPA: "+cgpa);
  }
}
