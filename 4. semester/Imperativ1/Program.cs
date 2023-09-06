class Person {
    public int Age { get; set; }
    }

internal class Program
{
    private static void Main(string[] args)
    {
        // Statement, Expressions
        Console.WriteLine("Hej");


        // Variables
        int x = 2;

        int y = x;

        x = 4;

        Person p1 = new Person();
        p1.Age = 32;

        //Person p2 = New Person();
        //p2.Age = 33;

        Person p2 = p1;
        p1.Age = 15;

        Console.WriteLine($"Person 1 {p1.Age}, Person 2 {p2.Age}");

        Console.WriteLine(x);
        Console.WriteLine(y);
    }
}