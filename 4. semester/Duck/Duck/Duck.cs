using System;
using System.Collections.Generic;

class Duck
{
    public string Name { get; set; }
    public int Age { get; set; }
    public string Gender { get; set; }
    public bool IsDomestic { get; set; }

    public Duck(string name, int age, string gender, bool isDomestic)
    {
        Name = name;
        Age = age;
        Gender = gender;
        IsDomestic = isDomestic;
    }
}

class Mallard : Duck
{
    public bool CanFly { get; set; }
    public bool HasOrangeBeak { get; set; }

    public Mallard(string name, int age, string gender, bool isDomestic)
        : base(name, age, gender, isDomestic)
    {
        CanFly = true;
        HasOrangeBeak = true;
    }
}

class Pekin : Duck
{
    public bool CanFly { get; set; }
    public bool HasOrangeBeak { get; set; }

    public Pekin(string name, int age, string gender, bool isDomestic)
        : base(name, age, gender, isDomestic)
    {
        CanFly = false;
        HasOrangeBeak = false;
    }
}

class DonaldDuck : Duck
{
    public bool IsMainCharacter { get; set; }
    public string OutfitColor { get; set; }

    public DonaldDuck(string name, int age, string gender)
        : base(name, age, gender, true)
    {
        IsMainCharacter = true;
        OutfitColor = "Blue";
    }
}

class DaisyDuck : Duck
{
    public bool IsMainCharacter { get; set; }
    public string OutfitColor { get; set; }

    public DaisyDuck(string name, int age, string gender)
        : base(name, age, gender, true)
    {
        IsMainCharacter = true;
        OutfitColor = "Pink";
    }
}

static class DuckFactory
{
    public static Duck CreateDuck(string duckType)
    {
        switch (duckType)
        {
            case "Mallard":
                return new Mallard("Mallard Duck", 2, "Male", false);
            case "Pekin":
                return new Pekin("Pekin Duck", 3, "Female", true);
            case "DonaldDuck":
                return new DonaldDuck("Donald Duck", 4, "Male");
            case "DaisyDuck":
                return new DaisyDuck("Daisy Duck", 3, "Female");
            default:
                throw new ArgumentException("Invalid duck type");
        }
    }
}

class Program
{
    static void DisplayDuckInformation(Duck duck)
    {
        Console.WriteLine($"Name: {duck.Name}");
        Console.WriteLine($"Age: {duck.Age}");
        Console.WriteLine($"Gender: {duck.Gender}");
        Console.WriteLine($"Is Domestic: {duck.IsDomestic}");

        if (duck is Mallard mallard)
        {
            Console.WriteLine($"Can Fly: {mallard.CanFly}");
            Console.WriteLine($"Has Orange Beak: {mallard.HasOrangeBeak}");
        }
        else if (duck is Pekin pekin)
        {
            Console.WriteLine($"Can Fly: {pekin.CanFly}");
            Console.WriteLine($"Has Orange Beak: {pekin.HasOrangeBeak}");
        }
        else if (duck is DonaldDuck donaldDuck)
        {
            Console.WriteLine($"Is Main Character: {donaldDuck.IsMainCharacter}");
            Console.WriteLine($"Outfit Color: {donaldDuck.OutfitColor}");
        }
        else if (duck is DaisyDuck daisyDuck)
        {
            Console.WriteLine($"Is Main Character: {daisyDuck.IsMainCharacter}");
            Console.WriteLine($"Outfit Color: {daisyDuck.OutfitColor}");
        }

        Console.WriteLine();
    }

    static void Main(string[] args)
    {
        List<Duck> ducks = new List<Duck>
        {
            DuckFactory.CreateDuck("Mallard"),
            DuckFactory.CreateDuck("Pekin"),
            DuckFactory.CreateDuck("DonaldDuck"),
            DuckFactory.CreateDuck("DaisyDuck")
        };

        foreach (var duck in ducks)
        {
            DisplayDuckInformation(duck);
        }
    }
}
