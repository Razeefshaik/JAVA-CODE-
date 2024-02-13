public class immutability {
    public static void main(String [] args){
        char []a=new char[5];
        char []b=new char[5];

        a[0]='d';
        b[0]='d';
       // System.out.println(b[0]);
        a[0]='f';
       // System.out.println(b[0]);

       String c="";
       c=c+'a';
       System.out.println(c);
    }
}
