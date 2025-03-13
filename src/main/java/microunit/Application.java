package microunit;

import microunit.framework.TestRunner;

public class Application {
    public static void main(String[] args) throws Exception {
        final var runner = new TestRunner(AdderTest.class);

        runner.runTests();
    }
}
