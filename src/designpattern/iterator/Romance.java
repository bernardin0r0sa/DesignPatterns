package designpattern.iterator;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bernardinorosa on 27/04/19.
 */
public class Romance implements  BookCategory {

    String [] RomanceBooks = new String[2];

    public  Romance(){
        RomanceBooks[0] = "Still Me";
        RomanceBooks[1] = "The Mister";
    }

    @Override
    public List getList() {
        return Arrays.asList(RomanceBooks);
    }
}
