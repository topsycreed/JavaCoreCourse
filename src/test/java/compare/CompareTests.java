package compare;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CompareTests {

    private List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ivan", 25, 50000d));
        employees.add(new Employee("Kirill", 30, 60000d));
        employees.add(new Employee("Stepan", 20, 75000d));
        employees.add(new Employee("Maxim", 21, 25000d));
        employees.add(new Employee("Leonid", 34, 150000d));
        return employees;
    }

    //Note
    //Comparable should be used when you compare instances of the same class.
    //Comparator can be used to compare instances of different classes.
    @Test
    void sortTest() {
        List<Employee> employees = getEmployees();

        //with compareTo from Employee class (default sorting)
        Collections.sort(employees);

        //print results
        for (Object employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    void salaryComparatorTest() {
        List<Employee> employees = getEmployees();

        //with salaryComparator from Employee class
        Collections.sort(employees, Employee.salaryComparator);

        //print results
        for (Object employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    void comparatorClassTest() {
        List<Employee> employees = getEmployees();
        //with comparator separate class
        Collections.sort(employees, new SalaryComparator());

        //print results
        for (Object employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    void customComparatorTest() {
        List<Employee> employees = getEmployees();

        //with custom Comparator
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                double s1 = o1.getSalary();
                double s2 = o2.getSalary();
                return Double.compare(s1, s2);
            }
        });

        //print results
        for (Object employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    void customLambdaTest() {
        List<Employee> employees = getEmployees();

        //the same with lambda
        Collections.sort(employees, (o1, o2) -> {
            double s1 = o1.getSalary();
            double s2 = o2.getSalary();
            return Double.compare(s1, s2);
        });

        //print results
        for (Object employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    void customLambdaDescTest() {
        List<Employee> employees = getEmployees();

        //the same with lambda for desc order
        Collections.sort(employees, (o1, o2) -> {
            double s1 = o1.getSalary();
            double s2 = o2.getSalary();
            return Double.compare(s2, s1);
        });

        //print results
        for (Object employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    void withCustomSortTest() {
        List<Employee> employees = getEmployees();

        //without using Collections
        employees.sort((o1, o2) -> {
            double s1 = o1.getSalary();
            double s2 = o2.getSalary();
            return Double.compare(s1, s2);
        });

        //print results
        for (Object employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    void usingComparatorComparingTest() {
        List<Employee> employees = getEmployees();

        //Using Java 8
        employees.sort(Comparator.comparingDouble(Employee::getSalary));

        //Using Java 8 desc
//        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        //print results
        for (Object employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    void streamApiTest() {
        List<Employee> employees = getEmployees();

        //Using streamApi
        employees = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());

        //Using streamApi desc
        employees = employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder())).collect(Collectors.toList());

        //print results
        for (Object employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
