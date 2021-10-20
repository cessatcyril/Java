package com.company.tool;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

public class Transcoder {
    protected String message;
    protected HashMap<String, String> cleDecode = new HashMap<>();
    protected HashMap<String, String> cleCode = new HashMap<>();
    protected String code;
    protected String resultat;

    /**
     * getter pour récupérer le message coder ou décoder selon le besoin
     *
     * @return le message coder ou décoder
     */
    public String getResultat() {
        return resultat;
    }

    /**
     * écrit la hashmap en suivant la clé de référence
     */
    public Transcoder(String cle, String text) {
        code = cle;
        message = StringUtils.stripAccents(text);
        char value1 = 'A';
        char value2 = 'A';

        for (int c = 0; c < code.length(); c++) {
            String result = "";
            result += value1;
            result += value2;
            cleDecode.put(result, code.substring(c, c + 1));
            cleCode.put(code.substring(c, c + 1), result);
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
    public String decodeMessage() {
        resultat = "";
        for (int i = 0; i < message.length(); i += 2) {
            String decypt = message.substring(i, i + 2);
            resultat += cleDecode.get(decypt);
        }
        return resultat;
    }

    /**
     * prend le message, le compare a la hashmap et le code/décode selon le besoin
     */
    public String codeMessage() {
        resultat = "";
        for (int i = 0; i < message.length(); i++) {
            String decypt = message.substring(i, i + 1);
            resultat += cleCode.get(decypt);
        }
        return resultat;
    }

}
