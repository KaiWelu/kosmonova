package org.kosmonova.model;

public class Rocket {
    private int id;
    private String name;
    private int agencyId;
    private int launchCost;
    private int payloadLeo;

    public Rocket(int id, String name, int agencyId, int launchCost, int payloadLeo) {
        this.id = id;
        this.name = name;
        this.agencyId = agencyId;
        this.launchCost = launchCost;
        this.payloadLeo = payloadLeo;
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

    public int getLaunchCost() {
        return launchCost;
    }

    public void setLaunchCost(int launchCost) {
        this.launchCost = launchCost;
    }

    public int getPayloadLeo() {
        return payloadLeo;
    }

    public void setPayloadLeo(int payloadLeo) {
        this.payloadLeo = payloadLeo;
    }
}
