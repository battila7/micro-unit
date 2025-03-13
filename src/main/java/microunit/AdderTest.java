package microunit;

import microunit.framework.Assertions;
import microunit.framework.Test;

public class AdderTest {
    @Test
    public void shouldAddOnePlusOneCorrectly() {
        // Given
        final Adder sut = new Adder();
        final int expected = 2;

        // When
        final int actual = sut.add(1, 1);

        // Then
        Assertions.equals(actual, expected);
    }
}
