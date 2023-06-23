import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        UI.calcScreen();

        int choice = sc.nextInt();

        while(choice > 0 && choice < 17)
            switch(choice){
            case 1:
            
            System.out.println(Operation.performAddition(sc));

            System.out.println("Choose another?");

            choice = sc.nextInt();

            break;

            case 2:
            System.out.println(Operation.performSubtraction(sc));

            System.out.println("Choose another?");

            choice = sc.nextInt();

            break;

            case 3:
            System.out.println(Operation.performMultiplication(sc));

            System.out.println("Choose another?");

            choice = sc.nextInt();

            break;

            case 4:
            System.out.println(Operation.performDivision(sc));

            System.out.println("Choose another?");

            choice = sc.nextInt();

            break;
            
            case 5:
            System.out.println(Operation.performModulation(sc));

            System.out.println("Choose another?");

            choice = sc.nextInt();

            break;

            case 6:
            
            Operation.performValue(sc, 2.7182818285);

            System.out.println("Choose another?");

            choice = sc.nextInt();
            
            break;
            
            case 7:

            System.out.println(Operation.performExponentation(sc));

            System.out.println("Choose another?");

            choice = sc.nextInt();
            
            break;

            case 8:

            System.out.println(Operation.performAbsolute());

            System.out.println("Choose another?");

            choice = sc.nextInt();
            
            break;
            case 9:
            
            Operation.performValue(sc, 3.1415926536);

            System.out.println("Choose another?");

            choice = sc.nextInt();
            
            break;
            case 10:

            System.out.println(Operation.performSquareRoot());

            System.out.println("Choose another?");

            choice = sc.nextInt();
            
            break;
            case 11:

            System.out.println(Operation.performLog());

            System.out.println("Choose another?");

            choice = sc.nextInt();
            
            break;
            
            case 12:

            System.out.println(Operation.performLog10());

            System.out.println("Choose another?");

            choice = sc.nextInt();
            
            break;
            case 13:

            System.out.println(Operation.performSin());

            System.out.println("Choose another?");

            choice = sc.nextInt();
            
            break;
            case 14:

            System.out.println(Operation.performCos());

            System.out.println("Choose another?");

            choice = sc.nextInt();
            
            break;
            case 15:

            System.out.println(Operation.performTan());

            System.out.println("Choose another?");

            choice = sc.nextInt();
            
            break;
            case 16:

            Operation.performReset();

            System.out.println("RESET");

            System.out.println("Choose another?");

            choice = sc.nextInt();
            
            break;
        }
        sc.close();
    }
        
}
