import jdk.jshell.execution.JdiDefaultExecutionControl;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    Deck<String> deck;

    @BeforeEach
    void createStart() {
        deck = new Deck<>();
    }

    @org.junit.jupiter.api.Test
    void size() {
        // before
        assertEquals(0, deck.size());

        deck.add("A");
        deck.add("B");
        deck.add("C");

        // after
        assertEquals(3, deck.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        // before
        assertTrue(deck.isEmpty());

        deck.add("A");
        deck.add("B");
        deck.add("C");

        // after
        assertFalse(deck.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void contains() {
        deck.add("A");
        deck.add("B");
        deck.add("C");

        // add
        assertTrue(deck.contains("A"));
        // not add
        assertFalse(deck.contains("Z"));
    }

    @org.junit.jupiter.api.Test
    void add() {
        deck.add("A");

        // updates
        assertEquals(1, deck.size());
        assertEquals("A", deck.get(0));

        // outside range
        assertNull(deck.get(1));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        deck.add("A");
        deck.add("B");
        deck.add("C");
        deck.add("D");

        // test
        deck.remove("A");

        // elements
        assertEquals("B", deck.get(0));
        assertEquals("C", deck.get(1));
        assertEquals("D", deck.get(2));

        // size
        assertEquals(3, deck.size());

        // outside range
        assertNull(deck.get(-1));
        assertNull(deck.get(3));
    }

    @org.junit.jupiter.api.Test
    void clear() {
        deck.add("A");
        deck.add("B");
        deck.add("C");
        deck.add("D");

        deck.clear();

        // size
        assertEquals(0, deck.size());

        // old elements inside
        assertNull(deck.get(0));
        assertNull(deck.get(1));
        assertNull(deck.get(2));
        assertNull(deck.get(3));
    }

    @org.junit.jupiter.api.Test
    void get() {
        deck.add("A");

        // range
        assertEquals("A", deck.get(0));

        // outside range
        assertNull(deck.get(-1));
        assertNull(deck.get(1));
    }

    @org.junit.jupiter.api.Test
    void set() {
        deck.add("A");
        deck.add("B");
        deck.add("C");

        // add range
        deck.set(0, "D");
        deck.set(1, "D");
        deck.set(2, "D");

        // add outside range
        deck.set(3, "D");


        // assert inside
        assertEquals("D", deck.get(0));
        assertEquals("D", deck.get(1));
        assertEquals("D", deck.get(2));

        // assert outside
        assertNull(deck.get(-1));
        assertNull(deck.get(3));

        // size
        assertEquals(3, deck.size());
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        deck.add("A");
        deck.add("B");
        deck.add("C");

        deck.add(0, "NEW_START");
        deck.add(3, "OLD_END");

        // size
        assertEquals(5, deck.size());

        // elements
        assertEquals("NEW_START", deck.get(0));
        assertEquals("A", deck.get(1));
        assertEquals("B", deck.get(2));
        assertEquals("OLD_END", deck.get(3));
        assertEquals("C", deck.get(4));

        // outside
        assertNull(deck.get(-1));
        assertNull(deck.get(5));
    }

    @org.junit.jupiter.api.Test
    void testRemove() {
        deck.add("A");
        deck.add("B");
        deck.add("C");

        deck.remove(0);

        // range
        assertEquals("B", deck.get(0));
        assertEquals("C", deck.get(1));

        // outside
        assertNull(deck.get(-1));
        assertNull(deck.get(2));
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
        deck.add("A");
        deck.add("B");
        deck.add("C");
        deck.add("C");

        // range
        assertEquals(0, deck.indexOf("A"));
        assertEquals(1, deck.indexOf("B"));
        assertEquals(2, deck.indexOf("C"));

        // outside
        assertEquals(-1, deck.indexOf("D"));
    }
}