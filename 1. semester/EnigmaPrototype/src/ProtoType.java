
public class ProtoType {
    public int convertCharToInt(char c) {
        // converts range [' ', A-Å] to range [0-29]
        if (c == ' ') {
            return 0;
        } else if (65 <= c && c <= 91) {
            return (int) c - 64;
        } else if (c == 'Æ') {
            return (int) c - 171;
        } else if (c == 'Ø') {
            return (int) c - 188;
        } else { // (c == 'Å')
            return (int) c - 168;
        }
    }

    public char convertIntToChar(int charValue) {
        // converts range [0-29] to range [' ', A-Å]
        if (charValue == 0) {
            return ' ';
        } else if (1 <= charValue && charValue <= 26) {
            return (char) (charValue + 64);
        } else if (charValue == 27) {
            return 'Æ';
        } else if (charValue == 28) {
            return 'Ø';
        } else { // (charValue == 29)
            return 'Å';
        }
    }

    public void display(char c) {
        System.out.printf("'%c' = '%2d' || '%c'\n", c, convertCharToInt(c), convertIntToChar(convertCharToInt(c)));
    }

    public static void main(String[] args) {
        ProtoType e = new ProtoType();

        // print test cases
        e.display(' ');
        e.display('A');
        e.display('Z');
        e.display('Æ');
        e.display('Ø');
        e.display('Å');

    }
}