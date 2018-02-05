/*public class Exercise4_14 {
  public static void main(String[] args) {
    int count = 1;
    for (int i = '!'; i < '~'; i++) {
      System.out.print((count++ % 10 != 0) ? (char)i + " " :
        (char)i + "\n");
    }
  }
}*/
// pratice code by zhaoshulei
public class Exercise4_14 {
	public static void main(String[] args) {
		int count = 1;
		for (int i = '!'; i <= '~'; i++) {
			
			if (count++ % 10 == 0) {
				System.out.print((char)i + "\n");
			}
			else {
				System.out.print((char)i + " ");
			}
			
		}
	}
}