import java.util.Scanner;
public class find {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int ar[]={1,4,5,8,4,2,4,5,6,4,3,3,4,6,6,7,78,9,00,87,6,4,33,2,3,434,5,3,456,467,7,567,7,67,6,7,755,64,5,3,4};

        System.out.printf("Enter the number you want to find :");
        int num=sc.nextInt();
        int c=1;
        for(int i=0;i<ar.length;i=i+1)
        {
            if(ar[i]==num){
                System.out.println("The given number is found in database ");
                  c=0;
                break;
            }
           
            
        }
 
        if(c==1){
            System.out.println("The give number is not found in database");
        }  
              System.out.println("Thank you :)");
    }
}
