import java.util.Scanner;
public class Studentb{
/**
 * @param args
 */
public static void main(final String args [] ){


final Scanner scan = new Scanner(System.in);
System.out.println( "Are you a student?(truevor false)");
final boolean student = scan.nextBoolean();
if (student){
    System.out.println("enter your age ");
    final int age =scan.nextInt();
    if(age>=18){
        System.out.println("you are allowed to enter the bar");
}else{
    System.out.println("your not allowed to the bar");
}else{
    System.out.println("your not allowed to the bar ");
}
}


        
        
         
}





    

    }



