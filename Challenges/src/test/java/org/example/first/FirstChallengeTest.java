package org.example.first;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Tests for the First Challenge class.
 */
public class FirstChallengeTest {

    @Test
    public void testCanWriteNoteSuccessCase() {
        // Arrange
        FirstChallenge firstChallenge = new FirstChallenge();

        // Act & Assert
        assertTrue(firstChallenge.canWriteNote("es un informe", "esto es un simple informe de prueba"));
    }

    @Test
    public void testCanWriteNoteFailedCase() {
        // Arrange
        FirstChallenge firstChallenge = new FirstChallenge();

        // Act & Assert
        assertFalse(firstChallenge.canWriteNote("esto es una prueba", "esto es solo una simple"));
    }

    @Test
    public void testCanWriteNoteCaseEmpty() {
        // Arrange
        FirstChallenge firstChallenge = new FirstChallenge();

        // Act & Assert
        assertFalse(firstChallenge.canWriteNote("", "cualquier cosa"));
        assertFalse(firstChallenge.canWriteNote("cualquier cosa", ""));
    }
}
