package edu.craptocraft.sneakerraffle.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class PaypalTest {
    public static Paypal paypal;
    // "summer@paypal.com", 200d
    // "morty@paypal.com", 200d
    // "birdman@paypal.com", 200d
    // "squanchy@paypal.com", 200d
    @BeforeClass
    public static void createPaypal(){
        paypal = new Paypal();
    }

    @Test
    public void constructorTest(){

        assertNotNull(paypal);
        assertEquals(4, paypal.users().size());


    }

    @Test
    public void autenticationTest(){

        assertFalse(paypal.autentication("abelcasas"));
        
        assertTrue(paypal.autentication("summer@paypal.com"));
    }

    @Test
    public void payTest(){

        assertEquals(200d, paypal.credit("summer@paypal.com"),0);
        paypal.pay("summer@paypal.com", 50d);
        assertEquals(150d, paypal.credit("summer@paypal.com"),0);
    } 
    
}
