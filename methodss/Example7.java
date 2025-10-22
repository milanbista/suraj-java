package methodss;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Date;
import java.util.List;

public class Example7 {

    static int g = 0;
    public static void main(String[] args) {

        for (int i = 0; i < 10_000_000; i++) {
            String temp = new String("temporary" + i);
        }

        String name = "helo";
        String ram = new String("ram");
        for (GarbageCollectorMXBean gc : ManagementFactory.getGarbageCollectorMXBeans()) {
            System.out.println("GC Name: " + gc.getName());
            System.out.println("  - Collection count: " + gc.getCollectionCount());
            System.out.println("  - Total collection time (ms): " + gc.getCollectionTime());
            System.out.println();
        }

        System.out.println(name);
        System.out.println(ram);

    }


}
