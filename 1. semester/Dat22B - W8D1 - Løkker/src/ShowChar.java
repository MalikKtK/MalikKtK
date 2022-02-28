public class ShowChar {

    void go(){
        char a = 'A';
        char z = 'Z';
        char æ = 'Æ';
        System.out.println((int)a + ", "
                + (int)z + ", " + (int)æ);
    }

    public static void main(String[] args) {
        new ShowChar().go();
    }
}
