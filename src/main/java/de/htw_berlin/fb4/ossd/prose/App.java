package de.htw_berlin.fb4.ossd.prose;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        Sentence s1 = () -> "Haste mal ne Mark!";

        Sentence s2 = () -> "Ne, ich hab keine Mark!";

        ProseBuilder builder = new ProseBuilder();
        builder.register(s1);
        builder.register(s2);
        String result = builder.get();
        System.out.println( result);
    }
}
