package org.launchcode.techjobs.oo;

import java.util.Objects;
import static java.util.Objects.isNull;

public class Job {

    private final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.


    //constructor id
    public Job() {
        id = nextId;
        nextId++;
    }

    //constructor five fields
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        if (isNull(name) && isNull(employer) && isNull(location) && isNull(positionType) && isNull(coreCompetency)) {
            return "OOPS! This job does not seem to exist.";
        } else return (
                "\nID: " + id +
                        "\nName: " + ((isNull(name) || name.isBlank()) ? "Data not available" : name) +
                        "\nEmployer: " + ((isNull(employer) || employer.toString().isBlank()) ? "Data not available" : employer) +
                        "\nLocation: " + ((isNull(location) || location.toString().isBlank()) ? "Data not available" : location) +
                        "\nPosition Type: " + ((isNull(positionType) || positionType.toString().isBlank()) ? "Data not available" : positionType) +
                        "\nCore Competency: " + ((isNull(coreCompetency) || coreCompetency.toString().isBlank()) ? "Data not available" : coreCompetency) + "\n");
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    // getter for id
    public int getId() {
        return id;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    }



