package edu.craptocraft.sneakerraffle.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class EntryTest {
    public static Entry entry;
    public static Entry entryEmpty;

    @BeforeClass
    public static void crearEntry() {
        entry = new Entry("abelcasasccb@gmail.com");
        entryEmpty = new Entry();
    }

    @Test
    public void constructorTest() {

        assertNotNull(entry);

    }

    // Setters
    @Test
    public void settersAndGettersTest() {

        assertEquals("abelcasasccb@gmail.com", entry.email());

        entry.setUserName("Abel");
        entry.setSize(Sizes.CUARENTAYMEDIO);
        entry.setAddress("A mi casa 12 1-1");
        entry.setTotal(123.0);
        entry.payment("haha@paypal.eu");

        assertEquals("Abel", entry.getUserName());
        assertEquals("A mi casa 12 1-1", entry.getAddress());
        assertEquals(123.0, entry.getTotal(), 0);
        assertEquals("haha@paypal.eu", entry.payment());

    }

    @Test
    public void toStringTest(){

        entry.setUserName("Abel");
        entry.setSize(Sizes.CUARENTAYMEDIO);
        entry.setAddress("A mi casa 12 1-1");
        entry.setTotal(123.0);
        entry.payment("haha@paypal.eu");

        assertEquals("\n\t\temail: abelcasasccb@gmail.com\n\t\tSize: CUARENTAYMEDIO\n\t\tAddress: A mi casa 12 1-1\n\t\tPayment: haha@paypal.eu\n\t\tTotal: 123.0 €\n", entry.toString());
    }

    @Test
    public void equalsTest(){

        entry.setUserName("Abel");
        entry.setSize(Sizes.CUARENTAYMEDIO);
        entry.setAddress("A mi casa 12 1-1");
        entry.setTotal(123.0);
        entry.payment("hah@paypal.eu");

        entryEmpty = new Entry("abelsasccb@gmail.com");
        entryEmpty.setUserName("Abel");
        entryEmpty.setSize(Sizes.CUARENTAYMEDIO);
        entryEmpty.setAddress("A mi casa 12 1-1");
        entryEmpty.setTotal(123.0);
        entryEmpty.payment("haha@paypal.eu");

        assertFalse(entry.equals(entryEmpty));
        assertTrue(entry.equals(entry));
        
    }

}
