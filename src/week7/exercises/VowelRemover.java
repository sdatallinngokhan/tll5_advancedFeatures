package week7.exercises;

public class VowelRemover {

    public static void main(String[] args) {
        VowelRemover vowelRemover = new VowelRemover();

        String word = "GokhAn";
        vowelRemover.removeVowels(word);
    }

    private void removeVowels(String word) {
        String result = word.replaceAll("[a,e,i,o,u,A,E,I,O,U]","");
        System.out.println(result);
    }
}
