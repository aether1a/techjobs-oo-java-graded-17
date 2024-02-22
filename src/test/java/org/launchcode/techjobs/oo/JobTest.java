package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class JobTest {
    //TODO: Create your unit tests here
    Job testJob;
@Before
    public void createJobObject() {
        testJob =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testToStringReturnMessageForEmptyJob() {
        assertEquals(new Job().toString(), "OOPS! This job does not seem to exist.");
    }

    @Test
    public void testSettingJobId() {
        assertNotEquals(new Job().getId(), new Job().getId());
    }

    @Test
    public void testJobsForEquality() {
        Job testJob2 = new Job(testJob.getName(), testJob.getEmployer(), testJob.getLocation(), testJob.getPositionType(), testJob.getCoreCompetency());
        assertNotEquals(testJob, testJob2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String strJob = testJob.toString();
        assertEquals('\n', strJob.charAt(0));
        assertEquals('\n', strJob.charAt(strJob.length() - 1));
    }



    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(testJob.getName(), "Product tester");
        assertEquals(testJob.getEmployer().toString(), "ACME");
        assertEquals(testJob.getLocation().toString(), "Desert");
        assertEquals(testJob.getPositionType().toString(), "Quality control");
        assertEquals(testJob.getCoreCompetency().toString(), "Persistence");

        assertTrue(testJob.getName() instanceof String);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String strJob = testJob.toString();
        assertTrue( strJob.contains( "ID: " + testJob.getId() ));
        assertTrue( strJob.contains( "Name: " + testJob.getName() ));
        assertTrue( strJob.contains( "Employer: " + testJob.getEmployer() ));
        assertTrue( strJob.contains( "Location: " + testJob.getLocation() ));
        assertTrue( strJob.contains( "Position Type: " + testJob.getPositionType() ));
        assertTrue( strJob.contains( "Core Competency: " + testJob.getCoreCompetency() ));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        String strJob = testJob.toString();
        assertFalse( strJob.contains("Data not available") );
        testJob.setCoreCompetency( new CoreCompetency("") );
        strJob = testJob.toString();
        assertTrue( strJob.contains("Data not available") );
    }
}