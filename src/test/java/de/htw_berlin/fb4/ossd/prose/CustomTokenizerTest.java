package de.htw_berlin.fb4.ossd.prose;

import junit.framework.TestCase;

import java.util.List;

public class CustomTokenizerTest extends TestCase {

    public void testCustomTokenizer() {
        CustomStringTokenizer tokenizer = new CustomStringTokenizer();
        String input = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr";
        List<String> inputTokens = List.of(
                "Lorem", "ipsum", "dolor", "sit", "amet,", "consetetur", "sadipscing", "elitr"
        );

        List<String> outputTokens = tokenizer.tokenize(input);
        assertEquals(inputTokens, outputTokens);
    }
}
