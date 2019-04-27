package designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bernardinorosa on 27/04/19.
 */
public class Fiction implements BookCategory {

    ArrayList FictionBooks = new ArrayList();


    public Fiction() {
        FictionBooks.add("Harry Potter");
        FictionBooks.add("Lord of the Rings");
    }

    @Override
    public List getList() {
        return FictionBooks;
    }
}
