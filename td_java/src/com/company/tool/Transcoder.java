package com.company.tool;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

public class Transcoder {
    private HashMap<String, String> cleDecode = new HashMap<>();
    private HashMap<String, String> cleCode = new HashMap<>();


    /**
     * écrit la hashmap en suivant la clé de référence
     */
    public Transcoder(String cle) {
        char value1 = 'A';
        char value2 = 'A';

        for (int c = 0; c < cle.length(); c++) {
            String result = "";
            result += value1;
            result += value2;
            cleDecode.put(result, cle.substring(c, c + 1));
            cleCode.put(cle.substring(c, c + 1), result);
            value2++;
            if (value2 > 'Z') {
                value1++;
                value2 = 'A';
            }
        }
    }

    /**
     * prend le message, le compare a la hashmap et le code/décode selon le besoin
     */
    public String decodeMessage(String text) {
        String resultat = "";
        text = StringUtils.stripAccents(text);
        for (int i = 0; i < text.length(); i += 2) {
            String decypt = text.substring(i, i + 2);
            resultat += cleDecode.get(decypt);
        }
        return resultat;
    }

    /**
     * prend le message, le compare a la hashmap et le code/décode selon le besoin
     */
    public String codeMessage(String text) {
        String resultat = "";
        text = StringUtils.stripAccents(text);
        for (int i = 0; i < text.length(); i++) {
            String decypt = text.substring(i, i + 1);
            resultat += cleCode.get(decypt);
        }
        return resultat;
    }

}
