package streamAPI;

import java.util.List;

public class Book {
    private String title;
    private Integer year;
    private List<String> authors;

    public Book(String title, Integer year, List<String> authors) {
        this.title = title;
        this.year = year;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
