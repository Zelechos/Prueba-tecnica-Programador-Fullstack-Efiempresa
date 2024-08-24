package org.example.first;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class that implements the logic to check if it is possible to write a note
 * using the words available in a magazine.
 */
public class FirstChallenge {

    /**
     * Check if it is possible to write the note using the words available in the magazine.
     *
     * @param note     The note you want to write.
     * @param magazine The magazine with the available words.
     * @return true if it is possible to write the note, false otherwise.
     */
    public boolean canWriteNote(String note, String magazine) {

        // Validation if the note or magazine does not have words
        if (note.isEmpty() || magazine.isEmpty()) return false;

        // Separate the words of the note and the magazine
        List<String> wordsNote = Arrays.stream(note.split("\\s+")).toList();
        List<String> wordsMagazine = Arrays.stream(magazine.split("\\s+")).toList();

        // Create a map to count the words in the magazine
        Map<String, Integer> countMagazine = new HashMap<>();

        // Count the frequency of each word in the magazine
        wordsMagazine.forEach(word -> countMagazine.put(word, countMagazine.getOrDefault(word, 0) + 1));

        // Check if the note can be built with the magazine
        return wordsNote.stream().allMatch(word -> {
            int count = countMagazine.getOrDefault(word, 0);
            if (count == 0) return false; // No hay suficientes palabras, no se puede escribir la nota
            countMagazine.put(word, count - 1);
            return true;
        });
    }
}
