public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"Beer", "Wine", "Tequila", "Rum", "Whiskey", "Hennessey", "Vodka"};
        String[] wordListTwo = {"Happy", "Sad", "Angry", "Loving", "Disrace", "Mental", "Moody"};
        String[] wordListthree = {"why", "what", "where", "when", "how", "want"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListthree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo [rand2] + " " + wordListTwo[rand3];

        System.out.println("What we need is a " + phrase);

    }
}
