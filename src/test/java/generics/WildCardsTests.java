package generics;

import generics.typeBounds.Books;
import generics.typeBounds.Comics;
import generics.typeBounds.Computers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WildCardsTests {

    @Test
    void withoutWildcards() {
        List<Comics> comics = new ArrayList<>();
        //List<Books> books = comics; //Required type:List<Books>
    }

    @Test
    void withWildcards() {
        List<Comics> comics = new ArrayList<>();
        List<? extends Books> books = comics;
    }

    @Test
    void upperBoundWildcards() {
        List<? extends Books> library = new ArrayList<>();
        List<Comics> comics = new ArrayList<>();
        library = comics; //works since Comics is a sub-type of Books

        List<Computers> computers = new ArrayList<>();
        //library = computers; // Computers not a sub-type of Books
    }

    @Test
    void upperBoundedMethod(List<? extends Books> books) {
        Books books1 = books.get(0);

        //books.add(new Comics()); //compile-time error
        //books.add(new Books()); //compile-time error
        books.add(null);
    }

    @Test
    void lowerBoundWildcards() {
        List<? super Comics> library = new ArrayList<>();
        List<Comics> comics = new ArrayList<>();
        library = comics; //Comics is the exact super class

        List<Books> books = new ArrayList<>();
        library = books; //Books is a parent class for Comics

        List<Computers> computers = new ArrayList<>();
        //library = computers; //compile-time error, Computers is not a parent class for Comics
    }

    @Test
    void lowerBoundedMethod(List<? super Comics> comics) {
        Object obj = comics.get(0); // it is ok. Object is parent of any class
        //Books books = comics.get(0); // compile-time error
        //Comics comics1 = comics.get(0); // compile-time error

        //comics.add(new Object()); // compile-time error
        //comics.add(new Books()); // compile-time error
        comics.add(new Comics());
        comics.add(null);
    }
}
