package eu.braincluster;

/**
 * A simple immutable person record
 */
public record PersonRecord(String firstName, String lastName)
{
    // See this: https://www.baeldung.com/java-record-keyword

    public String getFullName()
    {
        return lastName + ", " + firstName;
    }
}
