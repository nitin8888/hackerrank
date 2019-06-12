package thirtydaysofcode;

import java.util.HashMap;
import java.util.Scanner;

public class Day8DictionariesandMaps {
//
//    sam=99912222
//    Not found
//    harry=12299933
    private static final HashMap<String, Integer> NAME_PHONE_MAP = new HashMap<>();

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            // Store maps
            NAME_PHONE_MAP.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            // Retrieve map & format or vu
            Integer nos = NAME_PHONE_MAP.get(s);
            System.out.println(nos != null ? String.format("%s=%d", s, nos) :"Not found");
        }
        in.close();
    }
}
