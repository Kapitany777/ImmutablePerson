package eu.braincluster;

/**
 * A simple immutable person class
 */
public final class Person
{
    private final String firstName;
    private final String lastName;

    /**
     * Person constructor
     *
     * @param firstName The first name of the person
     * @param lastName  The last name of the person
     */
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    @Override
    public String toString()
    {
        return "Person{" + "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
