package Day2;

public class MethodParameterFun {

    public void execute(String str){
        System.out.println("I got: " + str);
        addTwoNumbers(3, 4);
    }

    public void addTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        MethodParameterFun prg = new MethodParameterFun();
        prg.execute("This string");
    }
     }
