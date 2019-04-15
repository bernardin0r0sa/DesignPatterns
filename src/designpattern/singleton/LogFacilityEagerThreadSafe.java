package designpattern.singleton;

/**
 * Created by bernardinorosa on 15/04/19.
 */
public class LogFacilityEagerThreadSafe {

    private static LogFacilityEagerThreadSafe uniqueLogInstance = new LogFacilityEagerThreadSafe();

    private LogFacilityEagerThreadSafe() {}

    public static LogFacilityEagerThreadSafe uniqueLogInstance() {
        return uniqueLogInstance;
    }

    public String describe() {
        return "Static Eager Thread Safe";
    }
}
