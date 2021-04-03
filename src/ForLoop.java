import org.omg.Messaging.SyncScopeHelper;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ForLoop
  //Question-1   print any 10 numbers
{
    public static void printAny10numbers() // static method
    {
        System.out.println("Answer  1");
        Scanner scanner = new Scanner(System.in); // scanner class
        System.out.println("Please enter start number : "); // enter start number
        int a = scanner.nextInt();
        System.out.println("Please enter finish number : "); // enter finish number
        int b = scanner.nextInt();
        for (int i = a; i <=b && i <=a+10; i++) // for loop block to be executed
        {
            System.out.println(i);  //output any 10 number
        }

    }

    // Question 2
    public static void fibonacciNumber() // static method
    {
        System.out.println('\n'+"Answer 2");
        int n, num = 0, num1 = 1; // variables

        System.out.println("Enter how may Fibonacci numbers to print ");
        Scanner scanner = new Scanner(System.in);  //scanner class object creation
        n = scanner.nextInt();                       //taking a number n as input
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        System.out.print(num + " " + num1);
        for (int i = 1; i <= n - 2; ++i)  // for loop  block to be executed
        {
            int sum = num + num1;
            num = num1;
            num1 = sum;
            System.out.print(" " + sum);    //output fibonacci number
        }

    }

    //Question 3
    public static void numberPrimeOrNot() // static method
    {
        System.out.println('\n'+"Answer 3");
        Scanner scanner = new Scanner(System.in);              //scanner class object creation
        System.out.println("Enter a number");
        int n = scanner.nextInt();                    //taking a number n as input
        int count = 0;
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)                //condition for getting the factors of number n
                count = count + 1;
        }
        if (count == 2)                                //if factors are two then, number is prime else not
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }

    // Question 4
    public static void reverseNumber() // static method
    {
        System.out.println('\n'+"Answer 4");
        Scanner scanner = new Scanner(System.in);// scanner class
        int Number, Reminder, Reverse;
        System.out.println("Please Enter any Numbers you want to Reverse : "); // enter any number
        Number = scanner.nextInt();

        for (Reverse = 0; Number > 0; Number = Number / 10) // for loop to be executed
        {
            Reminder = Number % 10;
            Reverse = Reverse * 10 + Reminder;
        }
        System.out.println("Reverse of entered number is = " + Reverse); // output reverse number
    }

    //Question 5
    public static void factorialNumber() // static method
    {
        System.out.println('\n'+"Answer 5");
        Scanner scanner = new Scanner(System.in);// scanner class
        System.out.println("Enter Factorial number :");
        int i, fact = 1; // variable
        int num;//It is the number to calculate factorial
        num = scanner.nextInt();
        for (i = 1; i <= num; i++) // for loop code tobe executed
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact); // out put factorial number
    }

    // Question 6
    public static void sumOfNaturalNumber() // static method
    {
        System.out.println('\n'+"Answer 6");
        Scanner scanner = new Scanner(System.in);// scanner class
        System.out.println("Enter value of n :");
        int num, i, total = 0; // variable

        num = scanner.nextInt();
        for (i = 1; i <= num; ++i) // for loop method
        {
            {
                total += i;

            }
            System.out.println("natural number is :" + total); // print out put
        }
    }

    // Question 7
    public static void calculatorUsingSwitchStatement()// static method
    {
        System.out.println('\n'+"Answer 7");
        Scanner scanner = new Scanner(System.in); // scanner class
        System.out.print("Enter first number = ");
        double num1, num2;                  // variable double
        num1 = scanner.nextDouble();
        System.out.print("Enter second number = ");
        num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): "); // operator using
        char operator = scanner.next().charAt(0);
        double output = 0; // variable

        switch (operator)    // using switch operator
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;

            default:
                System.out.print("You have entered wrong number");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + output); // output
    }

    // Question 8
    public static void sumOfxRanging()          //  static method
    {
        System.out.println('\n'+"Answer 8");
        Scanner scanner = new Scanner(System.in); // scanner class
       int sum = 0; // variable
        System.out.print("Enter x Ranging number = ");

        int num = scanner.nextInt();

        for (int x = 1; x <=num; x++)  // for loop
        {
            if (num > 20)
            {
                System.out.println("please enter range 1 to 20");
                break;
            }
            else
            sum = sum + x;

        }
        System.out.println("sum of number " + num );
        System.out.println(sum);
    }

    // Question 9
    public static void dividedBy3And5Separately()       // static method
    {
        System.out.println('\n'+"Answer 9");
        Scanner scanner = new Scanner(System.in); // scanner class
        System.out.print("Enter any key for run programme  = ");
        int a;   // variable
        a = scanner.nextInt();
        System.out.println("\nDivided by 3: ");    // out put
        for (int i = 0; i < 100; i++)  	//code if condition
        {
            if (i % 3 == 0)
                System.out.print(i + ",");
        }
        System.out.println("\nDivided by 5: ");     // print out put
        for (int i = 1; i < 100; i++)
        {
            if (i % 5 == 0) System.out.print(i + ", ");
        }
    }

    // Question 10
    public static void multiplicationTableForAnyNumber()       // static method
    {
        System.out.println('\n'+"Answer 10");
        Scanner scanner = new Scanner(System.in); // scanner class
        System.out.print("Enter number:");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++)  // for loop
        {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    // Question 11
    public static void countTotalNumberInString()       // static method
    {
        System.out.println('\n'+"Answer 11");
        System.out.println("Enter the any word  from 'A' =" );
        Scanner sc=new Scanner(System.in); // scanner class
        String s =sc.nextLine();
        int count = 0;  // variable

        for (int i=0;i<s.length();i++)   //code if condition
        {
            if (s.charAt(i)=='a')
                count++;

        }

        System.out.println( "count of 'a' is  "+ count );

    }
    // Question 12
             public static void numbersBetweenWhichAreDivisible() // static method
             {
                 System.out.println('\n'+"Answer 12");
                 Scanner scanner = new Scanner(System.in); // scanner class
                 System.out.print( "Enter 'a' number" + '\n');
                 int a = scanner.nextInt();      // variable
                 System.out.println("Enter 'b' number");
                 int b = scanner.nextInt();  // variable
                 {
                     System.out.println( "sum is "+ (a+b));
                     System.out.println("divided by/9 = " + (a+b)/9.0);
                 }
}

            //Question 13
            public static void minMaximumNumber ()  // static method
            {
                System.out.println('\n'+"Answer 13");
                int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE; // Declare max as Minimum and min as Maximum
                Scanner scanner = new Scanner(System.in); //Declare Scanner to take input from user
                System.out.print("Enter 3 integers: " + "\n");
                for (int i = 0; i < 3; ++i) //for loop that runs 3 times to take input from user
                {
                    int num = scanner.nextInt();
                    if (max < num)//Check if the number is greater than max
                        max = num;
                    if (min > num)  //Check if the number is smaller than min
                        min = num;

                }

                System.out.println("Highest integer is " + max); //Print the Highest number which is stored in max
                System.out.println("Lowest integer is " + min); //Print the Lowest number which is stored in min
            }


// Question 14

            public static void averageSumBetweenTwoNumber()  // static method
            {
                System.out.println('\n'+"Answer 14");
                Scanner in = new Scanner(System.in);  //scanner class
                System.out.print("Input first number a : ");
                int num1 = in.nextInt();
                System.out.print("Input second number b : ");
                int num2 = in.nextInt();
                System.out.println("Sum  of number is a & b:"+(num1 + num2) );
                System.out.println("Average of number is :" +(num1 + num2)/2.0);
            }

            // Question 15
            public static void triangularPattern ()   // static method
            {
                System.out.println('\n'+"Answer 15");
                Scanner scanner = new Scanner(System.in); // scanner class
                System.out.println("Enter the number of rows to be printed :");
                int row = scanner.nextInt();
                int i, j;   // variable
                for (i = 0; i < row; i++) //outer loop for rows
                {
                    for (j = 0; j <= i; j++) //inner loop for columns
                    {
                        System.out.print(" * "); // loop to print the number of stars in each row
                    }

                    System.out.println(); //throws the cursor in a new line after printing each line
                }

            }


            //main method declaration
            public static void main (String[]args)
            {

                 printAny10numbers();               // Answer 1
                 fibonacciNumber();                 // Answer 2
                 numberPrimeOrNot();                // Answer 3
                 reverseNumber();                   // Answer 4
                 factorialNumber();                  // Answer 5
                 sumOfNaturalNumber();               // Answer 6
                 calculatorUsingSwitchStatement();   // Answer 7
                 sumOfxRanging();                   // Answer 8
                 dividedBy3And5Separately();        // Answer 9
                 multiplicationTableForAnyNumber(); // Answer 10
                 countTotalNumberInString();        // Answer 11
                 numbersBetweenWhichAreDivisible(); // Answer 12
                 minMaximumNumber();                // Answer 13
                 averageSumBetweenTwoNumber();      // Answer 14
                 triangularPattern();               // Answer 15
            }

        }