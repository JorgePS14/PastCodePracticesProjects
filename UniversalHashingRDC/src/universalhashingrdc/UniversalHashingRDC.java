package universalhashingrdc;

import java.util.Scanner;

public class UniversalHashingRDC {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int r = (int)(Math.random()*(5 - 1)) + 1;
        
        System.out.println("What will be the size of the array?");
        
        int size = read.nextInt();
        
        System.out.println("\n");
        
        HashFunction n = new HashFunction(size, r);
        
        String wordToFind = "x";
        
        while(!wordToFind.equalsIgnoreCase("exit")) {
            
            System.out.println("What do you want to do? [insert, find, exit]");
            
            wordToFind = read.nextLine();
            
            System.out.println("\n");
            
            if(wordToFind.equalsIgnoreCase("insert")) {
                System.out.println("Type the word you want to add: ");
                String word = read.nextLine();
                System.out.println("\nType the definition of said word:");
                String definition = read.nextLine();
                
                Word wordToAdd = new Word(word, definition);
                
                n.insert(wordToAdd);
                
                System.out.println("\n");
                
            } else if(wordToFind.equalsIgnoreCase("find")) {
                
                while(!wordToFind.equalsIgnoreCase("exit")) {
                    
                    System.out.println("Type the word you want to search: [Type exit to exit]");

                    wordToFind = read.nextLine();

                    System.out.println("\n");

                    System.out.println(n.find(wordToFind));

                    System.out.println("\n");
                }
            } else if(!wordToFind.equalsIgnoreCase("exit"))
                System.out.println("Invalid input / Try again\n");
        }
        
        
        
        n.displayArray();
        
    }
    
}
