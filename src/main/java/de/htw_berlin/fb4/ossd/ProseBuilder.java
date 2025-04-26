package de.htw_berlin.fb4.ossd;

import java.util.ArrayList;
import java.util.List;

public class ProseBuilder {

    private List<Sentence> sentences;

    public ProseBuilder(){
        sentences = new ArrayList<>();
    }
    public void register(Sentence sentence){
        sentences.add(sentence);
    }

    public String build(){
        StringBuilder builder = new StringBuilder();
        sentences.stream().forEach(x -> {builder.append(x.get()); builder.append("\n");});
        return builder.toString();
    }
}
