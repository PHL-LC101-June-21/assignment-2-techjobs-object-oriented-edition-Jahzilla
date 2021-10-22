package org.launchcode.techjobs.oo;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public String toString(){

        ArrayList<String> jobValues = new ArrayList<String>();
        jobValues.add(Integer.toString(id));
        jobValues.add(name);
        jobValues.add(employer.getValue());
        jobValues.add(location.getValue());
        jobValues.add(positionType.getValue());
        jobValues.add(coreCompetency.getValue());

        for(int i = 0; i < jobValues.size(); i++){
            if(jobValues.get(i) == null || jobValues.get(i) == ""){
                jobValues.set(i, "Data not available");
            }
        }
        return "\n" + "ID: " + jobValues.get(0)
                + "\n" + "Name: " + jobValues.get(1)
                + "\n" + "Employer: " + jobValues.get(2)
                + "\n" + "Location: " + jobValues.get(3)
                + "\n" + "Position Type: " + jobValues.get(4)
                + "\n" + "Core Competency: " + jobValues.get(5)
                + "\n";
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
