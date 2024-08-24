package org.example.second;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Class that implements the logic to obtain all the students from Malaga
 * enrolled in Mathematics and French
 * to send the respective emails
 */
public class SecondChallenge {

    /**
     * Notifies students based on their headquarters.
     *
     * @param listA        List of students from subject A.
     * @param listB        List of students from subject B.
     * @param listC        List of students from both subjects A and B.
     * @param headquarters The headquarters (sede) to filter students.
     * @return Set of student names from Malaga.
     */
    public Set<String> notifyStudents(
            List<String> listA,
            List<String> listB,
            List<String> listC,
            String headquarters) {

        // Combine all student names from the three lists
        Set<String> allStudents = new HashSet<>();
        allStudents.addAll(listA);
        allStudents.addAll(listB);
        allStudents.addAll(listC);

        // Filter students from Malaga to send Emails
        return allStudents.stream()
                .filter(student -> student.contains(headquarters))
                .collect(Collectors.toSet());
    }
}
