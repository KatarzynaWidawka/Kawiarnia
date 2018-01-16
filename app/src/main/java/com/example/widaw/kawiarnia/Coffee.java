package com.example.widaw.kawiarnia;

/**
 * Created by widaw on 16.01.2018.
 */

public class Coffee {
    public Coffee(String NazwaKawy) {
       this.NazwaKawy = NazwaKawy;
    }

    private String NazwaKawy;

    public String getNazwaKawy() {
        return this.NazwaKawy;
    }

    public void setNazwaKawy(String nazwaKawy) {
        this.NazwaKawy = NazwaKawy;
    }
}
