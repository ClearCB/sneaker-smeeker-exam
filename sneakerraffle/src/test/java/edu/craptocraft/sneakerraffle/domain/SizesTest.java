package edu.craptocraft.sneakerraffle.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SizesTest {
    
    @Test
    public void enumSizesTest(){

        assertEquals("TREINTAYNUEVE", Sizes.TREINTAYNUEVE.name());
        assertEquals("CUARENTA", Sizes.CUARENTA.name());

    }
 
    @Test
    public void getUsSizeTest(){

        assertEquals("8.5 US", Sizes.CUARENTAYDOS.getUSsize());
        assertEquals("9.5 US", Sizes.CUARENTAYTRES.getUSsize());
    }
}
