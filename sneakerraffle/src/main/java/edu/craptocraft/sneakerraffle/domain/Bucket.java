package edu.craptocraft.sneakerraffle.domain;

import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

public class Bucket {
    private Random rand = new Random();
    private Set<Entry> entries = new HashSet<Entry>();

    Bucket() {
    };

    protected Set<Entry> entries() {
        return this.entries;
    }

    public void add(Entry entry) {

        if (!(this.isDoubleEntry(entry))) {
            this.entries().add(entry);
        }

    }

    protected void delete(Entry entry) {
        this.entries().remove(entry);
    }

    protected Integer totalEntries() {

        return this.entries().size();
    }

    public Optional<Entry> draw() {

        return this.entries().stream().skip(this.rand.nextInt(this.entries().size())).findFirst();
    }

    public boolean isDoubleEntry(Entry entry) {

        return this.entries().stream()
                .anyMatch(entry::equals);
    }
}
