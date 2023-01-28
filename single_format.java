
import java.util.Scanner;

public class single_format {

    public static void main(String[] args) {

        System.out.println("Enter the single format");
        Scanner sc=new Scanner(System.in);

        String first_name=sc.next();
        String second_name=sc.next();
        int roll_number=sc.nextInt();
        String field_of_interest =sc.next();

        System.out.println("Name:"+first_name+" "+second_name);

//        System.out.println(second_name);
        System.out.println("Roll number:"+roll_number);

        System.out.println("Field of interest:"+field_of_interest);

    }
}
