package br.com.morse.morse.util;

import java.util.HashMap;
import java.util.Map;

public class Codigo {
    private static Map<String, String> morse = new HashMap<>(){{
        put(".-","A");
        put("-...","B");
        put("-.-.","C");
        put("-..","D");
        put(".","E");
        put("..-.","F");
        put("--.","G");
        put("....","H");
        put("..","I");
        put(".---","J");
        put("-.-","K");
        put(".-..","L");
        put("--","M");
        put("-.","N");
        put("---","O");
        put(".--.","P");
        put("--.-","Q");
        put(".-.","R");
        put("...","S");
        put("-","T");
        put("..-","U");
        put("...-","V");
        put(".--","W");
        put("-..-","X");
        put("-.--","Y");
        put("--..","Z");

        put("-----","0");
        put(".----","1");
        put("..--","2");
        put("...--","3");
        put("....-","4");
        put(".....","5");
        put("-....","6");
        put("--...","7");
        put("---..","8");
        put("----.","9");

    }};
    public static String decifraCodigo(String codigo){
        return morse.get(codigo);
    }

}
