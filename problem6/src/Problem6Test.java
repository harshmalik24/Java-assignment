import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem6Test {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void countVowels() {
    }

    @org.junit.jupiter.api.Test
    void stringWithMostVowels() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }



    @Test
    public void testStringWithMostVowels() {
        String[] strings = {"Sunshine", "Umbrella", "Major", "Resourceful"};
        assertEquals("Resourceful", Problem6.stringWithMostVowels(strings));
    }

    @Test
    public void testStringWithMostVowelsWithEmptyArray() {
        String[] strings = {};
        assertEquals("", Problem6.stringWithMostVowels(strings));
    }

    @Test
    public void testStringWithMostVowelsWithSingleString() {
        String[] strings = {"Football"};
        assertEquals("Football", Problem6.stringWithMostVowels(strings));
    }

    @Test
    public void testStringWithMostVowelsWithEqualVowels() {
        String[] strings = {"Sunshine", "Umbrella"};
        assertEquals("Sunshine", Problem6.stringWithMostVowels(strings));
    }

    @Test
    public void testStringWithMostVowelsWithNoVowels() {
        String[] strings = {"Rhythm", "Gym", "Fly"};
        assertEquals("", Problem6.stringWithMostVowels(strings));
    }

    @Test
    public void testStringWithMostVowelsWithWhitespace() {
        String[] strings = {"Hello World", "Java is easy", "Coding in python"};
        assertEquals("Java is easy", Problem6.stringWithMostVowels(strings));
    }

}