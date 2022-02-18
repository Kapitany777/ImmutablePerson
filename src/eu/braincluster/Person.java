package eu.braincluster;

/**
 * A simple immutable Person class
 */
public final class Person
{
    private String firstName;
    private String lastName;

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
        final StringBuilder sb = new StringBuilder("Person{");

        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');

        return sb.toString();
    }
}
