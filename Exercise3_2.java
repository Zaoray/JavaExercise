public class Exercise3_2 {
  // public static String[] str = new String[20];

  // public SplitDemo() {
  //   String s = "you are ringht!";
  // }  

  /**Main method*/
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to enter an integer
    System.out.print("Enter an integer: ");
    // int number = input.next();
    String strA = input.next();
    String strB = input.next();
    String strC = input.next();

    double intA = Double.parseDouble(strA);
    double intB = Double.parseDouble(strB);
    double intC = Double.parseDouble(strC);

    double value = (intA + intB) * intC;


    // Display results
    System.out.println("input A, B, C is " + intA + "\t" + intB + "\t" +intC);
    System.out.println("value is " + value);
  }
}
