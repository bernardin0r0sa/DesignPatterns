package designpattern.iterator;

import java.util.List;

/**
 * Created by bernardinorosa on 27/04/19.
 */
public class BookStore {


    public static void main(String[] args) {

        Fiction fictionBooks = new Fiction();
        Romance romanceBooks = new Romance();

        printBooks(fictionBooks.getList());
        printBooks(romanceBooks.getList());


    }

    public static void printBooks (List category) {
        category.forEach(System.out::println);
    }

}
