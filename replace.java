import java.util.Scanner;
public class replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    System.out.printf("Eneter the text :");
    String text;

    text=sc.nextLine();

    System.out.printf("Text after changing : %s",text.replace(" ", "_"));
    }
    
}
