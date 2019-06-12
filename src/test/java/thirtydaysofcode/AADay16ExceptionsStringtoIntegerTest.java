package thirtydaysofcode;

//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;

class AADay16ExceptionsStringtoIntegerTest {

    @Test
    void NumberTest() {
        assertThat(AADay16ExceptionsStringtoInteger.parseInteger("12"), is(true));
        assertThat(AADay16ExceptionsStringtoInteger.parseInteger("-312"), is(true));
        assertThat(AADay16ExceptionsStringtoInteger.parseInteger("-3.12"), is(true));
        assertThat(AADay16ExceptionsStringtoInteger.parseInteger("-3.12.34"), is(false));
        assertThat(AADay16ExceptionsStringtoInteger.parseInteger("-"), is(false));
        assertThat(AADay16ExceptionsStringtoInteger.parseInteger("a"), is(false));
    }

}