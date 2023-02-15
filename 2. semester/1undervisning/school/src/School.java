public class School {

    public static void main(String[] args) {
       Student anna = new Student(12345678, "Claus", 12); // kalder constructoren
       Student claus = new Student(12345678, "Claus", 12);

        //claus.setCpr(3112229999l);
        //anna.setCpr(3333);

        claus.setCourses(new Course("2. semester progrsammering"));
        anna.setCourses(new Course("Python"));


        System.out.println(claus.getCpr());
        System.out.println(anna.getCpr());

        System.out.println(claus.getCourses());






    }


}
