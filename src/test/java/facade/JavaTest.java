package facade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testOne() {
        DialogBot testGreet = new DialogBot();
        String actual = testGreet.greet("bob");
        String expected = "Hello, bob.";
        assertEquals(expected, actual);
    }

    @Test
    public void testTwo() {
        DialogBot testDialog = new DialogBot();
        String actual = testDialog.greet("");
        String expected = "Hello, my Friend.";
        assertEquals(expected, actual);
    }

    @Test
    public void testThree() {
        DialogBot testUpperCase = new DialogBot();
        String actual = testUpperCase.greet("JERRY");
        String expected = "HELLO JERRY.";
        assertEquals(expected, actual);
    }

    @Test
    public void testFour() {
        DialogBot testTwoNames = new DialogBot();
        String[] names = {"Jill", "Jane"};
        String actual = testTwoNames.greetMore(names);
        String expected = "Hello, Jill & Jane.";
        assertEquals(expected, actual);
    }

    @Test
    public void testFive() {
        DialogBot testManyNames = new DialogBot();
        String[] names = {"Amy", "Brian", "Charlotte"};
        String actual = testManyNames.greetMore(names);
        String expected = "Hello, Amy, Brian, & Charlotte.";
        assertEquals(expected, actual);
    }


    @Test
    public void testSix() {
        DialogBot testMixedNames = new DialogBot();
        String[] names = {"Amy", "BRIAN", "Charlotte"};
        String actual = testMixedNames.greetMore(names);
        String expected = "Hello, Amy, & Charlotte. AND HELLO BRIAN!";
        assertEquals(expected, actual);
    }

    @Test
    public void testSeven() {
        DialogBot testMixedNames = new DialogBot();
        String[] names = {"Bob", "Charlie, Dianne"};
        String actual = testMixedNames.greetMore(names);
        String expected = "Hello, Bob & Charlie, Dianne.";
        assertEquals(expected, actual);
    }

    @Test
    public void testEight() {
        DialogBot testMixedNames = new DialogBot();
        String[] names = {"Bob", "\"Charlie, Dianne\""};
        String actual = testMixedNames.greetMore(names);
        String expected = "Hello, Bob & Charlie, Dianne.";
        assertEquals(expected, actual);
    }
}


