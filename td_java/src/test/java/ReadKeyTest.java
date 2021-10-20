package test.java;


import org.apache.commons.lang3.StringUtils;
import org.germain.tool.ManaBox;
import org.junit.Assert;
import org.junit.Test;


public class ReadKeyTest {
    @Test
    public void readKeyTest() {
        // La clé cryptée donnée plus haut
        String keyCrypted = "6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==";
        // La clé décryptée que nous devrions obtenir
        String keyDecrypted = "CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c";
        // le test d'égalité entre la clé attendue et la sortie de la méthode de la librairie. Si le décryptage ne fonctionne pas nous aurons le message définit ici
        Assert.assertEquals("La librairie de décryptage est mal installée", keyDecrypted, ManaBox.decrypt(keyCrypted));

    }
    @Test
    public void stripAccent() {
        //la chaine normal
        String chaineAccent = "ça c'est l'été doré.";
        //la chaine sans charactère diacritique
        String chaineAttendue = "ca c'est l'ete dore.";
        //le test d'égalité
        Assert.assertEquals("la librairie de lang est mal installée", chaineAttendue, StringUtils.stripAccents(chaineAccent));
    }


}
