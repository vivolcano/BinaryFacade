import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinOpsTest {
    public static BinOps binOps;

    @BeforeEach
    void setUp() {
        binOps = new BinOps();
    }

    @Test
    void sum() {

        // arrange
        final String value1 = "10";
        final String value2 = "11";
        final String expected = "101";

        // act
        final String actual = binOps.sum(value1, value2);

        // assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    void mult() {

        // arrange
        final String value1 = "10";
        final String value2 = "11";
        final String expected = "110";

        // act
        final String actual = binOps.mult(value1, value2);

        // assert
        Assert.assertEquals(expected, actual);
    }
}