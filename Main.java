import java.util.Scanner;

import java.lang.Math;

public class Main
{

    public static void nextScreen()
    {
        System.out.println("(1.] +) (2.] -) (3.] *) (4.] /) (5.] **) (6. %)");
        System.out.println("(7.] sin) (8.] cos) (9.] tan) (10] %%) (11.] √) (12]. C)");
    }

    public static void operatorScreen()
    {
        System.out.println("(1.] +) (2.] -) (3.] *) (4.] /) (5.] **) (6. %)");
    }


    public static void menuScreen()
    {
        System.out.println("Welcome to Calculator");

        System.out.println("Choose function. Enter anything else to STOP.");

        nextScreen();
        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        menuScreen();

        double a = 0;

        int c = sc.nextInt();

        while((c == 1)||(c == 2)||(c == 3)||(c == 4)||(c == 5)||(c == 6)||(c == 7)||(c == 8)||(c == 9)||(c == 10)||(c == 11)||(c == 12))
        {
            if(c == 1)
            {
                System.out.println("Input a number");

                double b = sc.nextDouble();

                a = a + b;

                System.out.println(a);

                System.out.println("Choose another?");

                nextScreen();

                c = sc.nextInt();
            }
            else if(c == 2)
            {
                System.out.println("Input a number");

                double b = sc.nextDouble();

                a = a - b;

                System.out.println(a);

                System.out.println("Choose another?");

                nextScreen();

                c = sc.nextInt();
            }
            else if(c == 3)
            {
                System.out.println("Input a number");

                double b = sc.nextDouble();

                a = a * b;

                System.out.println(a);
            
                System.out.println("Choose another?");

                nextScreen();

                c = sc.nextInt();
            }
            else if(c == 4)
            {
                System.out.println("Input a number");

                double b = sc.nextDouble();

                if(b == 0)
                {
                    System.out.println("undefined");

                    System.out.println("Choose another?");

                    nextScreen();

                    c = sc.nextInt();   
                }
                else
                {
                    a = a / b;

                    System.out.println(a);
            
                    System.out.println("Choose another?");

                    nextScreen();

                    c = sc.nextInt();
                }
            }
            else if(c == 5)
            {
                System.out.println("Input a number");

                double b = sc.nextDouble();

                a = Math.pow(a, b);

                System.out.println(a);

                System.out.println("Choose another?");

                nextScreen();

                c = sc.nextInt();

            }
            else if(c == 6)
            {
                System.out.println("Input a number");

                double b = sc.nextDouble();

                a = a % b;

                System.out.println(a);
            
                System.out.println("Choose another?");

                nextScreen();

                c = sc.nextInt();
            }
            else if(c == 7)
            {
               a = Math.sin(a);

               System.out.println(a);

               System.out.println("Choose another?");
               
               nextScreen();

               c = sc.nextInt();

            }
            else if(c == 8)
            {
                a = Math.cos(a);

               System.out.println(a);

               System.out.println("Choose another?");
               
               nextScreen();

               c = sc.nextInt();
            }
            else if(c == 9)
            {
                a = Math.tan(a);

               System.out.println(a);

               System.out.println("Choose another?");
               
               nextScreen();

               c = sc.nextInt();
            }
            else if(c == 10)
            {
                a = a/100;

                System.out.println(a);

                System.out.println("Choose another?");

                nextScreen();

               c = sc.nextInt();
            }
            else if(c == 11)
            {
                a = Math.sqrt(a);

                System.out.println(a);

                System.out.println("Choose another?");
                
                nextScreen();

                c = sc.nextInt();
            }
            else if(c == 12)
            {
                a = 0;

                System.out.println(a);

                System.out.println("Cleared! Choose another?");

                nextScreen();

                c = sc.nextInt();

            }
        }
    }
}
