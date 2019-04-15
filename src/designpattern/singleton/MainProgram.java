package designpattern.singleton;

/**
 * Created by bernardinorosa on 15/04/19.
 */
public class MainProgram {

    public static void main(String [] args){
        LogFacilityLazyThreadSafe logFacility = LogFacilityLazyThreadSafe.uniqueLogInstance();

        System.out.println(logFacility.describe());
    }
}
