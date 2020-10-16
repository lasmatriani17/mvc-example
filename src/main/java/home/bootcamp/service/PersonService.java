package home.bootcamp.service;

import home.bootcamp.model.Person;

import java.util.List;

public interface PersonService {
    void addPerson(Person p);
    void updatePerson(Person p);
    List<Person> listPersons();
    Person getPersonById(int id);
    void removePerson(int id);
}
