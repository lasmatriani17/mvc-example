package home.bootcamp.dao;

import home.bootcamp.model.Person;

import java.util.List;

public interface PersonDAO {
    public void addPerson(Person p);
    public void updatePerson(Person p);
    List<Person> listPersons();
    Person getPersonById(int id);
    void removePerson(int id);
}
