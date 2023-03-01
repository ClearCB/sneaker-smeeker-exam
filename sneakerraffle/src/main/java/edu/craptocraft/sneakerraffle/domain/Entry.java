package edu.craptocraft.sneakerraffle.domain;

public class Entry {
    private String email;
    private String userName;
    private String address;
    private Double total;
    private String payment;
    private Sizes size;

    public Entry() {
        // Crear constructor vacio para evitar problemas
    };

    public Entry(String email) {
        this.email = email;
    }

    void setSize(Sizes size) {
        this.size = Sizes.valueOf(size.name());
    }

    Sizes getSize() {
        return this.size;
    }

    String email() {
        return this.email;
    }

    String getUserName() {
        return this.userName;
    }

    void setUserName(String userName) {
        this.userName = userName;
    }

    String getAddress() {
        return this.address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    Double getTotal() {
        return this.total;
    }

    void setTotal(Double total) {
        this.total = total;
    }

    String payment() {
        return this.payment;
    }

    void payment(String payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object obj) {
        
        if ( (obj instanceof Entry ) ) {

            return ( (this.email() == ((Entry) obj).email() ) || ( ((Entry) obj).payment() == this.payment() ) );

        }

        return false;


    }

    @Override
    public int hashCode() {
        return (this.email()+this.payment()).hashCode();
    }

    public String getPayment() {
        return this.payment;
    }
    @Override
    public String toString() {

        StringBuilder information = new StringBuilder();

        information.append("\n\t\temail: " + this.email());
        information.append("\n\t\tSize: " + this.getSize().name());
        information.append("\n\t\tAddress: " + this.getAddress());
        information.append("\n\t\tPayment: " + this.payment());
        information.append("\n\t\tTotal: " + this.total + " €\n");

        return information.toString();
    }

}
