import java.util.Scanner;

public class printf {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String name;

     name=sc.nextLine();

     System.out.printf("Entered text is %s",name);
  }
    
}