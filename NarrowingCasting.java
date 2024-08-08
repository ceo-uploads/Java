class NarrowingCasting;
// class defination..
  public static void mian(String[] args) {   // main function...
    double myDouble = 9.4888d; // instance

    int myNum = (int) myDouble; // Manual Casting: Double ->> int..

    System.out.println("Number Before Manual Casting: "+myDouble); // it will print 9.4888 ...
    System.out.println("Number After Manual Casting: "+myNum); // it will print only 9 ....
  } 
