package edu.craptocraft.sneakerraffle.domain;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

public class Sneaker implements Raffle {

    private String marca;
    private String color;
    private Double precio;
    private String[] sizes;
    private Bucket bucket = new Bucket();

    public Sneaker(String marca, String color, Double precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    String getMarca() {
        return this.marca;
    }

    Bucket getBucket() {
        return this.bucket;

    }

    String getColor() {
        return this.color;
    }

    public Double price() {
        return this.precio;
    }

    String[] sizes() {
        return this.sizes;
    }

    @Override
    public void sizesRun(Sizes firstSize, Sizes secondSize) {

        Set<Sizes> sizesRange = EnumSet.range(firstSize, secondSize);

        sizes = sizesRange.stream().map(Sizes::getUSsize).toArray(String[]::new);

    }

    public void register(Entry... entry) {

        for (int i = 0; i < entry.length; i++) {
            this.getBucket().add(entry[i]);
        }
    }

    public void cancel(Entry entry) {

        this.getBucket().delete(entry);
    }

    @Override
    public Integer totalEntries() {
        return this.getBucket().totalEntries();
    }

    public String listEntries() {

        String[] listEntries = this.getBucket().entries().stream().map(Entry::email).toArray(String[]::new);

        return Arrays.toString(listEntries);
    }

    public Entry draw() {

        return this.getBucket().draw().isPresent()? this.getBucket().draw().get() : null;

    }

    @Override
    public String toString() {
        StringBuilder informacion = new StringBuilder();

        informacion.append(this.getMarca());
        informacion.append("\n\t\t" + this.getColor());
        informacion.append("\n\t\t" + this.price() + " \u20AC");
        informacion.append("\n\t\t" + Arrays.toString(this.sizes()));
        return informacion.toString();
    }
}
