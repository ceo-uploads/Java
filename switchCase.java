class switchCase {
  public static void main(String[] args) {
    // instances..
    int result = 2;

    // branching - Switch/case...
    switch (result) {
      case 1:
        System.out.println("It's low");
        break;
      case 2:
        System.out.println("It's normal");
        break;
      case 3:
        System.out.println("It's hard");
        break;
      default:
        System.out.println("Error");
        break;
    }
  }
}
