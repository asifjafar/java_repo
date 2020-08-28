package Oracle;

/**
 * Created by prasun.pallav on 12/17/2018.
 */
public class GarbageCollector {
    public static void main(String args[]) {
        GarbageCollector g1 = new GarbageCollector();
        GarbageCollector g2 = new GarbageCollector();
        g1=null;
        System.gc();
        g2=null;
        Runtime.getRuntime().gc();
    }
    protected void finalize() throws Throwable{
        System.out.println("Garbage Collecter called...");
        System.out.println("Garbage Collected " + this);
    }
}
