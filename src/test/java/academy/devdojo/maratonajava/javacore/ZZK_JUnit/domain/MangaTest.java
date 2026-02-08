package academy.devdojo.maratonajava.javacore.ZZK_JUnit.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private Manga manga1;
    private Manga manga2;

    @BeforeEach
    public void setUp() {
        manga1 = new Manga("Kimetsu no Yaiba", 24);
        manga2 = new Manga("Kimetsu no Yaiba", 24);
    }

    @Test
    public void accessors_ReturnData_WhenInitialized() {
        assertEquals("Kimetsu no Yaiba", manga1.name());
        assertEquals(24, manga1.episodes());
    }

    @Test
    public void equals_ReturnTrue_WhenObjectsAreTheSame() {
        assertEquals(manga1, manga2);
    }

    @Test
    public void hashCode_ReturnTrue_WhenObjectsAreTheSame() {
        assertEquals(manga1.hashCode(), manga2.hashCode());
    }

    @Test
    public void constructor_throwNullPointerException_WhenNameIsNull() {
        assertThrows(NullPointerException.class,
                () -> new Manga(null, 12));
    }

    @Test
    public void isRecord_ReturnTrue_WhenCalledFromManga() {
        assertTrue(Manga.class.isRecord());
    }
}