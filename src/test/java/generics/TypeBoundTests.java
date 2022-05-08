package generics;

import generics.typeBounds.Books;
import generics.typeBounds.Comics;
import generics.typeBounds.Library;
import org.junit.jupiter.api.Test;

public class TypeBoundTests {

    @Test
    void simple() {
        Library<Books> library1 = new Library<>();
        Library<Comics> library2 = new Library<>();
        //Type parameter 'generics.typeBounds.Computers' is not within its bound; should extend 'generics.typeBounds.Books
        //Library<Computers> library3 = new Library<>();
    }
}
