package microunit.framework;

import java.util.Objects;

public class Assertions {
    public static void equals(final Object lhs, final Object rhs) {
        if (!Objects.equals(lhs, rhs)) {
            throw new AssertionError("Different values: " + lhs + " != " + rhs);
        }
    }
}
