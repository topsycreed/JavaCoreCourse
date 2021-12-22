package stream;

import org.junit.jupiter.api.Test;
import streamAPI.Job;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapTests {

    @Test
    void numbers() {
        List<Double> numbers = List.of(6.28, 84.0);

        List<Double> famousNumbers = numbers.stream()
                .map(number -> number / 2) // divide each number in the stream by 2
                .collect(Collectors.toList()); // collect transformed numbers to a new list
        System.out.println(famousNumbers);
    }

    @Test
    void getFieldFromObject() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("QA", "Testing any software", 1000));
        jobs.add(new Job("Dev", "Creating software so testers could earn money", 2000));

        List<String> titles = jobs.stream()
                .map(Job::getTitle) // get title of each job
                .collect(Collectors.toList()); // collect titles to a new list

        System.out.println(titles);
    }

    @Test
    void getSalaryInRublesFromObject() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("QA", "Testing any software", 1000));
        jobs.add(new Job("Dev", "Creating software so testers could earn money", 2000));

        List<Double> salariesInRubles = jobs.stream()
                .map(job -> job.getSalary() * 60)
                .collect(Collectors.toList());

        System.out.println(salariesInRubles);
    }

    @Test
    void getSalaryAsStringFromObject() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("QA", "Testing any software", 1000));
        jobs.add(new Job("Dev", "Creating software so testers could earn money", 2000));

        List<String> salaries = jobs.stream()
                .map(job -> job.getSalary() + "$")
                .collect(Collectors.toList());

        System.out.println(salaries);
    }
}
