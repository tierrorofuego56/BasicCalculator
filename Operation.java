import java.lang.Math;
import java.util.Scanner;

public class Operation{

    private static double result = 0;

    Scanner sc = new Scanner(System.in);

    public static double performAddition(Scanner sc){

        System.out.println("Previous Result: " + result);

        System.out.println("Input a number");

        double input = sc.nextDouble();
        
        result = result + input;

        return result;
    }

    public static double performSubtraction(Scanner sc){

        System.out.println("Previous Result: " + result);

        System.out.print("Input a number: ");
        
        double input = sc.nextDouble();
        
        result -= input;

        return result;
    }
    public static double performMultiplication(Scanner sc){

        System.out.println("Previous Result: " + result);


        System.out.print("Input a number: ");
        
        double input = sc.nextDouble();
        
        result = result * input;

        return result;
    }
    public static double performDivision(Scanner sc){

        System.out.println("Previous Result: " + result);

        System.out.print("Input a number: ");

        double input = sc.nextDouble();
        
        if(input == 0)
        {
            System.out.println("ERROR: Cannot divide by zero!\n");
            
        }
        else{
            result = result / input;
        }

        return result;
    }
    public static double performModulation(Scanner sc){

        System.out.println("Previous Result: " + result);

        System.out.print("Input a number: ");

        double input = sc.nextDouble();
        
        if(input == 0)
        {
            System.out.println("ERROR: Cannot modulate by zero!\n");
            
        }
        else{
            result = result % input;
        }

        return result;
    }
    public static void performValue(Scanner sc, double num){

        System.out.println("Previous Result: " + result);

        
        System.out.println("EQUATE or OPERATE");

        sc.nextLine();

        String decision = sc.nextLine();

        if(decision.equalsIgnoreCase("EQUATE")){
            result = num;
            System.out.println(result);
        }
        else if(decision.equalsIgnoreCase("OPERATE")){
            System.out.println("1.] add\n2.] subtract\n3.] multiply\n4.] divide\n5.] mod");

            System.out.print("Which?: ");

            int operate = sc.nextInt();

            if(operate == 1){
                result += num;
                System.out.println("Result: " + result);
            }
            else if(operate == 2){
                result -= num;
                System.out.println("Result: " + result);
            }
            else if(operate == 3){
                result *= num;
                System.out.println("Result: " + result);
            }
            else if(operate == 4){
                result /= num;
                System.out.println("Result: " + result);
            }
            else if(operate == 5){
                result %= num;
                System.out.println("Result: " + result);
            }
            else{
                System.out.println("Invalid option!");
            }
        }
    }

    public static double performExponentation(Scanner sc){

        System.out.println("Previous Result: " + result);


        System.out.print("Input a number result will be raised to: ");

        double exp = sc.nextDouble();

        result = Math.pow(result, exp);

        return result;

    }
    public static double performAbsolute(){

        System.out.println("Previous Result: " + result);

        result = Math.abs(result);

        return result;

    }

    public static double performSquareRoot(){

        System.out.println("Previous Result: " + result);

        
        result = Math.sqrt(result);

        return result;

    }
    public static double performLog() {

        System.out.println("Previous Result: " + result);
        
        result = Math.log(result);

        return result;
    }
    public static double performLog10() {

        System.out.println("Previous Result: " + result);
        
        result = Math.log10(result);

        return result;
    }
    public static double performSin() {

        System.out.println("Previous Result: " + result);
        
        result = Math.sin(result);

        return result;
    }
    public static double performTan() {

        System.out.println("Previous Result: " + result);
        
        result = Math.tan(result);

        return result;
    }
    public static double performCos() {

        System.out.println("Previous Result: " + result);
        
        result = Math.cos(result);

        return result;
    }
    public static void performReset(){

        result = 0;
    }
    
}
