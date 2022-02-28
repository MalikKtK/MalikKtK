
import java.util.Scanner;

public class ProtoType {
    Scanner in = new Scanner(System.in);
    void convertCharToInt() {
        String s = "hello world";
        s = s.replace(" ", "");
        char[] c = s.toCharArray();

        for (Character ss : c)
            System.out.println(ss - 'a' + 1);
    }
    void convertIntToChar () {

    }

    public static void main(String[] args) {
        new ProtoType().convertCharToInt();
        new ProtoType().convertIntToChar();
    }
}
