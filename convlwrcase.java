import java.util.Scanner;
public class convlwrcase{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String text;
        text=sc.nextLine();

        System.out.printf("Entered text is : %s\n",text);

        System.out.println(text.toLowerCase());
    }
}
