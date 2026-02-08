package academy.devdojo.maratonajava.javacore.ZZK_JUnit.service;

import academy.devdojo.maratonajava.javacore.ZZK_JUnit.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private PersonService personService;

    @BeforeEach // metodo executado antes de cada teste unitário
    public void setUp() {
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }

    @Test
    @DisplayName("A person should be not adult when the age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult when the age is greater or equal than 18")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualThan18() {
        assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException if person is null")
    void isAdult_shouldThrowNullPointerException_ifPersonIsNull() {
        Assertions.assertThrows(
                NullPointerException.class,
                () -> personService.isAdult(null), "Person can't be null");
    }

    @Test
    @DisplayName("Should return list with only adult")
    void filterRemovingNotAdult_returnListWithAdultOnly_WhenListOfPersonWithAdultIsPassed() {
        List<Person> personList = List.of(new Person(17), new Person(18), new Person(18));
        assertEquals(2, personService.filterRemovingNotAdult(personList).size());
    }
}