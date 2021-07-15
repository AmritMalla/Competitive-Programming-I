import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        HashMap<Character, Integer> hm = new HashMap<>();
        char highestFreqchar = str.charAt(0);
        for(char c: str.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c) + 1);
            }else{
                hm.put(c, 1);
            }
        }

        for(char c: hm.keySet()){
            if(hm.get(c) > hm.get(highestFreqchar)){
                highestFreqchar = c;
            }
        }
        System.out.println(highestFreqchar);
    }

}