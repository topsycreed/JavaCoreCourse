package stream;

import org.junit.jupiter.api.Test;
import streamAPI.Job;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamSortingTests {

    private List<Job> getJobs() {
        List<Job> accounts = new ArrayList<>();
        accounts.add(new Job("QA", "Test", 1000));
        accounts.add(new Job("Dev", "Develop", 2000));
        accounts.add(new Job("Analyst", "Write docs", 1500));
        return accounts;
    }

    @Test
    void sorting() {
        List<Job> jobsBySalary = getJobs().stream().sorted(Comparator.comparing(Job::getSalary)).toList();
        //the same as Comparator.naturalOrder()

        //reverse order
        List<Job> jobsBySalaryDesc = getJobs().stream().sorted(Comparator.comparing(Job::getSalary, Comparator.reverseOrder())).toList();

        System.out.println(jobsBySalary);
        System.out.println(jobsBySalaryDesc);
    }
}
