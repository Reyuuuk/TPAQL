package StackTest;

import org.example.TP0.Stack;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    @DisplayName("Test de push et size")
    void testPushAndSize() {
        stack.push(10);
        stack.push(20);
        assertEquals(2, stack.size());
    }

    @Test
    @DisplayName("Test de pop")
    void testPop() {
        stack.push(30);
        stack.push(40);
        assertEquals(40, stack.pop());
        assertEquals(1, stack.size());
    }

    @Test
    @DisplayName("Test de peek")
    void testPeek() {
        stack.push(50);
        assertEquals(50, stack.peek());
        assertEquals(1, stack.size()); // Vérifier que peek ne retire pas l'élément
    }

    @Test
    @DisplayName("Test de isEmpty")
    void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(60);
        assertFalse(stack.isEmpty());
    }

    @Test
    @DisplayName("Test de pop sur une pile vide")
    void testPopOnEmptyStack() {
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    @DisplayName("Test de peek sur une pile vide")
    void testPeekOnEmptyStack() {
        assertThrows(IllegalStateException.class, stack::peek);
    }

    @Test
    @DisplayName("Test d'expansion de la capacité")
    void testExpansionCapacity() {
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        assertEquals(15, stack.size());
        assertEquals(14, stack.peek());
    }
}
