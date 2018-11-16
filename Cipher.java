public class Cipher {

    public Cipher(String word, int key1, int key2){

        String finalString = "";
        int[] lettersArray = new int[word.length()];
        for(int i = 0; i < word.length(); i++){
            int numValue = (((int)(word.charAt(i))) + key1) * key2;
            lettersArray[i] = numValue;
        }
        for(int s : lettersArray){

            finalString += (s + " ");

        }
        System.out.println(finalString);

    }
}
