/* SPDX-FileCopyrightText: 2025 Johannes Kristan
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 *  SPDX-License-Identifier: MIT
 */
package de.htw_berlin.fb4.ossd.prose.example;

import de.htw_berlin.fb4.ossd.prose.CustomStringTokenizer;
import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;

public class App
{
    public static void main( String[] args )
    {

        Sentence s1 = () -> "Haste mal ne Mark?";

        ProseBuilder builder = new ProseBuilder();
        builder.register(s1);
        builder.register(new ExampleSentence());
        String result = builder.get();
        System.out.println( result);

        CustomStringTokenizer tokenizer = new CustomStringTokenizer();
        System.out.println(tokenizer.tokenize(result));
    }
}
