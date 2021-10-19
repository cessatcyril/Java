package test;

import com.company.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClientTest {
    @Test
    public void creationClientTest(){
        Client cli1 = new Client("Paul","AUCHON");
        //On récupère l'heure
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        String heure = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));

        Assertions.assertNotNull(cli1);
        Assertions.assertEquals("Paul",cli1.getPrenom());
        Assertions.assertEquals("AUCHON",cli1.getNom());
        //on vérifie que l'id est bien celle prévue
        Assertions.assertEquals("AU"+heure+"PA",cli1.getId());
    }
}
