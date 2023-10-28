class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}
class WordCombine{
    public boolean canCombine(String sourceWord, String targetWord){
    boolean isCombine = false;
        for (char c :
                targetWord.toLowerCase().toCharArray()) {
            if (sourceWord.toLowerCase().contains(Character.toString(c))) {
                isCombine = true;
            } else isCombine = false;
        }
        return isCombine;
    }
}