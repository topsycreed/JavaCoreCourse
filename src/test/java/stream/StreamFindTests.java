package stream;

import org.junit.jupiter.api.Test;
import streamAPI.Job;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamFindTests {

    private List<Job> getJobs() {
        List<Job> accounts = new ArrayList<>();
        accounts.add(new Job("QA", "Test", 1000));
        accounts.add(new Job("Dev", "Develop", 2000));
        accounts.add(new Job("Analyst", "Write docs", 1500));
        return accounts;
    }

    @Test
    void findTest() {
        Optional<Job> foundJob = getJobs().stream().filter(job -> job.getSalary() > 1000).findFirst();
        if (foundJob.isPresent()) {
            System.out.println(foundJob.get());
        } else {
            throw new RuntimeException("Cannot find a job for such criterion");
        }

    }

    @Test
    void findTestOrElse() {
        Job foundJob = getJobs().stream().filter(job -> job.getSalary() > 5000).findFirst().orElse(new Job("Waiter", "Serve food", 100));
        System.out.println(foundJob);
    }

    @Test
    void findTestOrElseGet() {
        Job foundJob = getJobs().stream().filter(job -> job.getSalary() > 5000).findFirst().orElseGet(() -> getJobs().get(0));
        System.out.println(foundJob);
    }

    @Test
    void findTestOrElseThrow() {
        Job foundJob = getJobs().stream().filter(job -> job.getSalary() > 5000).findFirst().orElseThrow(() -> new RuntimeException("Cannot find a job for such criterion"));
        System.out.println(foundJob);
    }
}
