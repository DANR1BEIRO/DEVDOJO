package academy.devdojo.maratonajava.javacore.ZZK_JUnit.service;

import academy.devdojo.maratonajava.javacore.ZZK_JUnit.domain.Person;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class PersonServiceTest {

    @Test
    @DisplayName("A person should be not adult when the age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        assertFalse(personService.isAdult(person));
    }
}