package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviesItem;
//import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest {
    private PosterManager manager = new PosterManager();
    private PosterManager manager1 = new PosterManager();
    private MoviesItem first = new MoviesItem(1, 1, "first", 1, 1);
    private MoviesItem second = new MoviesItem(2, 2, "second", 1, 1);
    private MoviesItem third = new MoviesItem(3, 3, "third", 1, 1);
    private MoviesItem fourth = new MoviesItem(4, 4, "fourth", 1, 1);
    private MoviesItem fifth = new MoviesItem(5, 5, "fifth", 1, 1);
    private MoviesItem sixth = new MoviesItem(6, 6, "sixth", 1, 1);
    private MoviesItem seventh = new MoviesItem(7, 7, "seventh", 1, 1);
    private MoviesItem eighth = new MoviesItem(8, 8, "eighth", 1, 1);
    private MoviesItem ninth = new MoviesItem(9, 9, "ninth", 1, 1);
    private MoviesItem tenth = new MoviesItem(10, 10, "tenth", 1, 1);
    private MoviesItem eleventh = new MoviesItem(11, 11, "eleventh", 1, 1);


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager1.add(first);
        manager1.add(second);
        manager1.add(third);
        manager1.add(fourth);
        manager1.add(fifth);
        manager1.add(sixth);
        manager1.add(seventh);
        manager1.add(eighth);
        manager1.add(ninth);
        manager1.add(tenth);
        manager1.add(eleventh);
    }

    @Test
    public void shouldShowLastTenMovies() {
        MoviesItem[] actual = manager.getLast(10);
        MoviesItem[] expected = new MoviesItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowLastTenMoviesIfLessMovies() {
        manager.decreasePoster(5);
        MoviesItem[] actual = manager.getLastTen();
        MoviesItem[] expected = new MoviesItem[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldShowLastTenMoviesIfMoreMovies() {
        MoviesItem[] actual = manager.getLastTen();
        MoviesItem[] expected = new MoviesItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second };
        assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldShowLastMovies() {
        MoviesItem[] actual = manager1.getLast(2);
        MoviesItem[] expected = new MoviesItem[]{eleventh, tenth};
        assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldShowLastMoviesIfLessMovies() {
        manager1.decreasePoster(5);
        MoviesItem[] actual = manager1.getLast(6);
        MoviesItem[] expected = new MoviesItem[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
}