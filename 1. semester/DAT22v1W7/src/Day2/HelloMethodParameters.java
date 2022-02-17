package Day2;

public class HelloMethodParameters {
    public void printString(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        HelloMethodParameters prg = new HelloMethodParameters();
        prg.printString("Hello World!");

    }
}
