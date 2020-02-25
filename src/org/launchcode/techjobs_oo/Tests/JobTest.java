package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JobTest {
    Job test_job;
    Job test_job_two;
    @Before
    public void createJobObject(){
        Employer shakeShack = new Employer("Shake Shack");
        Location portland = new Location("Portland, Oregon");
        PositionType frontOfHouse = new PositionType("Front of House");
        CoreCompetency cashHandling = new CoreCompetency("Cash Handling");
        test_job = new Job("Cashier", shakeShack, portland,frontOfHouse,cashHandling);

        Employer mcDonalds = new Employer("McDonalds");
        Location sanDiego = new Location("San Diego, California");
        PositionType backOfHouse = new PositionType("Back of House");
        CoreCompetency cooking = new CoreCompetency("Cooking");
        test_job_two = new Job("Line Cook", mcDonalds, sanDiego,backOfHouse, cooking);
    }

    @Test
    public void testSettingJobId(){
    assertFalse(test_job.equals(test_job_two));
    }
    @Test
    public void testJobConstructorSetsAllFields(){
       Job test_job_three = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job_three.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality(){
        Job test_job_three = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job_four = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job_four.equals(test_job_three));
    }
}
