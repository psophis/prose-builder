/* SPDX-FileCopyrightText: 2025 Damaris Liedtke
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 *  SPDX-License-Identifier: MIT
 */
package de.htw_berlin.fb4.ossd.prose.example;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class AnotherExampleSentence implements Sentence {
    @Override
    public String get() {
        return "Die Zukunft gehört denen, die an die Schönheit ihrer Träume glauben."; // (Eleanor Roosevelt);
    }
}
