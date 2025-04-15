package org.kosmonova.model;

public class LaunchSite {
    private int id;
    private String name;
    private int agencyId;
    private String country;
    private String continent;
    private float longitude;
    private float latitude;

    public LaunchSite(int id,
                      String name,
                      int agencyId,
                      String country,
                      String continent,
                      float longitude,
                      float latitude) {
        this.id = id;
        this.name = name;
        this.agencyId = agencyId;
        this.country = country;
        this.continent = continent;
        this.longitude = longitude;
        this.latitude = latitude;
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

    public int getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
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

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
}
