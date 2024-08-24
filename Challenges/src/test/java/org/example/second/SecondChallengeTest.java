package org.example.second;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Tests for the Second Challenge class.
 */
public class SecondChallengeTest {

    @Test
    public void testNotifyStudents() {
        // Arrange
        SecondChallenge secondChallenge = new SecondChallenge();
        String headquarters = "Málaga";

        // Prepare sample student lists
        List<String> listA = Arrays.asList("Ana Málaga", "Luis Madrid", "Pedro Málaga");
        List<String> listB = Arrays.asList("Luis Málaga", "Sofia Málaga", "Ana Madrid");
        List<String> listC = Arrays.asList("Pedro Málaga", "Luis Málaga", "Sofia Madrid");

        // Act
        Set<String> result = secondChallenge.notifyStudents(listA, listB, listC, headquarters);

        // Assert
        assertEquals(4, result.size()); // Expecting 4 students in total
        assertTrue(result.contains("Ana Málaga")); // Ana is from Malaga
        assertTrue(result.contains("Pedro Málaga")); // Pedro is from Malaga
        assertTrue(result.contains("Luis Málaga")); // Luis is from Malaga
    }

    @Test
    public void testNotifyStudentsSingleList() {
        // Arrange
        List<String> listA = List.of("Juan Málaga", "María Málaga", "Pedro Barcelona");
        String headquarters = "Málaga";

        SecondChallenge secondChallenge = new SecondChallenge();

        // Act
        Set<String> result = secondChallenge.notifyStudents(listA, List.of(), List.of(), headquarters);

        // Assert
        assertTrue(result.contains("Juan Málaga")); // Juan is from Málaga
        assertTrue(result.contains("María Málaga")); // María is from Málaga
        assertFalse(result.contains("Pedro Barcelona")); // Pedro is not from Málaga
    }

    @Test
    public void testNotifyStudentsTwoLists() {
        // Arrange
        List<String> listA = List.of("Juan Málaga", "María Málaga");
        List<String> listB = List.of("María Málaga", "Carlos Madrid");
        String headquarters = "Málaga";

        SecondChallenge secondChallenge = new SecondChallenge();

        // Act
        Set<String> result = secondChallenge.notifyStudents(listA, listB, List.of(), headquarters);

        // Assert
        assertTrue(result.contains("Juan Málaga")); // Juan is from Malaga
        assertTrue(result.contains("María Málaga")); // María is from Malaga
        assertFalse(result.contains("Carlos Madrid")); // Carlos is not from Malaga
    }

    @Test
    public void testNoDuplicatesInNotification() {
        // Arrange
        List<String> listA = List.of("Juan Madrid", "María Málaga", "María Barcelona");
        List<String> listB = List.of("María Málaga", "Carlos Málaga");
        List<String> listC = List.of("María Málaga", "Ana Madrid");
        String headquarters = "Málaga";

        SecondChallenge secondChallenge = new SecondChallenge();

        // Act
        Set<String> result = secondChallenge.notifyStudents(listA, listB, listC, headquarters);

        // Assert
        assertEquals(2, result.size()); // We hope there are no duplicates
    }
}
