package designpattern.singleton;

/**
 * Created by bernardinorosa on 15/04/19.
 */
public class LogFacilityLazyThreadSafe {


    private static LogFacilityLazyThreadSafe uniqueLogInstance = new LogFacilityLazyThreadSafe();

    private LogFacilityLazyThreadSafe() {}

    public static synchronized LogFacilityLazyThreadSafe uniqueLogInstance() {
        if (uniqueLogInstance == null) {
            uniqueLogInstance = new LogFacilityLazyThreadSafe();
        }
        return uniqueLogInstance;
    }

    public String describe() {return "Static Lazy Thread Safe";}

}
