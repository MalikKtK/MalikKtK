package demo;

public class kapitel2 {

        String message;
        int x; //To declare an integer variable named x
        String firstName;
        String lastName;
        int hour, minute;

        /* This example declares two variables with type String and two with type int.
The last line shows how to declare multiple variables with the same type: hour
and minute are both integers. Note that each declaration statement ends with
a semicolon (;).*/

        message = "Hello!"; // give message the value "Hello!"
        hour = 11; // assign the value 11 to hour
        minute = 59; // set minute to 59


        /* This example shows three assignments, and the comments illustrate different
ways people sometimes talk about assignment statements. The vocabulary
can be confusing here, but the idea is straightforward:
 When you declare a variable, you create a named storage location.
When you make an assignment to a variable, you update its value.*/

      //  message = "123"; // legal
    //    message = 123; // not legal

        String message = "Hello!";
        int hour = 11;
        int minute = 59;

        int a = 5;
        int b = a; // a and b are now equal
        int c = 0;
        a = 3; // a and b are no longer equal

        String firstLine = "Hello, again!";
        System.out.println(firstLine);

        System.out.print("The value of firstLine is ");
        System.out.println(firstLine);

        /* Conveniently, the code for displaying a variable is the same regardless of its
        type. For example: */
        int hour = 11;
        int minute = 59;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

        int hour = 11;
        int minute = 59;
        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute);

        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60);

        //As an alternative, we can calculate a percentage rather than a fraction:
        System.out.print("Percent of the hour that has passed: ");
        System.out.println(minute * 100 / 60);

        double pi;
        pi = 3.14159;

        double minute = 59.0;
        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60.0);

       /* The following is illegal because the variable on the left is an int and the value
        on the right is a double:*/
        int x = 1.1; // compiler error
        /*It is easy to forget this rule, because in many cases Java automatically converts
        from one type to another:*/
        double y = 1; // legal, but bad style

        double y = 1 / 3; // common mistake
        double y = 1.0 / 3.0; // correct

        /*The difference between the number we want and the floating-point number
        we get is called rounding error. For example, the following two statements
        should be equivalent:*/
        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1
                + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
       /* But on many machines, the output is as follows:
        1.0
        0.9999999999999999   */

        /*For example, consider a bank account with a balance of $123.45:*/
        double balance = 123.45; // potential rounding error
        /*In this example, balances will become inaccurate over time as the variable is
        used in arithmetic operations like deposits and withdrawals. The result would
        be angry customers and potential lawsuits. You can avoid the problem by
        representing the balance as an integer:*/
        int balance = 12345; // total number of cents

        //The following expressions are illegal:
        "Hello" - 1 "World" / 123 "Hello" * "World"

        System.out.println(1 + 2 + "Hello");
// the output is 3Hello
        System.out.println("Hello" + 1 + 2);
// the output is Hello12



    }
}
