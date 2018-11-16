public class Decipher {
        public Decipher(String word, int key1, int key2){

            //used to place the code at an index in the array
            int arrayElementIndex = 0;

            //if it is at the start of the word
            boolean startWord = true;

            //index of the start of word
            int startWordIndex= 0;

            //if it is at end of word
            boolean endWord = false;

            //index of end of word
            int endWordIndex = 0;


            //used to determine how many spaces (or how many letters there are)
            int spaceCounter = 0;
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == ' '){
                    spaceCounter++;
                }
            }

            //string array with a size of the amount of letters
            String[] strArr = new String[spaceCounter];


            //variable used to store the decrypted message
            String finalWord = "";


            for(int i = 0; i < word.length(); i++){


                if(startWord){
                    startWord = false;

                }
                //if the character is a space, then that is the end of a letter
                if(word.charAt(i) == ' '){
                    endWord = true;
                }

                if(endWord){

                    endWordIndex = i;

                    //adds the letter to the array
                    strArr[arrayElementIndex] = word.substring(startWordIndex, endWordIndex);
                    arrayElementIndex++;
                    endWord = false;


                    //next letter will be start of word
                    startWord = true;
                    startWordIndex = i+1;

                }

            }


            //decrypts each letter
            for(String s : strArr){

                //turns string into int
                int intValue = Integer.parseInt(s);

                //decrypts int
                intValue = intValue/key2-key1;

                //int into char
                char charValue = (char) intValue;

                //char into String
                String stringValue = Character.toString(charValue);

                //string to the final word
                finalWord += stringValue;


            }
            System.out.println(finalWord);
        }
}
