package identifiersautomata;
import java.util.ArrayList;
import java.util.Scanner;

public class IdentifiersAutomata {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce a string:  ");
        String iden = in.nextLine();
        ArrayList startState = new ArrayList();
        startState.add(0);
        
        Recogniser rec = new Recogniser();
        
        rec.recognise(iden, startState);
        
    }
    
    private static class Recogniser {
        
        public Recogniser() { }
        
        private void recognise(String iden, ArrayList prevStates) {
            ArrayList currStates = new ArrayList();
            
            if(iden.length() == 0) {
                if((prevStates.contains(22)) || prevStates.contains(1) || prevStates.contains(0) || prevStates.isEmpty())
                    System.out.println("Invalid identifier. The identifier can't be a reserved word "
                            + "(program, var, begin, end, if, then, else are all reserved words)"
                            + ", start with a period, or be empty. It also must contain at least one alphabetic"
                            + " character if it's a word, and must follow guidelines for correct numerical notations.");
                else if(prevStates.contains(28) || prevStates.contains(29))
                    System.out.println("Floating point numbers must contain a valid exponent (It can't be empty).");
                else if(prevStates.contains(26))
                    System.out.println("All hexadecimal numbers require at least one number after the x character.");
                else if(prevStates.contains(23) || prevStates.contains(24))
                    System.out.println("Final state: "+prevStates.toString()+" You entered a natural number.");
                else if(prevStates.contains(25))
                    System.out.println("Final state: "+prevStates.toString()+". You entered an octal number.");
                else if(prevStates.contains(27))
                    System.out.println("Final state: "+prevStates.toString()+". You entered a real number.");
                else if(prevStates.contains(30))
                    System.out.println("Final state: "+prevStates.toString()+". You entered a floating point number.");
                else if(prevStates.contains(31))
                    System.out.println("Final state: "+prevStates.toString()+". You entered a hexadecimal number.");
                else
                    System.out.println("You entered a valid identifier.");
                return;
            }
            
            switch(iden.charAt(0)) {
                case 'A':
                case 'B':
                case 'C':
                case 'c':
                case 'D':
                case 'F':
                    for(int i = 0; i < prevStates.size(); i++) {
                        helpStdHexaTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'j':
                case 'K':
                case 'k':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'u':
                case 'V':
                case 'W':
                case 'w':
                case 'Y':
                case 'y':
                case 'Z':
                case 'z':
                    checkStdTransitions(prevStates, currStates);
                    nextIteration(currStates, iden);
                    break;
                    
                //SPECIAL CASES: CHARACTERS FOUND IN RESERVER IDENTIFIERS    
                    
                case 'a': //var
                    for(int i = 0; i < prevStates.size(); i++) {
                        switch((int)prevStates.get(i)) {
                            case 12:
                                currStates.add(13);
                                System.out.println("Went from state 12 to state 13");
                                break;
                            case 17:
                                currStates.add(18);
                                System.out.println("Went from state 17 to state 18");
                                break;
                            default:
                                break;
                        }
                        helpStdHexaTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'b': //begin
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 0) {
                            currStates.add(19);
                            System.out.println("Went from state 0 to state 19");
                        }
                        helpStdHexaTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'd': //end
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 6) {
                            currStates.add(22);
                            System.out.println("Went from state 6 to state 22");
                        }
                        helpStdHexaTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'E': //Not found in reserved identifiers, but contains special hexadecimal and floating point cases
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 27) {
                            currStates.add(28);
                            System.out.println("Went from state 27 to state 28");
                        }
                        helpStdHexaTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'e': //begin, end, then, else. -- Also both hexadecimal case and floating point with exponent case
                    for(int i = 0; i < prevStates.size(); i++) {
                        switch((int)prevStates.get(i)) {
                            case 0:
                                currStates.add(3);
                                System.out.println("Went from state 0 to state 3");
                                break;
                            case 5:
                                currStates.add(22);
                                System.out.println("Went from state 5 to state 22");
                                break;
                            case 15:
                                currStates.add(16);
                                System.out.println("Went from state 15 to state 16");
                                break;
                            case 19:
                                currStates.add(20);
                                System.out.println("Went from state 19 to state 20");
                                break;
                            case 27:
                                currStates.add(28);
                                System.out.println("Went from state 27 to state 28");
                                break;
                            default:
                                break;
                        }
                        helpStdHexaTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'f': //if
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 7) {
                            currStates.add(22);
                            System.out.println("Went from state 7 to state 22");
                        }
                        helpStdHexaTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'g': //begin
                    for(int i = 0; i < prevStates.size(); i++) {
                        switch((int)prevStates.get(i)) {
                            case 10:
                                currStates.add(11);
                                System.out.println("Went from state 10 to state 11");
                                break;
                            case 20:
                                currStates.add(21);
                                System.out.println("Went from state 20 to state 21");
                                break;
                            default:
                                break;
                        }
                        helpTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'h': //then
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 14) {
                            currStates.add(15);
                                System.out.println("Went from state 14 to state 15");
                        }
                        helpTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'i': //begin, if
                    for(int i = 0; i < prevStates.size(); i++) {
                        switch((int)prevStates.get(i)) {
                            case 0:
                                currStates.add(7);
                                System.out.println("Went from state 0 to state 7");
                                break;
                            case 21:
                                currStates.add(16);
                                System.out.println("Went from state 21 to state 16");
                                break;
                            default:
                                break;
                        }
                        helpTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'l': //else
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 3) {
                            currStates.add(4);
                                System.out.println("Went from state 3 to state 4");
                        }
                        helpTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'm': //program
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 13) {
                            currStates.add(22);
                                System.out.println("Went from state 13 to state 22");
                        }
                        helpTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'n': //begin, end, then
                    for(int i = 0; i < prevStates.size(); i++) {
                        switch((int)prevStates.get(i)) {
                            case 3:
                                currStates.add(6);
                                System.out.println("Went from state 3 to state 5");
                                break;
                            case 16:
                                currStates.add(22);
                                System.out.println("Went from state 16 to state 22");
                                break;
                            default:
                                break;
                        }
                        helpTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'o': //program
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 9) {
                            currStates.add(10);
                                System.out.println("Went from state 9 to state 10");
                        }
                        helpTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'p': //program
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 0) {
                            currStates.add(8);
                                System.out.println("Went from state 0 to state 8");
                        }
                        helpTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'r': //program, var
                    for(int i = 0; i < prevStates.size(); i++) {
                        switch((int)prevStates.get(i)) {
                            case 8:
                                currStates.add(9);
                                System.out.println("Went from state 8 to state 9");
                                break;
                            case 11:
                                currStates.add(12);
                                System.out.println("Went from state 11 to state 12");
                                break;
                            case 18:
                                currStates.add(22);
                                System.out.println("Went from state 18 to state 22");
                                break;
                            default:
                                break;
                        }
                        helpTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 's': //else
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 4) {
                            currStates.add(5);
                                System.out.println("Went from state 4 to state 5");
                        }
                        helpTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 't': //then
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 0) {
                            currStates.add(14);
                                System.out.println("Went from state 0 to state 14");
                        }
                        helpTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'v': //var
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 0) {
                            currStates.add(17);
                                System.out.println("Went from state 0 to state 17");
                        }
                        helpTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case 'X':
                case 'x': //Not found in reserved identifiers, but contain special hexadecimal transition
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 23) {
                            currStates.add(26);
                                System.out.println("Went from state 23 to state 26");
                        }
                        helpTransitions(prevStates, currStates, i);
                    }
                    nextIteration(currStates, iden);
                    break;
                case '_':
                    for(int i = 0; i < prevStates.size(); i++) {
                        switch((int)prevStates.get(i)) {
                            case 0:
                                currStates.add(1);
                                System.out.println("Went from state 0 to state 1");
                                break;
                            case 1:
                            case 2:
                                currStates.add(1);
                                System.out.println("Stayed in state "+prevStates.get(i));
                                break;
                            default:
                                System.out.println("Dropped state "+prevStates.get(i));
                        }
                    }
                    nextIteration(currStates, iden);
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    for(int i = 0; i < prevStates.size(); i++) {
                        helpNumTransitions(prevStates, currStates, i, Integer.parseInt(""+iden.charAt(0)));
                    }
                    nextIteration(currStates, iden);
                    break;
                case '.':
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 24) {
                            currStates.add(27);
                            System.out.println("Went from state 24 to state 27");
                        } else
                            System.out.println("Dropped state "+prevStates.get(i));
                    }
                    nextIteration(currStates, iden);
                    break;
                default:
                    System.out.println("Identificador inválido.");
                    break;
                case '-':
                case '+':
                    for(int i = 0; i < prevStates.size(); i++) {
                        if((int)prevStates.get(i) == 28) {
                            currStates.add(29);
                            System.out.println("Went from state 28 to state 29");
                        }
                    }
                    nextIteration(currStates, iden);
            }
            
        }
        
        public void checkStdTransitions(ArrayList prevStates, ArrayList currStates) {
            for(int i = 0; i < prevStates.size(); i++) {
                helpTransitions(prevStates, currStates, i);
            }
        }
        
        public void helpTransitions(ArrayList prevStates, ArrayList currStates, int i) {
            switch((int)prevStates.get(i)) {
                    case 0:
                        currStates.add(2);
                        System.out.println("Went from state 0 to state 2");
                        break;
                    case 1:
                        currStates.add(2);
                        System.out.println("Went from state 1 to state 2");
                        break;
                    case 2:
                        currStates.add(2);
                        System.out.println("Stayed in state 2");
                        break;
                    default:
                        if(currStates.size() < i+1)
                            System.out.println("Dropped state "+prevStates.get(i));
                        break;
            }
        }
        
        public void helpNumTransitions(ArrayList prevStates, ArrayList currStates, int i, int num) {
            if(num >= 0 && num <= 7)
                helpOctalTransitions(prevStates, currStates, i);
            
            switch((int)prevStates.get(i)) {
                case 0:
                    if(num == 0) {
                        currStates.add(23);
                        System.out.println("Went from state 0 to state 23");
                    } else {
                        currStates.add(24);
                        System.out.println("Went from state 0 to state 24");
                    }
                    break;
                case 1:
                case 2:
                case 24:
                case 27:
                case 30:
                case 31:
                    currStates.add((int)prevStates.get(i));
                    System.out.println("Stayed in state "+prevStates.get(i));
                    break;
                case 26:
                    currStates.add(31);
                    System.out.println("Went from state 26 to state 31");
                    break;
                case 29:
                    currStates.add(30);
                    System.out.println("Went from state 29 to state 30");
                    break;
                default:
                    break;
            }
        }
        
        public void helpStdHexaTransitions(ArrayList prevStates, ArrayList currStates, int i) {
            switch((int)prevStates.get(i)) {
                case 26:
                    currStates.add(31);
                    System.out.println("Went from state 26 to state 31");
                    break;
                case 31:
                    currStates.add(31);
                    System.out.println("Stayed in state 31");
                    break;
                default:
                    break;
            }
            helpTransitions(prevStates, currStates, i);
        }
        
        public void helpOctalTransitions(ArrayList prevStates, ArrayList currStates, int i) {
            switch((int)prevStates.get(i)) {
                case 23:
                    currStates.add(25);
                    System.out.println("Went from state 23 to state 25");
                    break;
                case 25:
                    currStates.add(25);
                    System.out.println("Stayed in state 25");
                    break;
                default:
                    break;
            }
        }
        
        public void nextIteration(ArrayList currStates, String iden) {
            if(iden.length() == 1)
                recognise("", currStates);
            else
                recognise(iden.substring(1), currStates);
        }
    }
}