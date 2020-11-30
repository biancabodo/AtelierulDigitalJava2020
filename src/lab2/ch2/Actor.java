package lab2.ch2;

import javax.naming.PartialResultException;

public class Actor {
    public String nume;
    public Integer varsta;
    public Premiu[] premii;

    public Actor(String nume, Integer varsta, Premiu[] premii){
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }
}
