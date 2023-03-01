package edu.craptocraft.sneakerraffle.domain;

import java.util.HashMap;
import java.util.Map;

public class Paypal implements Payment{
    private Map<String, Double> users = new HashMap<String, Double>();

    Paypal(){
        users.putIfAbsent("summer@paypal.com", 200d);
        users.putIfAbsent("morty@paypal.com", 200d);
        users.putIfAbsent("birdman@paypal.com", 200d);
        users.putIfAbsent("squanchy@paypal.com", 200d);
        
    }

    Map<String, Double> users(){

        return this.users;
    }

    public boolean autentication(String payment){

        return this.users().containsKey(payment);
    }

    public Double credit(String payment){
        return this.users().get(payment);
    }

    public boolean pay(String payment, Double ammount){

        if (this.credit(payment)>=ammount) {
            
            this.users().compute(payment, (user, credit) -> credit - ammount);
            return true;
        }
        return false;
    }



}
