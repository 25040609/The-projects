import java.util.Scanner;
public class Quadratic {
    public static void main(String args []){
        Scanner una = new Scanner(System.in);
        System.out.println("enter cofficient a");
        double a = una.nextDouble();
        System.out.println("enter cofficient b");
        double b= una.nextDouble();
        System.out.println("enter the cofficient c");
        double c= una.nextDouble();
    
        //but  discriminant b*b-4*a*c//
        double discriminant= b*b -4*a*c;
        if (discriminant > 0){
            double problem1 = (-  b+ Math.sqrt(discriminant))/(2*a);
            double problem2 = (-b-Math.sqrt(discriminant))/(2*a);
            System.out.println("the answers are of this problems");
            System.out.println("the answer of the problem is " + problem1);
            System.out.println("the answer of the problem is  "+ problem2);

    
        }
        else if (discriminant==0){
           double problem = -b/(2*a);
           System.out.println("the answer is of the problem " + problem );

          

        } 
    }
}

    

