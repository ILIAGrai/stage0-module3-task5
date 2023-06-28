package lang.print.gaps.task5;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberDividerTest extends BaseIOTest {

    @Test
    void dividerDividesCorrectly() {
        NumberDivider divider = new NumberDivider();

        divider.divide();

        assertEquals("3.8\n", updateLineSpliterators(outContent.toString()));
    }
}