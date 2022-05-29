package stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import streamAPI.Job;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.summingDouble;

public class StreamCollectorsTests {

    private List<Job> getJobs() {
        List<Job> accounts = new ArrayList<>();
        accounts.add(new Job("QA", "Test", 1000));
        accounts.add(new Job("Dev", "Develop", 2000));
        accounts.add(new Job("Analyst", "Write docs", 1500));
        return accounts;
    }

    @Test
    void simplyCollect() {
        List<Job> jobs = getJobs().stream().collect(Collectors.toList());
//        Set<Job> unicJobs = accountsSet.stream().collect(Collectors.toSet());
//        LinkedList<Account> accounts = accountStream.collect(Collectors.toCollection(LinkedList::new));
    }

    @Test
    void produceValues() {
        Double sum = getJobs().stream()
                .collect(summingDouble(Job::getSalary));

        Double average = getJobs().stream()
                .collect(averagingDouble(Job::getSalary));

        System.out.println("Sum" + sum);
        System.out.println("Average" + average);
    }
}
