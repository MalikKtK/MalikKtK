package ex5;

public class Word {

    public String properCase(String sentence){
        if(sentence.equals(sentence.toUpperCase())){
            var lower = sentence.toLowerCase();
            var first = lower.substring(0,1).toUpperCase();
            return first + lower.substring(1);
        } else if (sentence.length() > 3) {
            var lower = sentence.toLowerCase();
            var first = lower.substring(0,1).toUpperCase();
            return first + lower.substring(1);
        } else if (sentence.length() <= 3) {
            return sentence.toLowerCase();
        }
        return sentence;

    }
}
