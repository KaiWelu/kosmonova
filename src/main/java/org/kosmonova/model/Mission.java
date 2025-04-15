package org.kosmonova.model;

import java.sql.Date;

public class Mission {
    private int id;
    private String name;
    private Date launchDate;
    private int launchSiteId;
    private int agencyId;
    private int rocketId;

    public Mission(int id, String name, Date launchDate, int launchSiteId, int agencyId, int rocketId) {
        this.id = id;
        this.name = name;
        this.launchDate = launchDate;
        this.launchSiteId = launchSiteId;
        this.agencyId = agencyId;
        this.rocketId = rocketId;
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

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public int getLaunchSiteId() {
        return launchSiteId;
    }

    public void setLaunchSiteId(int launchSiteId) {
        this.launchSiteId = launchSiteId;
    }

    public int getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }

    public int getRocketId() {
        return rocketId;
    }

    public void setRocketId(int rocketId) {
        this.rocketId = rocketId;
    }
}
