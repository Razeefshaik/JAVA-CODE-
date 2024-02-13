public class variableargs {
  static int sum(int ...ar){
   int sum=0;
    for(int a:ar){
        sum=sum+a;
    }

    return sum;
  }

    public static void main(String[] args) {
        

        System.out.printf("%d",sum(2,4,5,4,3,3));
    }
    
}