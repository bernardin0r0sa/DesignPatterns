package designpattern.singleton;

/**
 * Created by bernardinorosa on 15/04/19.
 */
public class LogFacilityLazy {


    private static LogFacilityLazy uniqueLogInstance;

    private LogFacilityLazy() {}

    public static LogFacilityLazy uniqueLogInstance() {
        if (uniqueLogInstance == null) {
            uniqueLogInstance = new LogFacilityLazy();
        }
        return uniqueLogInstance;
    }

    public String describe() {return "Classic Singleton";}

}
