package Day3;

public class Student {
   private String name;
   private String phone;
   private double avgGrade;
   private int yearOfBirth;

   Student(){} //Tom konstruktør

   Student(int y) {
       yearOfBirth = y;
   }

   void setName (String n) {
       if (!n.equals(""))
       name = n;
       else
           name = "N/A";
   }
    String getName(){
        return name;
    }
   void setPhone (String p) {
       phone = p;
   }
   String getPhone(){
       return phone;
   }
   int getYearOfBirth(){
       return yearOfBirth;
   }

}
