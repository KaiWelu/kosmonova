package org.kosmonova.model;

public class Kosmonaut {
    private int id;
    private String firstName;
    private String lastName;
    private int agencyId;
    private int missionId;

    public Kosmonaut(int id, String firstName, String lastName, int agencyId, int missionId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.agencyId = agencyId;
        this.missionId = missionId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }

    public int getMissionId() {
        return missionId;
    }

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }
}
