package org.launchcode.techjobs.oo.test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)

public class JobTest {

    @Test
    public void testSettingJobId(){
        Job aTestJob = new Job();
        Job aTestJob2 = new Job();
        assertNotEquals(aTestJob.getId(), aTestJob2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job aTestJob = new Job("TesterGuy", new Employer("TestCompany"), new Location("Testerville"), new PositionType("TesterPosition"),new CoreCompetency("TestingCompetency"));
        assertTrue(aTestJob.getName() instanceof String);
        assertTrue(aTestJob.getEmployer() instanceof Employer);
        assertTrue(aTestJob.getLocation() instanceof  Location);
        assertTrue(aTestJob.getPositionType() instanceof PositionType);
        assertTrue(aTestJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(aTestJob.getName(), "TesterGuy");
        assertEquals(aTestJob.getEmployer().toString(), "TestCompany");
        assertEquals(aTestJob.getLocation().toString(), "Testerville");
        assertEquals(aTestJob.getPositionType().toString(), "TesterPosition");
        assertEquals(aTestJob.getCoreCompetency().toString(), "TestingCompetency");


    }

    @Test
    public void testJobsForEquality(){
        Job aTestJob = new Job("TesterGuy", new Employer("TestCompany"), new Location("Testerville"), new PositionType("TesterPosition"),new CoreCompetency("TestingCompetency"));
        Job aTestJob2 = new Job("TesterGuy", new Employer("TestCompany"), new Location("Testerville"), new PositionType("TesterPosition"),new CoreCompetency("TestingCompetency"));
        assertFalse(aTestJob.equals(aTestJob2));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job aTestJob = new Job("TesterGuy", new Employer("TestCompany"), new Location("Testerville"), new PositionType("TesterPosition"),new CoreCompetency("TestingCompetency"));
        assertEquals(aTestJob.toString().charAt(0),'\n');
        assertEquals(aTestJob.toString().charAt(aTestJob.toString().length() - 1),'\n');
    }

    @Test public void testToStringContainsCorrectLabelsAndData(){
        Job aTestJob = new Job("TesterGuy", new Employer("TestCompany"), new Location("Testerville"), new PositionType("TesterPosition"),new CoreCompetency("TestingCompetency"));
        assertEquals(aTestJob.toString(), "\n" + "ID: " + aTestJob.getId()
                + "\n" + "Name: " + aTestJob.getName()
                + "\n" + "Employer: " + aTestJob.getEmployer()
                + "\n" + "Location: " + aTestJob.getLocation()
                + "\n" + "Position Type: " + aTestJob.getPositionType()
                + "\n" + "Core Competency: " + aTestJob.getCoreCompetency()
                + "\n");

    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job aTestJob = new Job("TesterGuy", new Employer(""), new Location("Testerville"), new PositionType("TesterPosition"),new CoreCompetency("TestingCompetency"));
        assertEquals(aTestJob.toString(), "\n" + "ID: " + aTestJob.getId()
                + "\n" + "Name: " + aTestJob.getName()
                + "\n" + "Employer: " + aTestJob.getEmployer()
                + "\n" + "Location: " + aTestJob.getLocation()
                + "\n" + "Position Type: " + aTestJob.getPositionType()
                + "\n" + "Core Competency: " + aTestJob.getCoreCompetency()
                + "\n");
    }




}

