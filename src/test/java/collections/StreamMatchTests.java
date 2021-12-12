package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streamAPI.Job;

import java.util.ArrayList;
import java.util.List;

public class StreamMatchTests {

    private List<Job> getJobs() {
        List<Job> accounts = new ArrayList<>();
        accounts.add(new Job("QA", "Test", 1000));
        accounts.add(new Job("Dev", "Develop", 2000));
        accounts.add(new Job("Analyst", "Write docs", 1500));
        return accounts;
    }

    @Test
    void anyMatchTest() {
        boolean isFound = getJobs().stream().anyMatch(job -> job.getSalary() > 1500);
        Assertions.assertTrue(isFound);
    }

    @Test
    void allMatchTest() {
        boolean isFound = getJobs().stream().allMatch(job -> job.getSalary() > 1000);
        Assertions.assertFalse(isFound);
    }

    @Test
    void noneMatchTest() {
        boolean isFound = getJobs().stream().noneMatch(job -> job.getSalary() > 5000);
        Assertions.assertTrue(isFound);
    }
}
