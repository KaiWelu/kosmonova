package org.kosmonova.model;

public class Departments {
    private int id;
    private String name;
    private String city;
    private String country;
    private String continent;

    public Departments(int id, String name, String city, String country, String continent) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
        this.continent = continent;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
