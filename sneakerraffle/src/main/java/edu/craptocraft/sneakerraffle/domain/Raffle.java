package edu.craptocraft.sneakerraffle.domain;

public interface Raffle {
    
    void sizesRun(Sizes firstSize, Sizes secondSize);

    Double price();

    void register(Entry... entry);

    void cancel(Entry entry);
    
    Integer totalEntries();
    
    String listEntries();

    Entry draw();

    
}
