
import java.util.Scanner;
public class concatenate_two_string {

    public static void main(String[] args) {

        System.out.println("Enter the Strings");
        Scanner s=new Scanner(System.in);

//      String str1=s.next();
//       String str2=s.next();
//        String str3=s.next();
//        String str4=s.next();
//       String str5=s.next();
//       String str6=s.next();
//        String str7=s.next();
//        String str8=s.next();
//
//       System.out.println(str1+str2);
//      System.out.println(str3+str4);
//        System.out.println(str5+str6);
//          System.out.println(str7+str8);

        while(s.hasNextLine()){

            String a=s.next();
            String b=s.next();
           System.out.println(a+b);
       }
    }
}
