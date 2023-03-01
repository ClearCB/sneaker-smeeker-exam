package edu.craptocraft.sneakerraffle.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class BucketTest {
    public static Bucket bucket;

    @BeforeClass
    public static void bucket() {
        bucket = new Bucket();
    }

    @Test
    public void constructorTest() {

        assertNotNull(bucket);

    }

    @Test
    public void entriesTest() {

        Entry entry = new Entry("abelcasasccb@gmail.com");
        entry.setUserName("Abel");
        entry.setSize(Sizes.CUARENTAYMEDIO);
        entry.setAddress("A mi casa 12 1-1");
        entry.setTotal(123.0);
        entry.payment("haha@paypal.eu");

        Entry entrySec = new Entry("abelcasas@gmail.com");
        entrySec.setUserName("Abel");
        entrySec.setSize(Sizes.CUARENTAYMEDIO);
        entrySec.setAddress("A mi casa 12 1-1");
        entrySec.setTotal(123.0);
        entrySec.payment("eheh@paypal.eu");

        bucket.add(entry);
        assertTrue(bucket.isDoubleEntry(entry));

        bucket.delete(entry);
        assertFalse(bucket.isDoubleEntry(entry));

        bucket.add(entry);
        bucket.add(entrySec);

        assertEquals(2, bucket.totalEntries(), 0);

        Entry entryTres = new Entry("abelcasccb@gmail.com");
        entryTres.setUserName("Abel");
        entryTres.setSize(Sizes.CUARENTAYMEDIO);
        entryTres.setAddress("A mi casa 12 1-1");
        entryTres.setTotal(123.0);
        entryTres.payment("eheh@paypal.eu");

        bucket.add(entryTres);

        assertEquals(2, bucket.totalEntries(), 0);

    }

    @Test
    public void drawTest() {

        bucket.entries().clear();

        Entry entry = new Entry("abelcasccb@gmail.com");
        entry.setUserName("Abel");
        entry.setSize(Sizes.CUARENTAYMEDIO);
        entry.setAddress("A mi casa 12 1-1");
        entry.setTotal(123.0);
        entry.payment("eheh@paypal.eu");

        bucket.add(entry);

        assertEquals("abelcasccb@gmail.com", bucket.draw().get().email());

        bucket.entries().clear();

    }
}
