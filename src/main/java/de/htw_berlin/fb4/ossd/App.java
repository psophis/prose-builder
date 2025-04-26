package de.htw_berlin.fb4.ossd;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        Sentence s1 = new Sentence() {
            @Override
            public String get() {
                return "Haste mal ne Mark!";
            }

        };

        Sentence s2 = new Sentence() {
            @Override
            public String get() {
                return "Ne, ich hab keine Mark!";
            }
        };

        ProseBuilder builder = new ProseBuilder();
        builder.register(s1);
        builder.register(s2);
        String result = builder.build();
        System.out.println( result);
    }
}
