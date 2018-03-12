package DataStructures.SymbolChecker;


import DataStructures.HANStack;

/**
 * Created by bobkuipers on 26/02/2018.
 */
public class BalanceSymbolChecker {
    HANStack<Character> symbolStack = new HANStack<Character>();

    String openChars = "{<[(";

    public boolean testString(String symbols) {
        for(int i = 0;i < symbols.length();i++){
            if(openChars.indexOf(symbols.charAt(i))>= 0){
                symbolStack.push(symbols.charAt(i));
            } else {
                if(!checkIfOpesite(symbols.charAt(i),symbolStack.pop())){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkIfOpesite(char charToCheck,char charFromStack){
        switch (charToCheck){
            case('}'):{
                if(charFromStack == '{') return true;
            }
            case(']'):{
                if(charFromStack == '[') return true;
            }
            case (')'):{
                if(charFromStack == '(') return true;
            }
            case ('>'):{
                if(charFromStack == '<') return true;
            }
         }
        return false;
    }
}
