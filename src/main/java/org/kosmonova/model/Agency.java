package org.kosmonova.model;

public class Agency {
    private int id;
    private String name;

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    private String country;
    private String continent;
    private String acronym;

    public Agency(int id, String name, String country, String continent, String acronym) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.continent = continent;
        this.acronym = acronym;
    }

    // overload to allow construction without id
    public Agency(String name, String country, String continent, String acronym) {
        this.name = name;
        this.country = country;
        this.continent = continent;
        this.acronym = acronym;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
