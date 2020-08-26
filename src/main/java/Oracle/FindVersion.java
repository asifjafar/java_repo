package Oracle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by prasun.pallav on 2/26/2019.
 */
class Version implements Comparable<Version> {
    private String version;

    final String get() {
        return this.version;
    }

    Version(String version) {
        this.version = version;
    }

    public int compareTo(Version that) {
        if (that == null)
            return 1;
        String[] s1 = this.get().split("\\.");
        String[] s2 = that.get().split("\\.");
        int length = Math.max(s1.length, s2.length);
        for (int i = 0; i < length; i++) {
            int i1 = i < s1.length ? Integer.parseInt(s1[i]) : 0;
            int i2 = i < s2.length ? Integer.parseInt(s2[i]) : 0;
            if (i1 < i2)
                return -1;
            if (i1 > i2)
                return 1;
        }
        return 0;
    }
}

public class FindVersion {
    final public static void main(String args[]) {
        List<Version> versions = new ArrayList<Version>();
        versions.add(new Version("2.5.30"));
        versions.add(new Version("2.7.2"));
        System.out.println(Collections.min(versions).get()); // return min version
        System.out.println(Collections.max(versions).get()); // return max version
    }
}
