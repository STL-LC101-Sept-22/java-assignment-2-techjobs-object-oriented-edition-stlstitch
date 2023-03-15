package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {
    public int getId() {
        return id;
    }

    private int id;
    private static int nextId = 1;
    private String value;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Employer employer;
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    private Location location;
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    private PositionType positionType;
    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    private CoreCompetency coreCompetency;

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString(){

        String aName;
        String aEmployer;
        String aLocation;
        String aPositionType;
        String aCoreCompetency;

        if (getName() == null) {
            aName = "Data not available";
        } else {
            aName = getName();
        }

        if (employer == null || employer.getValue() == "") {
            aEmployer = "Data not available";
        } else {
            aEmployer = employer.getValue();
        }

        if (location == null || location.getValue() == "") {
            aLocation = "Data not available";
        } else {
            aLocation = location.getValue();
        }

        if (positionType == null || positionType.getValue() == "") {
            aPositionType = "Data not available";
        } else {
            aPositionType = positionType.getValue();
        }

        if (coreCompetency == null || coreCompetency.getValue() == "") {
            aCoreCompetency = "Data not available";
        } else {
            aCoreCompetency = coreCompetency.getValue();
        }


        return "\n ID: " + getId() + "\n" +
                "Name: " + aName + "\n" +
                "Employer: " + aEmployer + "\n" +
                "Location: " + aLocation + "\n" +
                "Position Type: " + aPositionType + "\n" +
                "Core Competency: " + aCoreCompetency + "\n";


    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
