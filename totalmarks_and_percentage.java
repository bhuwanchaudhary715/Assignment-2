
import java.sql.SQLOutput;
import java.util.Scanner;

public class totalmarks_and_percentage {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("enter the value of math");
        float m=s.nextFloat();

        System.out.println("enter the value of computer");
        float c=s.nextFloat();

        System.out.println("enter the value of english");
        float e=s.nextFloat();

        float total_marks=(m+c+e);
        float percentage=(total_marks/300)*100;

        System.out.println("the value of math:"+m);
        System.out.println("the value of computer:"+c);
        System.out.println("the value of english:"+e);

        System.out.println("Total marks:"+total_marks);
        System.out.println("Percentage Marks:"+percentage);
    }
}
