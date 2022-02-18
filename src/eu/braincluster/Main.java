package eu.braincluster;

public class Main
{

    public static void main(String[] args)
    {
        Person person1 = new Person("John", "Smith");
        System.out.println(person1);

        var person2 = new Person("Sherlock", "Holmes");
        System.out.println(person2.getLastName() + ", " + person2.getFirstName());

        var person3 = new PersonRecord("John", "Watson");
        System.out.println(person3.lastName() + ", " + person3.firstName());
        System.out.println(person3.getFullName());
        System.out.println(person3);
    }
}
