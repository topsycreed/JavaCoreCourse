package streamAPI;

public class Job {
    private String title;
    private String description;
    private Double salary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Job(String title, String description, double salary) {
        this.title = title;
        this.description = description;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", salary=" + salary +
                '}';
    }
}
