package universalhashingrdc;

public class HashFunction {
    
    WordList[] dictionary;
    int size = 13;
    int hashFunctionNo;
    public String[][] defaultWords = {{"Merge Sort", "a Divide and Conquer algorithm. It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves."},
            {"Insertion Sort", "simple sorting algorithm that builds the final sorted array (or list) one item at a time."},
            {"Stack", "abstract data type that serves as a collection of elements, with two principal operations"},
            {"Queue", "particular kind of abstract data type or collection in which the entities in the collection are kept in order"},
            {"Simple Linked List", "linear collection of data elements, in which linear order is not given by their physical placement in memory."},
            {"Doubly Linked List", "linked data structure that consists of a set of sequentially linked records called nodes."},
            {"Circular Linked List", "sequence of elements in which every element has link to its next element in the sequence and the last element has a link to the first element in the sequence."},
            {"Sparse Matrix", "matrix in which most of the elements are zero."},
            {"Sparse Array", "unlike a normal array of Objects, there can be gaps in the indices. It is intended to be more memory efficient."},
            {"Row-Column Major", "method for storing multidimensional arrays in linear storage such as random access memory."},
            {"Recursive Method", "method where the solution to a problem depends on solutions to smaller instances of the same problem."},
            {"Radix Sort", "non-comparative integer sorting algorithm that sorts data with integer keys by grouping keys by the individual digits which share the same significant position and value."},
            {"Universal Hashing", "refers to selecting a hash function at random from a family of hash functions with a certain mathematical property."},
            {"Division Method Hash", "hashing method that relies on divisions."},
            {"Multiplication Method Hash", "hashing method that relies on multiplications"},
            {"Linear Probing Hash", "a way of resolving collisions in a hash table by simply moving a value from one index to another in a linear fashion."},
            {"Heapsort", "comparison-based sorting algorithm."},
            {"Profesor", "Jairo Salazar"},
            {"Alumno", "Jorge Pietra Santa"}
            };
    
    /**
     Constructor for the class HashFunction
     */
    
    public HashFunction(int size, int r) {
        
        this.size = size;
        this.hashFunctionNo = r;
        
        dictionary = new WordList[size];
        
        for(int i = 0; i < size; i++) {
            dictionary[i] = new WordList();
        }
        
        addArray(defaultWords);
    }
    
    /**
     Method that selects a random Hash Function from the Hash Family
     */
    
    public int randomHashFunction(String word) {
        switch(this.hashFunctionNo) {
            case 1: 
                return hashFunction1(word);
            case 2: 
                return hashFunction2(word);
            case 3:
                return hashFunction3(word);
            case 4:
                return hashFunction4(word);
            default:
                break;
        }
        return -1;
    }
    
    /**
     Hash Function 1
     */
    
    public int hashFunction1(String word) {
        int hashValue = 0, r1 = 31415, r2 = 27181;
        
        for (int i = 0; i < word.length(); i++) {
            hashValue = (r1*hashValue + (int)word.charAt(i)) % (size-1);
            r1 = r1*r2 % (size-1) + 1;
        }
        
        if (hashValue < 0)
            hashValue = hashValue * (-1);
        
        return hashValue;
    }
    
    /**
     Hash Function 2
     */
    
    public int hashFunction2 (String word) {
        int hashValue = 0, r = 121;
        for(int i = 0; i < word.length(); i++) {
            hashValue = (hashValue*r) + (int)word.charAt(i) % (size-1);
        }
        
        if (hashValue < 0)
            hashValue = hashValue * (-1);
        
        return (hashValue % (size-1))+1;
    }
    
    /**
     Hash Function 3
     */
    
    public int hashFunction3 (String word) {
        int hashValue = 0;
        for(int i = 0; i < word.length(); i++) {
            int ascii = word.charAt(i) - 96;
            
            hashValue = (hashValue*27 + ascii) % (size-1);
        }
        
        if (hashValue < 0)
            hashValue = hashValue * (-1);
        
        return hashValue;
    }
    
    /**
     Hash Function 4
     */
    
    public int hashFunction4 (String word) {
        int hashValue = 7;
        for (int i = 0; i < word.length(); i++) {
            hashValue = (hashValue*31 + word.charAt(i)) % (size-1);
        }
        
        if (hashValue < 0)
            hashValue = hashValue * (-1);
        
        return hashValue+1;
    }
    
    /**
     Method to insert a word into the dictionary
     */
    
    public void insert(Word word) {
        String wordToHash = word.word;
        int hashValue = randomHashFunction(wordToHash);
        
        dictionary[hashValue].insert(word, hashValue);
    }
    
    /**
     Method to find a word in the local dictionary
     */
    
    public Word find(String wordFind) {
        int hashValue = randomHashFunction(wordFind);
        
        Word word = dictionary[hashValue].find(hashValue, wordFind);
        
        return word;
    }
    
    /**
     Method that lets us add a whole array
     */
    
    public void addArray(String[][] add) {
        for(int i = 0; i < add.length; i++) {
            String word = add[i][0];
            String definition = add[i][1];
            
            Word newWord = new Word(word, definition);
            
            insert(newWord);
        }
    }
    
    /**
     Method that lets us display the whole dictionary
     */
    
    public void displayArray() {
        for(int i = 0; i < size; i++) {
            
            System.out.println("Index: " + i);
            System.out.println("\n");
            dictionary[i].displayWordList();
            System.out.println("\n");
        }
    }
    
    
}



class Word {
    
    public String word, definition;
    public int key;
    public Word next;
    
    /**
     Constructor for the object Word, which acts as a node
     */
    
    public Word(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }
    
    /**
     Method that translates a word object to a string
     */
    
    @Override
    public String toString() {
        return word + ": " + definition;
    }
}



class WordList {
    public Word firstWord = null;
    
    /**
     Method to insert a word into the WordList
     */
    
    public void insert(Word word, int hashValue) {
        Word previous = null;
        Word current = firstWord;
        
        word.key = hashValue;
        
        while(current != null && word.key > current.key) {
            previous = current;
            current = current.next;
        }
        
        if(previous == null)
            this.firstWord = word;
        else
            previous.next = word;
        
        word.next = current;
    }
    
    /**
     Method that lets us display the whole WordList
     */
    
    public void displayWordList() {
        Word current = firstWord;
        
        while(current != null) {
            System.out.println(current);
            System.out.println("\n");
            current = current.next;
        }
    }
    
    /**
     Method to find a word in the WordList
     */
    
    
    public Word find(int hashValue, String wordFind) {
        Word current = firstWord;
        
        while(current != null && current.key <= hashValue) {
            if(current.word.equals(wordFind))
                return current;
            
            current = current.next;
        }
        
        return null;
    }
    
}
