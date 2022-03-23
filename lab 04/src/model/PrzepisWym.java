package model;

import java.util.ArrayList;
import java.util.List;

public class PrzepisWym {

    public PrzepisWym(int id, String nazwa, String opis, List<WymProdukt> wymProdukt) {

        this.id = id;
        this.setNazwa(nazwa);
        this.setOpis(opis);
        this.wymProdukt = wymProdukt;
    }

    private int id;
    private String nazwa;
    private String opis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private List<WymProdukt> wymProdukt = new ArrayList<>();

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public List<WymProdukt> getWymProdukt() {
        return wymProdukt;
    }

    public void setWymProdukt(List<WymProdukt> wymProdukt) {
        this.wymProdukt = wymProdukt;
    }



}
