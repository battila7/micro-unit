package microunit.framework;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class TestRunner {
    private final Class<?> testClass;

    public TestRunner(final Class<?> testClass) {
        this.testClass = testClass;
    }

    public void runTests() throws Exception {
        final var testMethods = findMethodsAnnotatedWith(testClass, Test.class);
        final var testClassInstance = testClass.getConstructor().newInstance();

        for (final var testMethod : testMethods) {
            System.out.println("Running test: " + testMethod.getName());

            testMethod.invoke(testClassInstance);
        }
    }

    private List<Method> findMethodsAnnotatedWith(
            final Class<?> klass,
            final Class<? extends Annotation> annotation
    ) {
        return Arrays.stream(klass.getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(annotation))
                .toList();
    }
}
