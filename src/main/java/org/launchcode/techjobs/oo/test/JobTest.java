package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
                Job testJob2 = new Job();

                assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob1.getName() instanceof String);
        assertEquals(testJob1.getName(), "Product tester");

        assertTrue(testJob1.getEmployer() instanceof Employer);
        assertEquals(testJob1.getEmployer().getValue(), "ACME");

        assertTrue(testJob1.getLocation() instanceof Location);
        assertEquals(testJob1.getLocation().getValue(), "Desert");

        assertTrue(testJob1.getPositionType() instanceof PositionType);
        assertEquals(testJob1.getPositionType().getValue(), "Quality control");

        assertTrue(testJob1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob1.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(testJob1, testJob2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

    }
    }
