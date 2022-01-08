package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviesItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest {
    private PosterManager manager = new PosterManager();

    private MoviesItem first = new MoviesItem(1, "Don't look up", "comedy");
    private MoviesItem second = new MoviesItem(2, "No time to die", "detective");
    private MoviesItem third = new MoviesItem(3, "12th date", "romance");
    private MoviesItem fourth = new MoviesItem(4, "Man of black", "fantastic");
    private MoviesItem fifth = new MoviesItem(5, "The deep house", "horror");
    private MoviesItem sixth = new MoviesItem(6, "Very bad mommies", "comedy");
    private MoviesItem seventh = new MoviesItem(7, "Starry time", "fantastic");
    private MoviesItem eighth = new MoviesItem(8, "Stranger", "horror");
    private MoviesItem ninth = new MoviesItem(9, "Letter for you", "romance");
    private MoviesItem tenth = new MoviesItem(10, "Sherlock Holmes", "detective");
    private MoviesItem eleventh = new MoviesItem(11, "Alone at home", "comedy");

    //вывести последние 10, при этом в менеджере хранится больше фильмов
    @Test
    public void shouldShowLastTenMovies() {
        int count = 10;
        PosterManager manager = new PosterManager(count);
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
        MoviesItem[] actual = manager.getLast();
        MoviesItem[] expected = new MoviesItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    // вывести все фильмы хранящиеся в менеджере
    @Test
    public void shouldShowMovies() {
        PosterManager manager = new PosterManager();
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
        MoviesItem[] actual = manager.getLast();
        MoviesItem[] expected = new MoviesItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    //вывести больше фильмов чем хранится в менеджере
    @Test
    public void shouldShowLastTenMoviesIfLessMovies() {
        int count = 10;
        PosterManager manager = new PosterManager(count);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        MoviesItem[] actual = manager.getLast();
        MoviesItem[] expected = new MoviesItem[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);

    }
}