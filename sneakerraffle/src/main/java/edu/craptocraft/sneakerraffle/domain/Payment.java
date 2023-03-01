package edu.craptocraft.sneakerraffle.domain;

public interface Payment {
    
    boolean autentication(String payment);

    boolean pay (String payment, Double ammount);

    Double credit(String payment);
}
