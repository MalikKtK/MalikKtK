using System;
using System.Collections.Generic;

public record Person(string Name, int Age, char Gender)
{
    public static Person Create(string name, int age, char gender)
    {
        return new Person(name ?? throw new ArgumentNullException(nameof(name)), age, gender);
    }
}

public class Employee
{
    public int Id { get; set; }
    public Person Person { get; set; }
    public string Department { get; set; }
    public Employee? Manager { get; set; }
    public Salary Salary { get; set; }

    public Employee(int id, Person person, string department, Employee? manager = null)
    {
        Id = id;
        Person = person ?? throw new ArgumentNullException(nameof(person));
        Department = department;
        Manager = manager;
        Salary = new Salary(0, "USD");
    }
}

public class Department
{
    public string Name { get; set; }
    public Employee? Head { get; set; }

    public Department(string name, Employee? head)
    {
        Name = name;
        Head = head;
    }
}

public class Company
{
    public string Name { get; set; }
    public List<Employee> Employees { get; set; }
    public List<Department> Departments { get; set; }

    public Company(string name)
    {
        Name = name;
        Employees = new List<Employee>();
        Departments = new List<Department>();
    }
    public void AddEmployee(Employee employee, string departmentName, Employee? manager = null)
    {
        Employees.Add(employee);

        var department = Departments.FirstOrDefault(d => d.Name == departmentName);

        if (department == null)
        {
            department = new Department(departmentName, employee);
            Departments.Add(department);
        }

        department.Head = employee;

        if (manager != null)
        {
            employee.Manager = manager;
        }
    }


    public void RemoveEmployee(Employee employee)
    {
        Employees.Remove(employee);

        foreach (var department in Departments)
        {
            if (department?.Head == employee)
            {
                department.Head = null;
                break;
            }
        }
    }


}
public static class SalaryConverter
{
    public static decimal ToDecimal(Salary salary)
    {
        return salary.Amount;
    }

    public static Salary FromDecimal(decimal amount, string currency)
    {
        return new Salary(amount, currency);
    }
}

public record Salary(decimal Amount, string Currency);

class Program
{
   static void Main()
{
    Company myCompany = new Company("ABC Inc.");

    Employee manager = new Employee(1, Person.Create("John Doe", 35, 'M'), "HR");
    Employee employee = new Employee(2, Person.Create("Alice Smith", 28, 'F'), "HR", manager);

    myCompany.AddEmployee(manager, "HR");
    myCompany.AddEmployee(employee, "HR", manager);

    Console.WriteLine("Employees in HR Department:");

    foreach (var department in myCompany.Departments.FindAll(d => d.Name == "HR"))
    {
        var head = department.Head;
        if (head != null)
        {
            Console.WriteLine($"Head: {head.Person.Name}, Manager: {(head.Manager != null ? head.Manager.Person.Name : "None")}");
            foreach (var subEmployee in myCompany.Employees.FindAll(e => e.Department == "HR" && e != head))
            {
                Console.WriteLine($"Employee: {subEmployee.Person.Name}, Manager: {(subEmployee.Manager != null ? subEmployee.Manager.Person.Name : "None")}");
            }
        }
    }

    myCompany.RemoveEmployee(employee);
    Console.WriteLine($"Employee removed: {employee.Person.Name}");
}

}
