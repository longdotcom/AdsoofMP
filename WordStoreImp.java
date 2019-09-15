  import java.util.Scanner;

public class WordStoreImp implements WordStore{

    private WordList[] array;
    private int sizeOfArray;
    private int itemsInArray = 0;

    WordStoreImp(int size) {
        sizeOfArray = size;
        array = new WordList[size];

        for (int i = 0; i < sizeOfArray; i++){
            array[i] = new WordList();
        }
    }

    public void add(String word){
    
        Word newWord = new Word(word);
        int hashKey = hash(newWord.theWord);
        array[hashKey].insert(newWord, hashKey);
    }

    public int count(String word){
        if(sizeOfArray == 0)
            return 0;
        
        int count = 0;
        int hashKey = hash(word);

        Word current = array[hashKey].first;

        while (current != null) {
            if (current.theWord.equals(word)){
                count++;
            }

            current = current.next;
        }

        return count;
    }

    public void remove(String word){
        
        if(sizeOfArray == 0)
            return;
        
        int hashKey = hash(word);
        Word current = array[hashKey].first;

        if(current==null){
         return;   
        }
        if(current.theWord.equals(word) ){
            array[hashKey].first = current.next;
            return;
        }

        while(current.next != null) {

            if(current.next.theWord.equals(word)){
                current.next = current.next.next;
                break;
            }
                current = current.next;

        }
               
    }
      
    private int hash(String toHash) {

        int hashKey = 0;

        for (int i = 0; i < toHash.length(); i++) {           

            int charCode = toHash.charAt(i) - 96;

            hashKey = (hashKey * 27 + charCode) % sizeOfArray;
        }

        return hashKey;
    }

    public WordList[] getArray(){
        return array;
    }
}

class WordList {

    Word first = null;

    public void insert(Word newWord, int hashKey){

        Word previous = null;
        Word current = first;
        newWord.key = hashKey;

        while (current != null && newWord.key > current.key) {
            previous = current;
            current = current.next;
        }

        if (previous == null)
            first = newWord;
        else
            previous.next = newWord;

        newWord.next = current;

    }

    public void printList() {
        Word current = first;
        while (current != null) {
            System.out.println("  - " +current);
            current = current.next;
        }
    }
}

class Word {

    String theWord;
    int key;
    Word next;

    public Word(String word) {
        this.theWord = word;
    }
    
    public String toString() {
        return theWord;
    }
}

