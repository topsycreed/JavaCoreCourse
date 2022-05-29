package compare;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        double s1 = o1.getSalary();
        double s2 = o2.getSalary();
        return Double.compare(s1, s2);
    }
}
