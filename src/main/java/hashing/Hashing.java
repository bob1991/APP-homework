package hashing;

/**
 * Created by bobkuipers on 01/03/2018.
 */
public class Hashing {


    public int hash(String value, int tableSize){
        int hashValue = 0;

        for(int i = 0; i < value.length();i++){
            hashValue = 37 * hashValue + value.charAt(i);
        }

        hashValue %= tableSize;

        if(hashValue < 0){
            hashValue += tableSize;
        }

        return hashValue;
    }


    public int hashMod10(int value){
        return value % 10;
    }


}
