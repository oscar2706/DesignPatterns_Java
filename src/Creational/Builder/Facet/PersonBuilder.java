package Creational.Builder.Facet;

// builder facade
class PersonBuilder {
    // the object we're going to build
    protected Person person = new Person(); // reference!

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public Person build() {
        return person;
    }
}
