package de.htw_berlin.fb4.ossd.prose;

import java.util.List;

public class CustomStringTokenizer {
    public CustomStringTokenizer() {}

    public List<String> tokenize(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("input cannot be null or empty");
        }

        return List.of(input.trim().split("\\s+"));
    }
}
