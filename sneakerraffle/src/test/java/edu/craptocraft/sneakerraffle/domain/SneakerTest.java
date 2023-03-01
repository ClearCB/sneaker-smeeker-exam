package edu.craptocraft.sneakerraffle.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

public class SneakerTest {
    public static Sneaker sneaker;

    @BeforeClass
    public static void createSneaker() {
        sneaker = new Sneaker("Nike", "Green", 101.11);
    }

    @Test
    public void constructorTest() {
        assertNotNull(sneaker);

    }

    @Test
    public void sizesRunTest() {

        sneaker.sizesRun(Sizes.CUARENTA, Sizes.CUARENTAYDOS);
        String[] testArray = new String[] { "7.0 US", "7.5 US", "8.0 US", "8.5 US" };

        assertEquals(testArray.length, sneaker.sizes().length);

    }

    @Test
    public void toStringTest() {

        assertEquals("Nike\n\t\tGreen\n\t\t101.11 €\n\t\t[7.0 US, 7.5 US, 8.0 US, 8.5 US]", sneaker.toString());
    }

    @Test
    public void listEntries() {

        Entry entry = new Entry("abelcasasccb@gmail.com");
        entry.setUserName("Abel");
        entry.setSize(Sizes.CUARENTAYMEDIO);
        entry.setAddress("A mi casa 12 1-1");
        entry.setTotal(123.0);
        entry.payment("haha@paypal.eu");

        sneaker.getBucket().add(entry);
        assertEquals("[abelcasasccb@gmail.com]", sneaker.listEntries());

    }

}
